package SeleniumTestCases;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	
	@Test
	@Parameters ({"Fuck, Victor"})
	public void test (@Optional ("Victor") String name) // We are giving a value in @optional because if there is no value it will return as null
	{
		System.out.println("Name is:" +name);
		 
	}

}
