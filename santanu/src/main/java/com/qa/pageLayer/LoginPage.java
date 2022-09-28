package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='nav-text font-size-lg py-2 font-weight-bold text-center']")
	private WebElement applicant_Login;
	public void clickOnApplicantLogin()
	{
		applicant_Login.click();
	}
	
	@FindBy(xpath="//a[@class='sbold btn btn-primary']")
	private WebElement new_Applicant;
	public void clickOnnewApplicant()
	{
		new_Applicant.click();
	}

}
