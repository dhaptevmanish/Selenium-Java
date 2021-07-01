package SeleniumTestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners (SeleniumTestCases.TestNGListeners.class)
public class TestNGListenerDemoTest {

	@Test
	public void test1() 
	{
		System.out.println("I am inside test1");  
		Assert.assertFalse(false);
	}

	@Test
	public void test2() 
	{
		System.out.println("I am inside test2"); 
		Assert.assertTrue(true);
	}
	
	@Test

	public void test3() 
	{
		System.out.println("I am inside test3");  
	}




}
