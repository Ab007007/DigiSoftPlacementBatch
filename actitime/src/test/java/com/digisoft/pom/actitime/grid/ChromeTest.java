package com.digisoft.pom.actitime.grid;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.digisoft.pom.actitime.util.WebDriverUtils;

public class ChromeTest extends WebDriverUtils
{

	
	
	@Test
	public void formyRegisterTest()
	{
		driver = getRemoteDriver("chrome");
		driver.get("https://formy-project.herokuapp.com/form");
		System.out.println("Title from Chrom Browser : " + driver.getTitle());
		driver.quit();
	}
	
}
