package com.digisoft.selenium.basics.tests;

import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.digisoft.selenium.basic.testng.data.TestData;
import com.digisoft.selenium.basics.utils.ActitimeUtils;
import com.digisoft.selenium.basics.utils.GlobalVariables;

public class ATUsingTestNGGD extends ActitimeUtils {


	@Parameters({"url","username","password","timeout","browser"})
	@BeforeTest
	public void preSetup(String url, String un, String pwd, String timeout, String browser) {
		GlobalVariables.timeout = timeout;
		getDriver(browser);
		launch(url);
		login(un, pwd);
		goToModule("tasks");

	}

	@Test(priority = 1, dataProvider = "createCustomerData", dataProviderClass = TestData.class)
	public void createcustomer(String customerName, String customerDesc) {
		clickOnAddNewButton();
		createCustomerWithDetails(customerName);
	}

	@Test(priority = 2, dataProvider = "createProjectData", dataProviderClass = TestData.class)
	public void createproject(String customerName, String projectName, String projectDesc) {
		clickOnAddNewButton();
		System.out.println("Creating project with " + customerName + " and " + projectName);
		createProjectWithDetails(customerName, projectName);
	}

	@Test(priority = 3, dataProvider = "createCustomerData", dataProviderClass = TestData.class)
	public void deleteCustomer(String customerName, String customerDesc) {
		type("xpath", "//div[@id='cpTreeBlock']//input[contains(@placeholder, 'name')]", customerName);

		Actions act = new Actions(driver);
		act.moveToElement(getElement("xpath", "//div[@class='itemsContainer']//span[text()='" + customerName + "']"))
				.perform();
		pauseExecution(2000);
		click("xpath", "//div[@class='itemsContainer']//span[text()='" + customerName
				+ "']/parent::div/following-sibling::div");
		pauseExecution(2000);
		click("xpath", "//div[@class='customerNamePlaceHolder']/following-sibling::div");

		click("xpath", "//div[contains(@class,'edit_customer_sliding')]//div[@class='deleteButton']");
		click("id", "customerPanel_deleteConfirm_submitTitle");
		waitForSuccessMsgToComplete();
		clearText("xpath", "//div[@id='cpTreeBlock']//input[contains(@placeholder, 'name')]", customerName);

	}

	@AfterMethod
	public void postTestExecution(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			takeScreenShot(result.getTestName());
		}
	}

	@AfterTest
	public void cleanup() {
		logout();
	}
}
