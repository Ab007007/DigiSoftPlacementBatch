package com.digisoft.pom.actitime.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.digisoft.pom.actitime.page.BasePage;
import com.digisoft.pom.actitime.page.HomePage;
import com.digisoft.pom.actitime.page.LoginPage;
import com.digisoft.pom.actitime.page.TasksPage;
import com.digisoft.pom.actitime.util.WebDriverUtils;

public class CreateCustomer extends WebDriverUtils {

	BasePage basePage;
	LoginPage loginPage;
	HomePage homePage;
	TasksPage tasksPage;
	
	@BeforeTest
	public void setup()
	{
		driver = getDriver();
		launch("http://localhost:8086/login.do");
		basePage = new BasePage(driver);
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		tasksPage = new TasksPage(driver);
				
	}
	
	
	@Test
	public void createCustomer()
	{
		loginPage.login("admin", "manager");
		homePage.clickOnTasks();
		tasksPage.createNewCustomer("FirstCustomr", "FirstCustomerDesc");
		
	}
	
	
	public void createProject()
	{
		
	}
	
	@AfterTest
	public void cleanup()
	{
		basePage = null;
		loginPage = null;
		homePage = null;
		tasksPage = null;
		homePage.logout();
	}
}
