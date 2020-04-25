package com.automation.utility;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

	public class Retry implements IRetryAnalyzer{

		int minretryCNT = 0,maxretryCNT=2;
		public boolean retry(ITestResult result) {
			
			if(minretryCNT<=maxretryCNT)
			{
				System.out.println("Following Test is Failing== "+result.getName());
				
				System.out.println("Retrying the Test Count is=="+(minretryCNT+1));
				
				minretryCNT++;
				
				return true;
			}
			
			return false;
		}
}
