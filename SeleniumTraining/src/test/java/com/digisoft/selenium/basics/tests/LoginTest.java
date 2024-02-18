package com.digisoft.selenium.basics.tests;

import org.testng.annotations.Test;

import com.digisoft.selenium.basics.utils.ActitimeUtils;

public class LoginTest extends ActitimeUtils
{
	
	@Test(groups = {"smoke", "regression", "production"})
	public void loginAsUser()
	{
		getDriver(browser);
		launch(url);
		login(userName, password);
		logout();
	}

	
	@Test(groups = {"smoke", "regression"})
	public void loginAsEmployee()
	{
		getDriver(browser);
		launch(url);
		login(userName, password);
		logout();
	}

	
	@Test(groups = {"smoke"})
	public void loginAsAdmin()
	{
		getDriver(browser);
		launch(url);
		login(userName, password);
		logout();
	}

}
