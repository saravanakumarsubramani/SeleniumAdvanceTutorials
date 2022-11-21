package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip14Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		
		//1.tooltip is used find the particular element and get the attribute and 
		//stored in the string and print to output
		WebElement tooltip=driver.findElement(By.id("age"));
		
		String name=tooltip.getAttribute("title");
		System.out.println(name);

	}

}
