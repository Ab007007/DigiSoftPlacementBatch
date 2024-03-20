package com.digisoft.selenium.basics.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.digisoft.selenium.basics.utils.ActitimeUtils;

public class MouseMovementDemo extends ActitimeUtils {

	@Test
	public void mouseMovementDemo() {
		getDriver();
		launch("https://www.flipkart.com/");
		pauseExecution(60000);
//		verifyElementIsVisibleUsingFW("xpath","//span[@role='button']");
//		verifyElementisVisible("xpath","//span[@role='button']");
//		click("xpath", "//span[@role='button']");
		
		WebElement electronics = getElement("xpath", "//div[@aria-label='Electronics']");
		WebElement fashion = getElement("xpath", "//div[@aria-label='Fashion']");
		WebElement hnf = getElement("xpath", "//div[@aria-label='Home & Furniture']");
		WebElement twoWheelers = getElement("xpath", "//div[@aria-label='Two Wheelers']");
		
		Actions act = new Actions(driver);
		act.moveToElement(electronics).perform();
		pauseExecution(5000);
		printSuggestions();
		act.moveToElement(fashion).perform();
		pauseExecution(5000);
		act.moveToElement(hnf).perform();
		pauseExecution(5000);
		act.moveToElement(twoWheelers).perform();
		pauseExecution(5000);
		
		

	}
	
	public void printSuggestions()
	{
		
	}
}
