package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		Select s = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
		 
		// Select the option with value "6"
		s.selectByIndex(3);
		
		// driver.findElement(By.xpath("//*[@id='oldSelectMenu']")).selectByValue("6");
		
	}
	
	}
