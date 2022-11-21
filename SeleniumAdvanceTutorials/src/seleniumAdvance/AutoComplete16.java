package seleniumAdvance;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete16 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		//1.example for autocomplete
		
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("S");
		Thread.sleep(4000);
		
		List<WebElement> optionlist= driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		System.out.println(optionlist.size());
		
		for (WebElement webElement : optionlist) {
			
			if (webElement.getText().equals("Selenium")){
			    webElement.click();
			    System.out.println("if part");
			    break;
			}else {
				System.out.println("else part");
			}
		}
	}
}
