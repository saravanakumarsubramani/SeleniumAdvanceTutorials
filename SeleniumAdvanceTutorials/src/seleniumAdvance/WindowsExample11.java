package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class WindowsExample11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		//1.click button to open home page in new window
		//get window handle is used to get old window
		
		WebElement firstbutton=driver.findElement(By.id("home"));
    	firstbutton.click();
    	String oldwindow=driver.getWindowHandle();
    	//get window handles mainly used for get the all windows control
    	//get window handles used for control to new window
    	java.util.Set<String> handles=driver.getWindowHandles();
    	
    	// for each loop is mainly used for iterate to new window
    	//using for each loop is mainly used for store old window and new window to handle
    	for (String newwindow : handles) {
    	
    	//switch to is used for switch the control to new window
    		driver.switchTo().window(newwindow);
		}
    	Thread.sleep(3000);
    	WebElement editbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
		editbox.click();	
		driver.close();
		
		//2.find the number of opened window
		//defaultcontent is used to give the control to parent window or driver used window
		
		  driver.switchTo().window(oldwindow);
		 
		  WebElement openmultiplebutton=driver.findElement(By.xpath(
		  "//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		  
		  openmultiplebutton.click();
		  
		  int numberofwindows=driver.getWindowHandles().size();
		  System.out.println(numberofwindows);
		  
		  //3.close all except window
		  
		  WebElement dontclosemebutton=driver.findElement(By.id("color"));
		  dontclosemebutton.click();
		  
		  java.util.Set<String> newwindowhandles=driver.getWindowHandles();
		  
		  for (String allwindows : newwindowhandles) {
		  if(!allwindows.equals(oldwindow)) { driver.switchTo().window(allwindows);
		  driver.close(); } }
		 
	}
}
