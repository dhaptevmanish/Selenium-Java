package SeleniumTestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromelaunch2 {
	
	static WebDriver driver; 

	@BeforeTest
	public  void setup () {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void search1 () {
	
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN); 
	}
	
	@AfterTest
	
	public void aftertest() {
		
		
		driver.close();
		driver.quit();
		
	}
	
	
}
