package com.digisoft.selenium.basics.switchto;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.digisoft.selenium.basics.utils.ActitimeUtils;


public class FramesDemo extends ActitimeUtils {

	
	
	@Test
	public void dragAndDrop()
	{
		getDriver();
		launch("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(getElement("xpath", "//iframe[contains(@src,'default')]"));
		Actions act = new Actions(driver);
		WebElement srcEle = getElement("id", "draggable");
		WebElement destEle = getElement("id", "droppable");
		System.out.println("source ele text " + srcEle.getText());
		System.out.println("dest ele text " + destEle.getText());
		act.dragAndDrop(srcEle,destEle).perform();
		System.out.println("source ele text " + srcEle.getText());
		System.out.println("dest ele text " + destEle.getText());
	
		driver.switchTo().defaultContent();
		click("linktext", "Selectable");
	}
	
}
