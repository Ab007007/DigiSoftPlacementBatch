package com.digisoft.pom.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class TasksPage extends BasePage 
{

	
	@FindBy(xpath = "//div[text()='Add New']")
	WebElement addNewButton;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer ellipsis']")
	WebElement createNewCustomer;
	
	@FindBy(id = "customerLightBox_nameField")
	WebElement customerNameTextBox;
	
	@FindBy(id = "customerLightBox_descriptionField")
	WebElement customerDescTextBox;
	
	@FindBy(id = "customerLightBox_commitBtn")
	WebElement createCustomerButton;
	
	public void clickOnAddNewButton()
	{
		addNewButton.click();
	//	Assert.assertTrue(verifyElementisVisible("xpath","//div[@class='dropdownContainer addNewMenu']"));
		
	}
	
	public void clickOnNewCustomerCreateButton()
	{
		createNewCustomer.click();
		//ADd verification statne
	}
	
	public void enterCustomerDetails(String cn, String cd)
	{
		customerNameTextBox.sendKeys(cn);
		customerDescTextBox.sendKeys(cd);
		createCustomerButton.click();
	}
	
	
	public void createNewCustomer(String cn, String cd)
	{
		test.log(Status.INFO, "Creating  a Customer ");
		test.log(Status.INFO, "Clicking on Add New ");
		clickOnAddNewButton();
		
		
		test.log(Status.INFO, "Clicking on Add New Customer ");
		clickOnNewCustomerCreateButton();
		
		test.log(Status.INFO, "Creating a customer with " +cn + " and " + cd );
		enterCustomerDetails(cn, cd);
		
		test.log(Status.INFO, "Creating  a Customer ");
		verifySuccessMessage();
		test.log(Status.PASS, "Customer created successfully");
		
		
	}
	
	
	public TasksPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
