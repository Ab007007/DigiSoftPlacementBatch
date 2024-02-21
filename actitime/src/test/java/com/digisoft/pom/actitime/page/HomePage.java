package com.digisoft.pom.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	@FindBy(xpath = "//a[contains(@href,'tasks')]")
	WebElement tasksTab;
	
	@FindBy(id = "logoutLink")
	WebElement logoutLink;
	
	
	public void logout() 
	{
		logoutLink.click();
		driver.close();
		driver = null;
	}
	
	public void clickOnTasks()
	{
		tasksTab.click();
		verifyTitle(driver,"actiTIME - Task List");
	}
	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
