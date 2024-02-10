package myTestcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signup extends Parameters {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void mySetup() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Test(priority = 1, enabled = false)
	public void myFirstTest() throws InterruptedException {

		driver.get("https://magento.softwaretestingboard.com/");

		driver.findElement(By.linkText("Create an Account")).click();

		// find the elements
		WebElement FirstName = driver.findElement(By.id("firstname"));
		WebElement LastName = driver.findElement(By.id("lastname"));
		WebElement Email = driver.findElement(By.id("email_address"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement confirmPassword = driver.findElement(By.id("password-confirmation"));
		WebElement createAccountButtonElement = driver
				.findElement(By.cssSelector("button[title='Create an Account'] span"));

		
		// interact with the elements...and create the account
		FirstName.sendKeys(FirstNames[randomIndex]);
		LastName.sendKeys(lastNames[randomIndex]);
		Email.sendKeys(emailID);
		Password.sendKeys(CommonPassword);
		confirmPassword.sendKeys(CommonPassword);
		createAccountButtonElement.click();

		//to check the creatAccount test
		String WelcomeMsg = driver.findElement(By.className("message-success")).getText();

		assertEquals(WelcomeMsg, "Thank you for registering with Main Website Store.");

	}

	
	@Test(priority = 2, enabled = false)
	public void logoutProcess() throws InterruptedException {

		driver.get("https://magento.softwaretestingboard.com/customer/account/logout/");
		;
		assertEquals(driver.getCurrentUrl().contains("logoutSuccess"), true);
	}

	@Test(priority = 3, enabled = false)
	public void LoginProcess() throws InterruptedException {

		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys(emailID);
		driver.findElement(By.id("pass")).sendKeys(CommonPassword);

		driver.findElement(By.id("send2")).click();

		Thread.sleep(2000);
		String WelcomeMessage = driver.findElement(By.cssSelector(".greet.welcome")).getText();
		assertEquals(WelcomeMessage.contains("Welcome"), true);

	}

	@Test(priority = 4, enabled = false)
	public void addOneRandomItem() throws InterruptedException {
		driver.get("https://magento.softwaretestingboard.com/");

		WebElement ItemsContainer = driver.findElement(By.cssSelector(".product-items.widget-product-grid"));
         //to select the container that contain all 6 items
		int numberofitems = ItemsContainer.findElements(By.tagName("li")).size();
		System.out.println(numberofitems);

		//select random item from first 4 elements and click on it
		int randomItemToSelect = rand.nextInt(4);
		ItemsContainer.findElements(By.tagName("li")).get(randomItemToSelect).click();
        
		//select size
		WebElement sizesContainer = driver.findElement(By.cssSelector(".swatch-attribute.size"));
		int theSizes = sizesContainer.findElements(By.className("swatch-option")).size();//put all color in list, and print the size to check
		sizesContainer.findElements(By.className("swatch-option")).get(rand.nextInt(theSizes)).click();//take one randomly
		Thread.sleep(2000);

		//select color
		WebElement colorsContainer = driver.findElement(By.cssSelector(".swatch-attribute.color"));
		int theColors = colorsContainer.findElements(By.className("swatch-option")).size();
		colorsContainer.findElements(By.className("swatch-option")).get(rand.nextInt(theColors)).click();
		Thread.sleep(2000);
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(3000);

		String ActualMsg = driver.findElement(By.cssSelector(".page.messages")).getText();

		assertEquals(ActualMsg.contains("You added"), true);

	}
	
	@Test(enabled = false)
	public void MyTest()
	{
		String[] CitiesOfTheWorld = { "amman", "cairo", "dubai", "demscus", "riyadh", "jeddah", "baghdad", "tunis",
				"Jarash", "Karak" };
		for(int i=0; i<CitiesOfTheWorld.length;i++ ) 
		{
			System.out.println(CitiesOfTheWorld[i].toUpperCase());
		}
		
		
	}

	
	
	@Test(priority = 2, enabled=false)
	public void OurFirstOrder() {

		String[] URLS = { "https://magento.softwaretestingboard.com/radiant-tee.html",
				"https://magento.softwaretestingboard.com/breathe-easy-tank.html",
				"https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
				"https://magento.softwaretestingboard.com/hero-hoodie.html",
				"https://magento.softwaretestingboard.com/fusion-backpack.html" };

		for (int i = 0; i < URLS.length; i++) {
			driver.get(URLS[i]);

			if (driver.getCurrentUrl().contains("tee")) {
				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("3");
			} else if (driver.getCurrentUrl().contains("easy")) {
				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("2");
			} else if (driver.getCurrentUrl().contains("weather")) {
				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("4");
			} else if (driver.getCurrentUrl().contains("hoodie")) {
				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("1");
			} else if (driver.getCurrentUrl().contains("fusion")) {
				WebElement Quintyt = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quintyt.clear();
				Quintyt.sendKeys("5");
			}
		}

	}
	
	


}
