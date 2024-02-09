package com.digisoft.selenium.basics.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.digisoft.selenium.basics.utils.ActitimeUtils;
import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeFlowUsingReusableFunctions extends ActitimeUtils {

	String customerName = null;
	String projectName = null;
	
	@BeforeTest
	public void preSetup()
	{
		customerName = new Faker().name().firstName(); 
		projectName = new Faker().company().name();
		
	}
	@BeforeMethod
	public void setup() throws InterruptedException {
		getDriver("ff");
		launch("http://localhost/login.do");
		login("admin", "manager");
	}

	@Test(priority = 1)
	public void createcustomer() throws InterruptedException {
		goToModule("tasks");
		clickOnAddNewButton();
		createCustomerWithDetails(customerName);
	}

	
	@Test(priority = 2)
	public void createproject() throws InterruptedException {
		goToModule("tasks");
		clickOnAddNewButton();
		createProjectWithDetails(customerName, projectName);
	
	
	}

	@AfterMethod
	public void cleanup()
	{
		logout();
		driver.close();
	}
}
