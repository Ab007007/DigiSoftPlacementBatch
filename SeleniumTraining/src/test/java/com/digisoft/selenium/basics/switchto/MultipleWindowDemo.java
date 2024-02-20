package com.digisoft.selenium.basics.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.digisoft.selenium.basics.utils.ActitimeUtils;

public class MultipleWindowDemo extends ActitimeUtils
{
	
	@Test
	public void printAllEmailIDs()
	{
		getDriver();
		launch("https://www.irctc.co.in/eticketing/errors.html#");
		click("linktext", "Contact Us");
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		String parentID = it.next();
		String childID = it.next();
		
		System.out.println("Parent ID : " + parentID);
		System.out.println("child ID : " + childID);
		
		driver.switchTo().window(childID);
		
		List<WebElement> emailIds = getElements("tagname", "a");
		for (WebElement emailID : emailIds)
		{
			System.out.println(emailID.getText());
			
		}
		
		closeDriver();
		
		driver.switchTo().window(parentID);
		List<WebElement> links = getElements("tagname", "a");
		for (WebElement link : links)
		{
			System.out.println(link.getText());
			
		}
		
		closeDriver();
	}

}
