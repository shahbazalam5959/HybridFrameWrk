package com.automation.utility;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunMultipleXMLUsingJavaClass {

	public static void main(String arge[])
	{
		TestNG runner = new TestNG();
		 
		List<String> suiteFiles = new ArrayList<String>();
		
		// Add xml file which you want to execute
		//If we have multiple xml files we can add more in this way we can run multiple xml files at one shot with the help of java.
		suiteFiles.add("./testng.xml");
		suiteFiles.add("./testng1.xml");
		
		// now set xml file for execution
		runner.setTestSuites(suiteFiles);
		
		// finally execute the runner using run method
		runner.run();
	}	
}