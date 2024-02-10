package com.digisoft.selenium.basics.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.digisoft.selenium.basics.utils.ActitimeUtils;

public class ActionsDemo extends ActitimeUtils
{

	@Test
	public void keyBoardDemo() 
	{
		getDriver("chrome");
		launch();
		
		Actions act = new Actions(driver);
		act.sendKeys("admin").perform();
		pauseExecution(3000);
		act.sendKeys(Keys.TAB).perform();
		pauseExecution(3000);
		act.sendKeys("manager").perform();
		pauseExecution(3000);
		act.sendKeys(Keys.ENTER).perform();
		
	}
	
}
