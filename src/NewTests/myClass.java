package NewTests;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		/*
		 * String , double , int , boolean , date , a , main programming - (for , if ,
		 * while , break , countinue ) methods ( string methods , Math) 
		 * oop ,
		 * inheretance , object
		 */

//		String myName = "abedalraheem";
//
//		String myStudent;
//
//		myStudent = "heba";

//		System.out.println(myName.contains("z"));
//		System.out.println(myName.contains("a"));

		;

//		System.out.println(myName.toUpperCase().charAt(1));

//		System.out.println(myName.concat("faisal"));

//		String zzz = myName+" "+"faisal"; 
//		
//		System.out.println(zzz);

//		double myDouble = -88.9;
//	System.out.println(Math.round(myDouble));	
//	System.out.println(Math.ceil(myDouble));
//	System.out.println(Math.floor(myDouble));

//System.out.println(Math.absExact((int) myDouble));
//; 
//System.out.println(Math.abs(myDouble));
//
//		boolean iLoveMySelf = false;
//
//		Date myTime = new Date();

//		System.out.println(myTime);

//		myTime.getHours();
		
		// ----------------Part 2 ----------------------
//		for () {}	
//		while () {}
//		if() {}
		
		
//		for(int i = 0 ; i < 100 ; i ++) {
//			if (i%2==1) {
//				if(i ==9 ||i==19||i==29||i==39) {
//					continue; 
//					break;
//				}
//			
//
//				}
//				System.out.println(i);
//
//			}
		int i = 3 ; 
	
		while(i == 3) {
			
			System.out.println(i);
			i++ ; 
		}
		
		System.out.println(i);
	

	}

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" ,"Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		addItems(driver, itemsNeeded);

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{
				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length)

				{
					break;
				}
			}

		}

	}

}