package com.digisoft.selenium.basic.testng;

import org.testng.annotations.Test;

public class OrderOfExecutionByPriority {

	@Test(priority = 1)
	public void launch()
	{
		
	}
	
	@Test(priority = 2)
	public void login()
	{
		
	}
	
	@Test(priority = 3)
	public void createCustomer()
	{
		
	}
	@Test(priority = 4)
	public void logout()
	{
		
	}
	
	
}
