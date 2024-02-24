package com.digisoft.pom.actitime.grid;

import org.testng.annotations.Test;

import com.digisoft.pom.actitime.util.WebDriverUtils;

public class EdgeTest extends WebDriverUtils
{

	
	
	@Test
	public void formyRegisterTest()
	{
		driver = getRemoteDriver("MicrosoftEdge");
		driver.get("https://formy-project.herokuapp.com/form");
		System.out.println("Title from Edge Browser : " + driver.getTitle());
		driver.quit();
	}
}
