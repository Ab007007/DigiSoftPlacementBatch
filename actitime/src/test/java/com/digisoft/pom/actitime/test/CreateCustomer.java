package com.digisoft.pom.actitime.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.digisoft.pom.actitime.page.BasePage;
import com.digisoft.pom.actitime.page.HomePage;
import com.digisoft.pom.actitime.page.LoginPage;
import com.digisoft.pom.actitime.page.TasksPage;
import com.digisoft.pom.actitime.util.WebDriverUtils;
import com.github.javafaker.Faker;

public class CreateCustomer extends WebDriverUtils {

	BasePage basePage;
	LoginPage loginPage;
	HomePage homePage;
	TasksPage tasksPage;
	
	@BeforeTest
	public void setup()
	{
		test = reports.createTest("Setup : Pre condition to my Test ");
		test.log(Status.INFO, "Creating a Driver object " );
		
		driver = getDriver("ff");
		test.log(Status.INFO, "Driver Created Successfully " );
		
		
		basePage = new BasePage(driver);
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		tasksPage = new TasksPage(driver);
		
		test.log(Status.INFO, "Launching the Application " );
		launch("http://localhost:8086/login.do");
		test.log(Status.PASS, "Launching the Application Successfull " );
		
		test.log(Status.INFO, "Login the Application " );
		loginPage.login("admin", "manager");
		test.log(Status.PASS, "Login the Application Successfull " );
		
		homePage.clickOnTasks();
				
	}
	
	
	//@Test(invocationCount = 3)
	public void createCustomer()
	{
		String cn = new Faker().name().firstName().toString();
		test = reports.createTest("createCustomer ");
		test.log(Status.INFO, "Creating a new Customer wiht : "  + cn);
		tasksPage.createNewCustomer(cn , "FirstCustomerDesc");
		
	}
	
	
	@Test
	public void createCustomerWithSameData()
	{
		String cn = "Customer";
		test = reports.createTest("createCustomer ");
		test.log(Status.INFO, "Creating a new Customer wiht : "  + cn);
		tasksPage.createNewCustomer(cn , "FirstCustomerDesc");
		
	}
	
	
	public void createProject()
	{
		
	}
	
	
	@AfterMethod
	public void checkStatus(ITestResult result)
	{
		System.out.println("$$$$$$ AFter MEthod$$$$$$$");
		if(result.getStatus() == ITestResult.FAILURE || result.getStatus() ==  ITestResult.SKIP)
		{
			test.log(Status.FAIL, "Test " + result.getTestName() + " failed!");
			takeScreenShot(result.getTestName(), test);
		}
	}
	@AfterTest
	public void cleanup()
	{
		reports.flush();
		homePage.logout();
		basePage = null;
		loginPage = null;
		homePage = null;
		tasksPage = null;
	}
}
