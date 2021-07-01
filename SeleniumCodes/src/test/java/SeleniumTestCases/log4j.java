package SeleniumTestCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class log4j {

	
	public static void main(String[] args) 
	{

		
		
		Logger logger=Logger.getLogger("Google");

		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		logger.info("Browser Opened");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Implicit wait given");

		driver.get("https://www.google.co.in/");
		logger.info("Url opened");

		driver.findElement(By.name("q")).sendKeys("Selenium");
		logger.info("keyword type"); 
		
		driver.findElement(By.name("q")).click();
		logger.warn("all is well");

		

	}


}
