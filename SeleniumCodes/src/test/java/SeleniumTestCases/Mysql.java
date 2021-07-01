package SeleniumTestCases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Mysql {

	@Test
	public void testDB() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Loaded");
		
	Connection Con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","admin123");
	System.out.println("Connected to DB");	
	
	 Statement smt=Con.createStatement();
     
     System.out.println("Statement created");
	
	ResultSet rs=  smt.executeQuery("Select * from seleniumuser");
	 
	 System.out.println("Query Executed"+rs);
	
	}
}
