package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class payment {

	static String Browser;
	static WebDriver driver;
	static WebDriverWait wait; 

	public static void main (String args []) throws Exception 

	{
		setBrowser (); 
		setBrowserConfig (); 
		Loggingin ();
		Paymentaddition ();
	}

	public static void setBrowser ()
	{
		Browser = "Firefox"; 
	}

	public static void setBrowserConfig () 
	{

		if (Browser== "Firefox") 
			WebDriverManager.firefoxdriver().setup(); 
			driver = new FirefoxDriver ();


		/*
		if (Browser== "Chrome")
			WebDriverManager.chromedriver().setup(); 

				driver = new ChromeDriver();
		 */ 
	}
	
	
	public static void Loggingin () throws Exception 
	{
		driver.get("https://amazon.com/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS); 

		//Maximize browser window 
		driver.manage().window().maximize();

		// drop down selection and going back to sign in page
		WebElement menuOption = driver.findElement(By.id("nav-link-accountList-nav-line-1")); 
		menuOption.click(); 

		// giving mail id 
		Thread.sleep(2000); 
		WebElement Entermailid = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		Entermailid.sendKeys("manisvij+test00165@amazon.com");  

		// giving continue 
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

		// password 
		WebElement password = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		password.sendKeys("hhotesting");

		driver.findElement(By.id("signInSubmit")).click(); // signing in

		/*


		// write code for not now needed to skip add number for some accounts
		WebElement Addnumber = driver.findElement(By.xpath("//*[@id=\"ap-account-fixup-phone-skip-link\"]")); 
		Addnumber.isDisplayed();


		if (Addnumber.equals(Addnumber))
		{
			driver.findElement(By.xpath("//*[@id=\"ap-account-fixup-phone-skip-link\"]")).click();
		}

		else 
		{
			Thread.sleep(2000); 
		}
		 */
	} 



	public static void Paymentaddition () throws Exception 
	{
		// going to my accounts page  
		driver.get("https://www.amazon.com/gp/css/homepage.html?ref_=nav_AccountFlyout_ya"); 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS); 

		// selecting add debit or credit card
		WebElement payments = driver.findElement(By.linkText("Your Payments"));
		payments.sendKeys(Keys.PAGE_DOWN);
		payments.click();

		WebElement paymentscroll = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div/div[2]/div/div/div[3]/div/div[2]/div/div[2]/div/div/span/span[1]/span/input"));
		paymentscroll.sendKeys(Keys.PAGE_DOWN);
		paymentscroll.click(); 




		//WebElement pay = driver.findElement(By.xpath("a-input-text a-form-normal"));
		
		// WebElement creditcardNumber = Hooks.driver.findElement(By.name("cardnumber"));
		//creditcardNumber.sendKeys("1234567890000066");
		
		driver.switchTo().frame("index=0");
		// driver.switchTo().frame(0);
	
		
		driver.findElement(By.id("a-popover-header-1"));
		
		// card name
		driver.findElement(By.name("addCreditCardNumber")).sendKeys("Picasso Customer");
		// expiration date 

		Select month = new Select (driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/form/div[1]/div[2]/div/div[3]/div[2]/div[1]/span[1]/span/span/span")));
		month.selectByValue("5");
		Select year = new Select (driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/form/div[1]/div[2]/div/div[3]/div[2]/div[1]/span[3]/span/span/span")));
		year.selectByValue("2026");

	}

	
	
}
