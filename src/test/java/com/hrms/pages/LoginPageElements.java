package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class LoginPageElements extends BaseClass{
	@FindBy(id = "txtUsername")
	public WebElement userNameTextBox;
	
	@FindBy(id = "txtPassword")
	public WebElement passwordTextBox;
	
	@FindBy(id = "btnLogin")
    public WebElement btnLogin;
	
	@FindBy(id = "divLogo")
	public WebElement syntaxLogo;
	
	@FindBy(id = "spanMessage")
	public WebElement spanMessage;
	
	@FindBy(id = "logInPanelHeading")
	public WebElement loginPanelHeading;
	
	public LoginPageElements() {		
		PageFactory.initElements(driver, this);
	}
}

