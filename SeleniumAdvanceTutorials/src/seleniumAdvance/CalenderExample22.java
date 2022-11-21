package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample22 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		//1.using sendkeys
		
		WebElement calender=driver.findElement(By.id("datepicker"));
		//calender.sendKeys("08/10/2022"+Keys.ENTER);
		
		//a[@title='Next']
		
		//2. without using sendkeys
		calender.click();
		WebElement nextbutton=driver.findElement(By.xpath("//a[@title='Next']"));
		nextbutton.click();
		
		//a[contains(text(),'10')]
		
		WebElement datetobegiven=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		
		datetobegiven.click();

	}

}
