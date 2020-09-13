package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class AddEmployeePageElements extends BaseClass {

	@FindBy(id = "firstName")
	public WebElement firstNameField;
	
	@FindBy(id = "middleName")
	public WebElement middleName;
	
	@FindBy(id = "lastName")
	public WebElement lastName;
	
	@FindBy(id = "photofile")
	public WebElement chooseFile;
	
	@FindBy(id = "btnSave")
	public WebElement saveButton;
	
	@FindBy(xpath = "//span[@for = 'lastName']")
	public WebElement errorMessageForBlankLastName;
	
	@FindBy(xpath = "//span[@for = 'firstName']")
	public WebElement errorMessageForBlankFirstName;
	
	@FindBy(id = "chkLogin")
	public WebElement createLoginDetailsCheckbox;
	
	@FindBy(id = "user_name")
	public WebElement userName;
	
	@FindBy(id = "user_password")
	public WebElement userPassword;
	
	@FindBy(id = "re_password")
	public WebElement confirmPassword;
	
	
	
	public AddEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}
}
