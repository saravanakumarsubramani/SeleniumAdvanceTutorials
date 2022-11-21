package seleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtentedExample20 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		//1.go to homepage
		WebElement homepagelink=driver.findElement(By.linkText("Go to Home Page"));
		homepagelink.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//2.find where am supposed to go without clicking me?
		
		WebElement wheretogo=driver.findElement(By.partialLinkText("Find where"));
		String whereislink=wheretogo.getAttribute("href");
		System.out.println("this link is going to:"+whereislink);
		Thread.sleep(2000);
		
		//3.verify am broken?
		
		WebElement brokenlink=driver.findElement(By.linkText("Verify am I broken?"));
		brokenlink.click();
		Thread.sleep(2000);
		
		String title=driver.getTitle();
		if (title.contains("404")) {
			System.out.println("link is broken");
		}
		driver.navigate().back();
		Thread.sleep(2000);
		
		//4.Go to Home Page (Interact with same link name)
		
		WebElement homepagelink1=driver.findElement(By.linkText("Go to Home Page"));
		homepagelink1.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//5.How many links are available in this page?
		
		List<WebElement> totallinks=driver.findElements(By.tagName("a"));
		int linkcount=totallinks.size();
		System.out.println("total links:"+linkcount);
		Thread.sleep(2000);
	}

}
