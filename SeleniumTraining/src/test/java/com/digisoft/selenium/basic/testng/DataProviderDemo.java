package com.digisoft.selenium.basic.testng;

import org.testng.annotations.Test;

import com.digisoft.selenium.basic.testng.data.TestData;

import org.testng.annotations.DataProvider;

public class DataProviderDemo { // extends TestData {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
	  System.out.println(n + " : " + s);
  }

  
  @Test(dataProvider = "createCustomerData", dataProviderClass = TestData.class)
  public void createCust(String customerName, String customerDesc)
  {
	  System.out.println(customerName + " : " + customerDesc);
	  
  }
  
  
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
    };
  }
  
  @DataProvider
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
    };
  }
  
  @DataProvider
  public Object[][] dp2() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
    };
  }
}
