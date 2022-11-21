package seleniumAdvance;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FileDownloadExample17 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		//1.downloading the link?
		
		WebElement downloadinglink=driver.findElement(By.linkText("Download Excel"));
		downloadinglink.click();
		
		Thread.sleep(3000);
		
		//C:\Users\USER\Downloads
		
		File filelocation=new File("C:\\Users\\USER\\Downloads");
		
		File[] totalfiles=filelocation.listFiles();
		
		for (File file : totalfiles) {
			
			if (file.getName().equals("Download Excel")) {
				System.out.println("file is dowdloaded");
				break; 
			}else {
		    	System.out.println("file is not dowdloaded");
		    }
		}	
	}
}
