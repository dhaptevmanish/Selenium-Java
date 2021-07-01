package SeleniumTestCases;

import org.springframework.context.annotation.DependsOn;
import org.testng.annotations.Test;

public class Dependencies {
	@Test (dependsOnGroups = {"endtoend"}, groups = {"regression"}) // even when the priority is set the dependencies will be considered the most important 
	
	public void test1() {
		System.out.println("In test 1");
	}
	
	@Test (groups = {"sanity", "functionality"})
	
	public void test2() {
		System.out.println("In test 2");
	}
	
	
@Test (groups = {"sanity", "endtoend"})
	
	public void test3() {
		System.out.println("In test 3");
	}

}
