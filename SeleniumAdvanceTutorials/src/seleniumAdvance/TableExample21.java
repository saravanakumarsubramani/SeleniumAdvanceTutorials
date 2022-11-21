package seleniumAdvance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample21 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
		//1.get the number of columns
		//th-columns
		
		List<WebElement> column=driver.findElements(By.tagName("th"));
		int columncount=column.size();
		System.out.println("number of columns:"+columncount);
		
		//2.get the number of rows
		//tr-rows
		
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rowcount=rows.size();
		System.out.println("number of rows:"+rowcount);
		
		//3.Get the progress value of Learn to interact with Elements
		//td-tablecell
		WebElement progressvalue=driver.findElement
		(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		
		String progress=progressvalue.getText();
		System.out.println("percentage is :"+progress);
		
		//4.Check the vital task for the least completed progress.
		
		List<WebElement> allprogress=driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numberlist=new ArrayList<Integer>();
		
		for (WebElement webElement : allprogress) {
		String individualvalue=webElement.getText().replace("%", "");
		//parseint is used to change the string value to integer value
		numberlist.add(Integer.parseInt(individualvalue));
		}
		System.out.println("final list is:"+numberlist);
		
		int smallvalue=Collections.min(numberlist);
		System.out.println("smallest value is:"+smallvalue);
		
		//integer .tostring is used to convert the integer to string
		String smallvalueString=Integer.toString(smallvalue)+"%";
		
		// "\"--->escape character
		String finalXpath="//td[normalize-space()="+"\""+smallvalueString+"\""+"]"+"/following::td[1]";
		
		System.out.println(finalXpath);
		
		WebElement check=driver.findElement(By.xpath(finalXpath));
		check.click();
	}

}
