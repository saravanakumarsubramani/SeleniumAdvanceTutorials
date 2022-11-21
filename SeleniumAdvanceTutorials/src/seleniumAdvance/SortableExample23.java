package seleniumAdvance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample23 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		
		//1.sorting the 7th position to first position
		
		List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		WebElement fromelement=elements.get(6);
		WebElement toelement=elements.get(0);
		
		//whenever draganddrop is used,we simply use actions
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(fromelement);
		actions.moveToElement(toelement);
		actions.release(toelement);
		actions.build().perform();
		
	}

}
