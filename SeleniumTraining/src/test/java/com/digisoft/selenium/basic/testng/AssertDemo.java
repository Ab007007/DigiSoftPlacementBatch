package com.digisoft.selenium.basic.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {

	
	
	@Test
	public void hardAssertion()
	{
		System.out.println("My Name is Aravnid");
		Assert.assertEquals(5, 6);
		
		System.out.println("I work for IBM");
		Assert.assertEquals(5, 5);
		
		System.out.println("I Stay in Bangalore");
		Assert.assertEquals(5, 5);
		
		System.out.println("I am from Shimoga");
	}
	
	
	
	@Test
	public void softAssertion()
	{
		System.out.println("#######################################");
		SoftAssert sa = new SoftAssert();
		System.out.println("My Name is Aravnid");
		sa.assertEquals(5, 6);
		
		System.out.println("I work for IBM");
		sa.assertEquals(1, 5);
		
		System.out.println("I Stay in Bangalore");
		sa.assertEquals(5, 2);
		
		System.out.println("I am from Shimoga");
		
		sa.assertAll();
	}
}
