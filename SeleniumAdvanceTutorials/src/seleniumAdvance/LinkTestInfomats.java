package seleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestInfomats {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://demo.guru99.com/test/link.html";
		 
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();				  	
	    driver.get(baseUrl);
	        
	    Thread.sleep(3000);
	        
	    //driver.findElement(By.xpath("//a[contains(@href,'fb.com')]")).click();
	        
	    
	     driver.findElement(By.partialLinkText("click")).click();
	     Thread.sleep(6000);
	     driver.findElement(By.linkText("click here")).click();
	            
	     //Relative xpath using href
	     Thread.sleep(6000);
	         
	      //Relative Xpath to select second link text
	      driver.findElement(By.xpath("//*[contains(@href,'google.com')]")).click();
	      driver.navigate().back();
	      driver.findElement(By.xpath("//*[contains(@href,'fb.com')]")).click();
	      driver.navigate().back();
	      Thread.sleep(6000);
	      driver.findElement(By.xpath("//body/a[2]")).click();

	    
	      //a[@href='http://www.google.com'] 
	      //a[@href='http://www.fb.com']
	      
	       Thread.sleep(6000);
	       driver.findElement(By.xpath(" //a[@href='http://www.fb.com']")).click();
	       Thread.sleep(6000);
	       driver.navigate().back();
	                     	       	        
	       System.out.println("title of page is: " + driver.getTitle());
	        
	       Thread.sleep(6000);
	       driver.quit();
	        //Courses->BE,ME,MBA,MCA,MS
	       
	       // driver.findElement(By.xpath("//*[contains(@href,'fb.com')]")).click();
	       //driver.findElement(By.xpath("//*[contains(@href,'fb.com')]")).click();
		   // driver.findElement(By.xpath("//a[@href='http://www.fb.com/']")).click();

	}

}
