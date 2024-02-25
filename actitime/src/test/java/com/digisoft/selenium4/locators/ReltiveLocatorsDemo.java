package com.digisoft.selenium4.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.digisoft.pom.actitime.util.WebDriverUtils;

public class ReltiveLocatorsDemo extends WebDriverUtils
{
	static int counter = 1;
	@BeforeMethod
	public void createDriver()
	{
		test = reports.createTest("Relative TestCase ID : Test_" + counter++);
		driver = getDriver();
		
	}
	
	@AfterMethod
	public void closeDriver()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	@Test
	public void toRightOfDemo()
	{
		test.log(Status.INFO, "Test to find element to the right using Relative locator");
		launch("https://en.wikipedia.org/wiki/KGF:_Chapter_1");
		
		WebElement directedByWE = driver.findElement(By.xpath("//th[text()='Directed by']"));
		
		WebElement directorName = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(directedByWE));
	
	
		System.out.println("Director Name : " + directorName.getText());
		
		directorName.click();
		
		System.out.println("TITLE : "  + driver.getTitle());
	
	}

	
	
	
	@Test
	public void toLeftOfDemo()
	{
		launch("https://jqueryui.com/button/");
		
		driver.switchTo().frame(0);
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='A submit button']"));
		
		WebElement buttonEle = driver.findElement(RelativeLocator.with(By.tagName("button")).toLeftOf(submitButton));
	
	
		System.out.println("Text Name : " + buttonEle.getText());
		
		
		System.out.println("TITLE : "  + driver.getTitle());
	
	}

	
	@Test
	public void toBelowAndLeftOfDemo()
	{
		launch("https://jqueryui.com/button/");
		
		driver.switchTo().frame(0);
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='A submit button']"));
		
		WebElement headingText = driver.findElement(By.xpath("//h1[text()='Widget Buttons']"));
		
		
		WebElement buttonEle = driver.findElement(RelativeLocator.with(By.tagName("button")).toLeftOf(submitButton).below(headingText));
	
	
		System.out.println("Text Name : " + buttonEle.getText());
		
		
		System.out.println("TITLE : "  + driver.getTitle());
	
	}
	
	@Test
	public void nearDemo()
	{
		launch("https://jqueryui.com/button/");
		
		driver.switchTo().frame(0);
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='A submit button']"));
		
		WebElement buttonEle = driver.findElement(RelativeLocator.with(By.tagName("button")).near(submitButton));
	
	
		System.out.println("Text  : " + buttonEle.getText());
		
		
		System.out.println("TITLE : "  + driver.getTitle());
	
	}
	
	

	@Test
	public void aboveDemo()
	{
		launch("https://jqueryui.com/button/");
		
		driver.switchTo().frame(0);
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='A submit button']"));
		
		WebElement buttonEle = driver.findElement(RelativeLocator.with(By.tagName("h1")).above(submitButton));
	
	
		System.out.println("H1 Text : " + buttonEle.getText());
		
		
		System.out.println("TITLE : "  + driver.getTitle());
	
	}

}
