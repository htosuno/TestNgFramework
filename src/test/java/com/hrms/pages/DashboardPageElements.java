package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DashboardPageElements extends BaseClass{
	
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pimLinkBtn;
	
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement adminLinkBtn;
	
	@FindBy(id = "menu_leave_viewLeaveModule")
	public WebElement leaveLinkBtn;
	
	@FindBy(id = "menu_time_viewTimeModule")
	public WebElement timeLinkBtn;
	
	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	public WebElement recruitmentLinkBtn;
	
	@FindBy(id = "menu_dashboard_index")
	public WebElement dashboardLinkBtn;
	
	@FindBy(id = "menu_directory_viewDirectory")
	public WebElement directoryLinkBtn;
	
	@FindBy(id = "welcome")
	public WebElement welcomeMessage;
	
	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmpButton;

	
	
	public DashboardPageElements() {
	
		PageFactory.initElements(driver, this);
	}
}
