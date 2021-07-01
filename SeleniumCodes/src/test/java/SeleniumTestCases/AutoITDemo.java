package SeleniumTestCases;

import java.io.IOException;

import org.apache.batik.apps.rasterizer.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {

	public static void main (String [] args) throws Exception 
	{
		test();
	}

	public static void test() throws Exception {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html"); 
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(driver.findElement(By.xpath("/html/body/form/input[1]"))).click().build().perform();

		Runtime.getRuntime().exec("C:\\Users\\manisvij\\Desktop\\Fileupload.exe");

		Thread.sleep(3000);

		
	}

}
