package SeleniumTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class simple {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();	
		
		driver.get("https:/browserstack.com");
		
		WebElement e = driver.findElement(By.xpath("//a[contains(text(),'Contact us')]"));
		
		System.out.println("Element with text(): " + e.getText() );
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
		
	}

}
