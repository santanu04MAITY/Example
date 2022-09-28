package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testbase.TestBase;

public class LoginPageTest extends TestBase{
	
	@Test
	public void VerifyLogin() throws InterruptedException
	{
		LoginPage login=new LoginPage();
		login.clickOnApplicantLogin();
		Thread.sleep(10000);
		login.clickOnnewApplicant();
	}

}
