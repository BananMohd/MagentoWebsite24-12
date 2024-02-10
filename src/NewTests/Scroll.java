package NewTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.w3docs.com/snippets/html/how-to-create-a-table-with-a-fixed-header-and-scrollable-body.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		// the whole page scroll

		js.executeScript("window.scrollBy(0,850)");
		Thread.sleep(3000);
		// insider scroll table
		js.executeScript("document.querySelector(\".text-sm\").scrollTop=1000");

	}

}
