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

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {
	public WebDriver driver = null;

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

		return driver;

	}

	public WebElement getElement(String identifier, String value) {
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
		getElement(identifier, value).click();
	}
	
	public void type(String identifier, String value, String texttoEnter)
	{
		getElement(identifier, value).sendKeys(texttoEnter);
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
		return null;
	}
}
