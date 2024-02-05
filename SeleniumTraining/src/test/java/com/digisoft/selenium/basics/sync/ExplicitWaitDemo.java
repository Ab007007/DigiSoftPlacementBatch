package com.digisoft.selenium.basics.sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo {

	
//	file:///D:/EclipseWS/html/tiimeout.html
	
	@Test
	public void explicitWaitDemo()
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("file:///D:/EclipseWS/html/tiimeout.html");
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		
		System.out.println(element.getText());
		System.out.println(driver.findElement(By.id("demo2")).getText());
		
		
		
		
		
	}
}
