package SeleniumTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frameset {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
	      WebDriver driver = new ChromeDriver();
	      String url = "url with frames";
	      driver.get("https://www.softwaretestinghelp.com/handling-iframes-using-selenium/");
	      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      //grabbing the first frame with the help of index
	      driver.switchTo().frame(0);
	      //grabbing the frame with the help of frame name
	      driver.switchTo().frame("//div[@class='tve-page-section-out']");
	      //grabbing the frame with the help of frame webelement
	      WebElement name = driver.findElement(By.xpath("//div[@class='tve-page-section-out']"));
	      driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='tve-page-section-out']")));
	      driver.quit();
	   }
}
