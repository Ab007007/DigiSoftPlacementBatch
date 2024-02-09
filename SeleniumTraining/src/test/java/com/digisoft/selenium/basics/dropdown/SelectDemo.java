package com.digisoft.selenium.basics.dropdown;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.digisoft.selenium.basics.utils.ActitimeUtils;
import com.github.javafaker.Faker;

public class SelectDemo extends ActitimeUtils
{

	
	@Test
	public void formFill() {
		Faker f = new Faker();
		getDriver("edge");
		launch("https://formy-project.herokuapp.com/form");
		type("id","first-name", f.name().firstName());
		type("id","last-name", f.name().lastName());
		type("id","job-title", f.job().title());
		click("id", "radio-button-1");
		click("id", "checkbox-1");
		
		Select sel = new Select(getElement("id", "select-menu"));
		pauseExecution(3000);
		sel.selectByIndex(2);
		pauseExecution(3000);
		sel.selectByValue("4");
		pauseExecution(3000);
		sel.selectByVisibleText("5-9");
		pauseExecution(3000);
		click("id", "datepicker");
		verifyElementisVisible("xpath", "//table[@class='table-condensed']");
		click("xpath", "//td[@class='today day']");
		click("xpath", "//a[text()='Submit']");
	}
}
