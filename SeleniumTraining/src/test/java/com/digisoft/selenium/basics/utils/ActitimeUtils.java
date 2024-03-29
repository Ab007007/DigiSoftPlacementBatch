package com.digisoft.selenium.basics.utils;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ActitimeUtils extends WebDriverUtils {

	
	public void launch(String url) {
		System.out.println("Launching URL : " + url);
		driver.get(url);
	
	}
	
	public void launch(String... url) {
//		if(driver==null)
//			getDriver();
		if(url.length == 0)
		{
			System.out.println("Launching Actitime URL : " );
			driver.get("http://localhost:8086/login.do");
		}
		else if (url.length ==1)
		{
			System.out.println("Launching URL : " + url[0]);
			driver.get(url[0]);
		}
		else
			System.out.println("Only one URL is supported!!!");
	
	}
	
	
	public void logout()
	{
		click("id", "logoutLink");
		driver.close();
	}
	
	
	/**
	 * 
	 * @param username and password of type String
	 * @author Aravind
	 * @category actitime reusable function
	 * 
	 */
	public void login(String un, String pwd) {
		type("id", "username", un);
		type("name", "pwd", pwd);
		click("id", "loginButton");
		pauseExecution(10000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		

	}

	/**
	 * 
	 * @param moduleName - tasks, users, report, time-track
	 * @author Aravind
	 * @category actitime reusable function
	 * 
	 */
	public void goToModule(String moduleName) {
//		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.valueOf(timeout)));
		switch (moduleName.toLowerCase()) {
		case "tasks":
			wait.until(ExpectedConditions.elementToBeClickable(getElement("xpath", "//a[contains(@href,'tasks')]"))).click();
			
			break;
		case "users":
			wait.until(ExpectedConditions.elementToBeClickable(getElement("xpath", "//a[contains(@href,'userlist')]"))).click();
			
			break;
		case "report":
			wait.until(ExpectedConditions.elementToBeClickable(getElement("xpath", "//a[contains(@href,'reports')]"))).click();
			
			break;
		case "time-track":
			wait.until(ExpectedConditions.elementToBeClickable(getElement("xpath", "//a[contains(@href,'submit')]"))).click();
			
			break;

		default:
			System.out.println("Check the module type in your application " + moduleName);
			break;
		}
	}

	public void clickOnAddNewButton() {
		click("xpath", "//div[text()='Add New']");
		Assert.assertTrue(verifyElementisVisible("xpath","//div[@class='dropdownContainer addNewMenu']"));
		
	}
	
	
	public void createCustomerWithDetails(String customerName) 
	{
		click("xpath", "//div[@class='item createNewCustomer ellipsis']");
		validateScreenWithText("id", "customerLightBox_titlePlaceholder","Create New Customer");
			
		type("id", "customerLightBox_nameField", customerName);
		type("id", "customerLightBox_descriptionField", customerName + "_Description");
		click("id","customerLightBox_commitBtn");

		waitForSuccessMsgToComplete();
		
	}
	
	public void createProjectWithDetails(String customerName, String projectName)
	{
		click("xpath", "//div[@class='item createNewProject ellipsis']");
		validateScreenWithText("id", "projectPopup_titlePlaceholder","Create New Project");
		
		type("id", "projectPopup_projectNameField", projectName);
		pauseExecution(3000);
		click("xpath","//div[@id='projectPopup_customerSelectorPlaceholder']//button");
		pauseExecution(3000);
		verifyElementisVisibleUsingJS("linktext", customerName);
		click("linktext",customerName);
		
		type("id", "projectPopup_projectDescriptionField", customerName + "_Description");
		click("id","projectPopup_commitBtn");
		
		waitForSuccessMsgToComplete();

	}
	
	

	public void waitForSuccessMsgToComplete() {
		System.out.println("Waiting for the visibility of success msg");
		wait.until(ExpectedConditions.visibilityOf(getElement("xpath", "//div[@class='toasts']//span")));
		
		System.out.println("Waiting for the In-visibility of success msg");
		wait.until(ExpectedConditions.invisibilityOf(getElement("xpath", "//div[@class='toasts']//span")));
	}
	public void validateScreenWithText(String identifier, String value, String expectedText)
	{
		verifyElementisVisible(identifier, value);
		String actualText = getText(identifier, value);
		Assert.assertEquals(actualText, expectedText);
	}
}
