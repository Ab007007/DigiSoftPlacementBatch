package com.digisoft.selenium.basics.switchto;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.digisoft.selenium.basics.utils.FormyUtils;

public class PopUpDemo extends FormyUtils
{
	
	@BeforeMethod
	public void preSetup()
	{
		getDriver();
		launch("https://formy-project.herokuapp.com/");
		
	}
	
	
	@AfterMethod
	public void postExecution() {
		closeDriver();
	}
	
	@Test
	public void handleCustomAlert()
	{
		selectComponent("Modal");
		click("id", "modal-button");
		verifyElementisVisible("xpath", "//div[@class='modal-content']");
		getText("xpath", "//div[@class='modal-body']");
		click("id", "close-button");
	}
	
	
	
	@Test
	public void handleJSAlert()
	{
		selectComponent("Switch Window");
		click("id", "alert-button");
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}
}
