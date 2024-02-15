package com.digisoft.selenium.basic.js;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.digisoft.selenium.basics.utils.FormyUtils;

public class JavaScriptExecutorDemo extends FormyUtils
{

	//@Test
	public void scrollPage()
	{
		getDriver();
		launch("https://formy-project.herokuapp.com/");
		selectComponent("Page Scroll");
		pauseExecution(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, 1000);");
		
	}
	
	
	
	@Test
	public void scrollToViewForElement()
	{
		getDriver(browser);
		launch(url);
		login(userName,password);
		clickOnAddNewButton();
		createProjectWithDetails("WE-TestNG-Cus4", "Project-1");
		
	}
}
