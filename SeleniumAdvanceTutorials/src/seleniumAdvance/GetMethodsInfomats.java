package seleniumAdvance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsInfomats {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		//GET Methods
		//GET URL, Get current url, Get title
		
		//Page Navigation
		d.get("https://www.amazon.in/");//method overloading  |  no browser history
		
		d.navigate().to("https://www.flipkart.com/");//Browser history  |  method overriding
		
		d.navigate().to("https://www.shopclues.com/");
		
		d.navigate().back();
		Thread.sleep(5000);
		
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
		
		d.navigate().back();
		Thread.sleep(5000);
		
		d.navigate().forward();
		Thread.sleep(5000);
		
		String title = d.getTitle();
		System.out.println(title);
		
		d.navigate().forward();
		Thread.sleep(5000);
	}
}
