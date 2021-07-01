package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplebrowser {

	WebDriver driver = null;

	@Parameters ("browsername") 
	@BeforeTest

	public void setup(String browsername)
	{
		System.out.println("browser used is: " + browsername);

		if (browsername.equalsIgnoreCase("chrome" ))
		{

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("Firefox" )) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	@Test 

	public void test1() {

		driver.get("https://google.com");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN); 


	}

	@AfterTest

	public void teardown() {

		driver.close();

	}




}
