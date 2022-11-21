package seleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");

		//1.example for frames.frame means html inside html
		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();

		//gettext is used to get the text 
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);

		//2.I am inside a nested frame.nested frame means html inside html inside html
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");

		WebElement button2= driver.findElement(By.id("Click1"));
		button2.click();

		//3.find the total number of frames
		//defaultcontent is used to give control frame to original window.  
		driver.switchTo().defaultContent();
		List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
		int size=totalframes.size();
		System.out.println(size);
	}
}
