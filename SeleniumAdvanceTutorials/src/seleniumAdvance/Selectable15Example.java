package seleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable15Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		//1.select the first three elements?
		//findelements  are used to find the number of datas
		//and list webelement is used
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int size=selectable.size();
		System.out.println(size);
		
		//whenever the actions is used we definitely used build.perform keys
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL).
		click(selectable.get(0)).
		click(selectable.get(1)).
		click(selectable.get(2)).build().perform();
		
		/* AlTERNATE WAYS
		 Actions actions=new Actions(driver);
		 actions.clickandhold(selectable.get(0));
		 actions.clickandhold(selectable.get(1));
		 actions.clickandhold(selectable.get(2));
		 actions.build().perform();
		*/
	}

}
