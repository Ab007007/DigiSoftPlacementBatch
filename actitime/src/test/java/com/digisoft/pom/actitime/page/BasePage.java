package com.digisoft.pom.actitime.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.digisoft.pom.actitime.util.WebDriverUtils;

public class BasePage  extends WebDriverUtils
{
	

	public void verifyTitle(WebDriver driver, String exptecteTitle)
	{
		Assert.assertEquals(driver.getTitle(), exptecteTitle);;	
	}
	
	
	public void verifySuccessMessage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		System.out.println("Waiting for the visibility of success msg");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toasts']//span"))));
		
		System.out.println("Waiting for the In-visibility of success msg");
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toasts']//span"))));
	}
	
	public BasePage() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BasePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
