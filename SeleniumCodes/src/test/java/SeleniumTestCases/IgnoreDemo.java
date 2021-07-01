package SeleniumTestCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreDemo {
	
	
	@Test

	public void test1() {
		
		System.out.println("Test1"); 
	}
	
	@Test
	@Ignore 
	public void test2() {
		System.out.println("Test2"); 
	}

}
