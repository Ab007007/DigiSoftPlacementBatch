package com.digisoft.pom.actitime.grid;

import org.testng.annotations.Test;

import com.digisoft.pom.actitime.util.WebDriverUtils;

public class FireFoxTest extends WebDriverUtils
{

	
	
	@Test
	public void formyRegisterTest()
	{
		driver = getRemoteDriver("firefox");
		driver.get("https://formy-project.herokuapp.com/form");
		System.out.println("Title from firefox Browser : " + driver.getTitle());
		driver.quit();
	}
}
