package SeleniumTestCases;

import java.io.IOException;

public class Exception_handling {

	public static void main(String[] args) {
		
		try {
			System.out.println("Hi");
			int i = 1/0;
			System.out.println("Completed");
			
		}
		
		catch (Exception exp)
		{
			System.out.println("In the block");
			System.out.println("Message is "+exp.getLocalizedMessage());
			System.out.println("Cause is "+ exp.getCause());
		}
		
		
		
	}

	
	
}
