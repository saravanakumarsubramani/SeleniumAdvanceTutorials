package seleniumAdvance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample18 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demoqa.com/upload-download");
		driver.get("http://www.leafground.com/pages/upload.html");
		
		
		//1.uploading the file?
		
		//WebElement uploadingbutton=driver.findElement(By.id("uploadFile"));
		//uploadingbutton.click();
		Thread.sleep(3000);
		WebElement choosefile=driver.findElement(By.name("filename"));
		choosefile.sendKeys("D:\\ERP\\Day 3 Bug Report GUI.docx");
		//control changes to windows
		//D:\ERP\Day 3 Bug Report GUI.docx
				
		//StringSelection is used to transfer the normal java string  to plain text 
		Thread.sleep(3000);
			//	String file="D:\\ERP\\Day 3 Bug Report GUI.docx";
				
			//	StringSelection selection=new StringSelection(file);
				
				//toolkit is used to get the access the clipboard and set the content
				
			//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			
				//robot IS USED TO OPERATE THE WINDOWS BASED APPLICATIONS
				Robot robot=new Robot();
				//robot.keyPress(KeyEvent.VK_CONTROL);
				//robot.keyPress(KeyEvent.VK_V);
				//robot.keyRelease(KeyEvent.VK_V);
				//robot.keyRelease(KeyEvent.VK_CONTROL);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
