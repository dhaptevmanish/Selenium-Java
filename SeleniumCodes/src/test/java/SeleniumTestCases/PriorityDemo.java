package SeleniumTestCases;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	
	@Test (priority = 1)
	
	public void test1() 
	{
		System.out.println("Inside test1");
	}
	
	@Test (priority = 0)
	public void test2() 
	{
		System.out.println("Inside test2");
	}
	
	 

}
