package SeleniumTestCases;

import org.junit.Test;
import org.testng.annotations.Listeners;

@Listeners (SeleniumTestCases.TestNGListeners.class)

public class TestNGListenerDemo 
{

	@Test
	
	public void test1() {
		System.out.println("Iam inside test1"); 
		
	}
	
	
}
