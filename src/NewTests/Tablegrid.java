package NewTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablegrid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");

		List<WebElement> items = driver.findElements(By.cssSelector(".container td:nth-of-type(3)"));
		int sum = 0;
		int average = items.size();
		for (int i = 0; i < items.size(); i++) {
			// check the output
			System.out.println(Integer.parseInt(items.get(i).getText()));
			// make the sum keep changing
			sum = sum + Integer.parseInt(items.get(i).getText());
		}
		System.out.println("the sum is " + sum);
		// calculate the average
		System.out.println("the average is " + sum / average);
		// to check we have the correct value
//		driver.findElement(By.id("total")).getText();

		// to split the value by using split method
String newsplittedvalue = driver.findElement(By.id("total")).getText().split(":")[1].trim();

	// assertion failed 
//	Assert.assertEquals(newsplittedvalue, sum);
	
	// to fix this 
	int intnewsplittedvalue= Integer.parseInt(driver.findElement(By.id("total")).getText().split(":")[1].trim());
	
	// assertion passed 
	Assert.assertEquals(intnewsplittedvalue, sum);

	}

}
