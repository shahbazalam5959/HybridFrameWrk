package com.automation.utility;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunMultipleXMLUsingJavaClass {

	public static void main(String arge[])
	{
		// Create object of TestNG Class
		TestNG runner = new TestNG();
		
		// Create a list of String 
		List<String> suiteFiles = new ArrayList<String>();
		
		// Add xml file which you have to execute
		//If we have multiple xml files we can add more in this way we can run multiple xml files at one shot with the help of java.
		suiteFiles.add("./testng.xml");
		
		// now set xml file for execution
		runner.setTestSuites(suiteFiles);
		
		// finally execute the runner using run method
		runner.run();
	}
	
	
	
}
