package com.digisoft.selenium.basic.testng.data;

import org.testng.annotations.DataProvider;

public class TestData 
{
	
	 @DataProvider
	  public Object[][] createCustomerData() {
	    return new Object[][] {
	      new Object[] { "DigiSoftTestNGC1","DigiSoftTestNGC1-Desc" },
	      new Object[] { "DigiSoftTestNGC2","DigiSoftTestNGC1-Desc" },
//	      new Object[] { "DigiSoftTestNGC3","DigiSoftTestNGC1-Desc" },
//	      new Object[] { "DigiSoftTestNGC4","DigiSoftTestNGC1-Desc" },
//	      new Object[] { "DigiSoftTestNGC5","DigiSoftTestNGC1-Desc" },
//	      new Object[] { "DigiSoftTestNGC6","DigiSoftTestNGC1-Desc" },
	    };
	  }
	 
	
	 @DataProvider
	  public Object[][] createProjectData() {
	    return new Object[][] {
	      new Object[] { "DigiSoftTestNGC1","Project-ABC","DigiSoftTestNGC1-Desc" },
	      new Object[] { "DigiSoftTestNGC2","Project-ABC","DigiSoftTestNGC1-Desc" },
//	      new Object[] { "DigiSoftTestNGC3","Project-ABC","DigiSoftTestNGC1-Desc" },
//	      new Object[] { "DigiSoftTestNGC4","Project-ABC","DigiSoftTestNGC1-Desc" },
//	      new Object[] { "DigiSoftTestNGC5","Project-ABC","DigiSoftTestNGC1-Desc" },
//	      new Object[] { "DigiSoftTestNGC6","Project-ABC","DigiSoftTestNGC1-Desc" },
	    };
	  }
	 
	
	 

}
