package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample19 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		//1.click onthe image and go to home page
		//WebElement firstimagebutton=driver.findElement
			//(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		
	//	firstimagebutton.click();
		
		//2.how to identify the broken image?
		
		WebElement brokenimage=driver.findElement
				(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		//naturalWidth = 0 it is brokenimage
		
		if (brokenimage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("it is an broken image");
		}else {
			System.out.println("the image is not broken");
			
		}
	}

}
