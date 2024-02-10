package NewTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		for (int i = 0; i < 10; i++) {
			driver.get("https://www.facebook.com");

			driver.navigate().to("https://www.google.com");
			
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			

		}
	}

}
