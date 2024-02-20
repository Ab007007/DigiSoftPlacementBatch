package com.digisoft.pom.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.digisoft.pom.actitime.util.WebDriverUtils;

public class LoginPage extends BasePage {

	@FindBy(id="username")
	WebElement usernameTextBox;
	
	@FindBy(name="pwd")
	WebElement passwordTextBox;
	
	@FindBy(id="loginButton")
	WebElement loginButton;
	
	
	public void login(String un, String pwd)
	{
		System.out.println("Actitime login using : " + un + " and " + pwd);
		usernameTextBox.sendKeys(un);
		passwordTextBox.sendKeys(pwd);
		loginButton.click();
		new WebDriverUtils().pauseExecution(5000);
		verifyTitle(driver, "actiTIME - Enter Time-Track");
	}
	
	
	
	public void enterUserName(String un)
	{
		usernameTextBox.sendKeys(un);
	}
	
	
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
