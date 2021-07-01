package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowsers {

	public static void main (String args[]) {
		test();
	}

	public static void test() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); // the chrome options must always be specified before instantiating the driver
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options); // we must pass the object created for the headless browser here in the driver command, or else the browser will open



		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN); 
		System.out.println(driver.getTitle());
		
		System.out.println("completed"); 
	}
}
