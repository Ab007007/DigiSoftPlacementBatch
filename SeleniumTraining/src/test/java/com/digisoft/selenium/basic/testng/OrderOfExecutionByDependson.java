package com.digisoft.selenium.basic.testng;

import org.testng.annotations.Test;

public class OrderOfExecutionByDependson {

	@Test
	public void launch()
	{
		
	}
	
	@Test(dependsOnMethods = "launch")
	public void login()
	{
		
	}
	
	@Test(dependsOnMethods = {"login", "launch"})
	public void createCustomer()
	{
		
	}
	@Test(dependsOnMethods = "createCustomer")
	public void logout()
	{
		
	}
	
	
}
