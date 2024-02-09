package com.digisoft.selenium.basics.dropdown;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.digisoft.selenium.basics.utils.ActitimeUtils;

public class MultiDropDownDemo extends ActitimeUtils
{

	
	@Test
	public void multiDropDownDemo()
	{
//		file:///D:/EclipseWS/html/multiSelect.html
		
		getDriver("chrome");
		launch("file:///D:/EclipseWS/html/multiSelect.html");
		
		Select sel = new Select(getElement("tagname", "select"));
		pauseExecution(2000);
		sel.selectByIndex(2);
		pauseExecution(2000);
		sel.selectByValue("volvo");
		pauseExecution(2000);
		sel.selectByVisibleText("Audi");
	
		sel.deselectByIndex(3);
		pauseExecution(2000);
		sel.deselectByValue("mercedes");
		pauseExecution(2000);
		sel.deselectByVisibleText("Volvo");
	
		pauseExecution(2000);
		sel.selectByIndex(2);
		pauseExecution(2000);
		sel.selectByValue("volvo");
		pauseExecution(2000);
		sel.selectByVisibleText("Audi");
	
		pauseExecution(2000);
		
		sel.deselectAll();
		
	
	
	
	
	}
}
