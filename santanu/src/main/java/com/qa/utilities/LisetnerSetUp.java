package com.qa.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testbase.TestBase;

public class LisetnerSetUp implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Execution start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Execution success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Execution Fail");
		Util.takeSS(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Execution skiped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	

}
