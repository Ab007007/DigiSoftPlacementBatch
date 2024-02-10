package com.digisoft.selenium.basics.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.digisoft.selenium.basics.utils.ActitimeUtils;
import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

public class DragAndDropDemo {

	Actions act = null;
	ActitimeUtils utils = null;
	
	@Test
	public void dragAndDrop()
	{
		utils = new ActitimeUtils();
		utils.getDriver();
		utils.launch("https://jqueryui.com/droppable/");
		
		utils.driver.switchTo().frame(0);
		act = new Actions(utils.driver);
		WebElement srcEle = utils.getElement("id", "draggable");
		WebElement destEle = utils.getElement("id", "droppable");
		System.out.println("source ele text " + srcEle.getText());
		System.out.println("dest ele text " + destEle.getText());
		act.dragAndDrop(srcEle,destEle).perform();
		System.out.println("source ele text " + srcEle.getText());
		System.out.println("dest ele text " + destEle.getText());
	
	}
	
	
	@Test
	public void rightClick()
	{
		act.contextClick(utils.getElement("", ""));
		act.clickAndHold();
		act.moveByOffset(500, 500);
		act.release();
		act.doubleClick();
	}
	
}
