package com.digisoft.selenium.basics.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserOperations {

	@Test
	public void browserOperations() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(30000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println("Current URL : " + driver.getCurrentUrl());
		System.out.println("Current TITLE : " + driver.getTitle());
		driver.navigate().to("http://localhost/login.do");
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandle());
		driver.manage().window().fullscreen();
		System.out.println("Current URL : " + driver.getCurrentUrl());
		System.out.println("Current TITLE : " + driver.getTitle());
		driver.close();
	}
	
	
}
