package com.digisoft.selenium.basics.sync;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWaitDemo {

//	file:///D:/EclipseWS/html/tiimeout.html

	@Test
	public void fluentWaitDemo() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("file:///D:/EclipseWS/html/tiimeout.html");
		driver.findElement(By.tagName("button")).click();

//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		
//		WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
//		

		//STEP-1
		FluentWait<WebElement> wait = new FluentWait<WebElement>
				(driver.findElement(By.id("demo")))
				.pollingEvery(Duration.ofMillis(100)).withTimeout(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class).ignoring(Exception.class);
		
		
		//STEP-2
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() 
		{

			@Override
			public Boolean apply(WebElement ele) 
			{
				boolean flag = false;
				if(!ele.isDisplayed())
				{
					System.out.println("Waiting for the element!!!!");
				}
				else
				{
					flag = true;
					System.out.println("Element Displayed");
				}
				return flag;
				
			}
		};
		
		
		wait.until(fun);
		System.out.println(driver.findElement(By.id("demo")).getText());
		System.out.println(driver.findElement(By.id("demo2")).getText());

	}
}
