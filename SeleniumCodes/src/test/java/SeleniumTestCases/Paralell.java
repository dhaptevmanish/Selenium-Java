package SeleniumTestCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paralell {
	
	WebDriver driver = null;
	
	
	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		System.out.println("First one"+ Thread.currentThread());
		driver.close();
	
	}
	
	
	@Test
	public void test2() {
		
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Second one"+ Thread.currentThread());
			
	}

}
