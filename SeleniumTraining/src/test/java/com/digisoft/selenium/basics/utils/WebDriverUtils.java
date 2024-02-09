package com.digisoft.selenium.basics.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {
	
	public WebDriver driver = null;
	public WebDriverWait wait = null;

	
	/**
	 * @author Aravind
	 * @param type - chrome, edge, ff, opera, ie
	 * @return - returns Brower object based on the type
	 * By default browser is maximized and set to a default implicit wait of 20 sec
	 */
	public WebDriver getDriver(String type) {
		System.out.println("Creating a browser of type : " + type);
		switch (type) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "ff":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "opera":
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		default:
			driver = null;
			System.out.println("Please check the driver type, OR contact framework developers");
			break;
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 30);

		return driver;

	}

	public WebElement getElement(String identifier, String value) {
		System.out.println("finding Element using " + identifier + " and " + value);
		WebElement ele = null;
		switch (identifier.toLowerCase()) {
		case "id":
			ele = driver.findElement(By.id(value));
			break;

		case "name":
			ele = driver.findElement(By.name(value));
			break;

		case "classname":
			ele = driver.findElement(By.className(value));
			break;

		case "tagname":
			ele = driver.findElement(By.tagName(value));
			break;

		case "linktext":
			ele = driver.findElement(By.linkText(value));
			break;

		case "partiallinktext":
			ele = driver.findElement(By.partialLinkText(value));
			break;

		case "css":
			ele = driver.findElement(By.cssSelector(value));
			break;

		case "xpath":
			ele = driver.findElement(By.xpath(value));
			break;

		default:
			System.out.println("Please check the identifier, OR contact framework developers");
			break;
		}
		
		return ele;
	}

	public void click(String identifier, String value)
	{
		System.out.println("performing click on element");
		getElement(identifier, value).click();
		System.out.println("performing click on element - Complete");
	}
	
	public void type(String identifier, String value, String texttoEnter)
	{
		System.out.println("Performing type operation on the element "  + texttoEnter);
		getElement(identifier, value).sendKeys(texttoEnter);
		System.out.println("Performing type operation on the element "  + texttoEnter + " is complete");
		
	}
	
	public String getAttribute(String identifier, String value, String attributeValue)
	{
		return getElement(identifier, value).getAttribute(attributeValue);
	}
	public String getText(String identifier, String value)
	{
		return getElement(identifier, value).getText();
	}
	
	public List<WebElement> getElements(String identifier, String value)
	{
		List<WebElement> ele = null;
		switch (identifier.toLowerCase()) {
		case "id":
			ele = driver.findElements(By.id(value));
			break;

		case "name":
			ele = driver.findElements(By.name(value));
			break;

		case "classname":
			ele = driver.findElements(By.className(value));
			break;

		case "tagname":
			ele = driver.findElements(By.tagName(value));
			break;

		case "linktext":
			ele = driver.findElements(By.linkText(value));
			break;

		case "partiallinktext":
			ele = driver.findElements(By.partialLinkText(value));
			break;

		case "css":
			ele = driver.findElements(By.cssSelector(value));
			break;

		case "xpath":
			ele = driver.findElements(By.xpath(value));
			break;

		default:
			System.out.println("Please check the identifier, OR contact framework developers");
			break;
		}
		return ele;
	}
	
	public void pauseExecution(int ms)
	{
		System.out.println("Application  execution is paused for " + ms + " ms");
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Application  execution is resumed from " + ms + " ms");
		
	}
	
	/**
	 * 
	 * @param identifier
	 * @param value
	 * @return - boolean based on the visibility of the element\
	 * @author Aravind
	 * 
	 */
	public boolean verifyElementisVisible(String identifier, String value)
	{
		boolean flag = false;
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(getElement(identifier, value)));
		if(ele.isDisplayed() && ele.isEnabled())
			flag = true;
		
		return flag;
	}
	
}
