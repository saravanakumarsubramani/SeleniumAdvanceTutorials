package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadInfomats {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String UploadURL = "http://demo.guru99.com/test/upload/";
       
		//1.file uploading in guru99
        driver.get(UploadURL);
        
       WebElement choosefile = driver.findElement(By.id("uploadfile_0"));
       
       choosefile.sendKeys("C:\\Users\\USER\\Desktop\\insurance.pdf");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@class='field_check']")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.cssSelector("#submitbutton")).click();
        
        Thread.sleep(5000);
	}

}
