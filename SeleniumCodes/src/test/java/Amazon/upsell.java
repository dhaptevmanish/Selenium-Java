package Amazon;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class upsell 
{
	static String Browser;
	static WebDriver driver;
	static WebDriverWait wait; 

	public static void main (String args []) throws Exception 

	{
		setBrowser (); 
		setBrowserConfig (); 
		Loggingin ();
		// Address ();
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


	public static void Address ()
	{

		// going to my accounts page 
		Actions actions = new Actions(driver);
		WebElement accountdrop = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		actions.moveToElement(accountdrop).perform();  

		// selects accounts option from dropdown
		driver.findElement(By.linkText("Account")).click(); 

		// going to manage contents and devices 

		WebElement scroll = driver.findElement(By.linkText("Manage content and devices"));
		scroll.sendKeys(Keys.PAGE_DOWN); 
		scroll.click();

		// selecting preferences
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[2]/a[3]/div/div/span")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div/div/div[5]/div/div/div/div/div/div/div/div/a/div/div[1]")).click();

		// selecting change button 
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div/div/div[5]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/a/span/button")).click();

		// giving address details 

		//driver.findElement(By.xpath("//input[@id='adr_AddressLine1']")).sendKeys("75"); //


		WebElement Addline1 = driver.findElement(By.xpath("//input[@id='adr_AddressLine1']"));
		Addline1.sendKeys("345 Terry Ave");
		WebElement Addline2 = driver.findElement(By.xpath("//*[@id=\"adr_AddressLine2\"]"));
		Addline2.sendKeys("Amazon Dawson");
		WebElement City = driver.findElement(By.xpath("//*[@id=\"adr_City\"]"));
		City.sendKeys("Seattle");
		WebElement State = driver.findElement(By.xpath("//*[@id=\"adr_StateOrRegion\"]"));
		State.sendKeys("WA");
		WebElement zipcode = driver.findElement(By.xpath("//*[@id=\"adr_PostalCode\"]"));
		zipcode.sendKeys("98109");
		WebElement Phonenumber = driver.findElement(By.xpath("//*[@id=\"adr_PhoneNumber\"]"));
		Phonenumber.sendKeys("101010101010 ");

		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/div/a[2]/span/button")).click();
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




		driver.switchTo().frame("a-popover-content-1"); 

		driver.findElement(By.xpath("//input[@name='addCreditCardNumber']")).sendKeys("5372440219813539");
		// card name
		driver.findElement(By.id("pp-7DxRbQ-16")).sendKeys("Picasso Customer");
		// expiration date 

		Select month = new Select (driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/form/div[1]/div[2]/div/div[3]/div[2]/div[1]/span[1]/span/span/span")));
		month.selectByValue("5");
		Select year = new Select (driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/form/div[1]/div[2]/div/div[3]/div[2]/div[1]/span[3]/span/span/span")));
		year.selectByValue("2026");

	}





}

