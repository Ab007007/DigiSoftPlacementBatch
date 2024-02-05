package com.digisoft.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicOperations {

	@Test
	public void formFill() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		Thread.sleep(2000);
		WebElement firstNameTextBox = driver.findElement(By.id("first-name"));
		firstNameTextBox.sendKeys("Aravinda");
		Thread.sleep(2000);
		
		driver.findElement(By.id("last-name")).sendKeys("HB");
		Thread.sleep(2000);
		driver.findElement(By.id("job-title")).sendKeys("Trainer");
		Thread.sleep(2000);
		
		WebElement radioButton = driver.findElement(By.id("radio-button-1"));
		if(radioButton.isEnabled())
		{
			if(!radioButton.isSelected())
			{
				radioButton.click();
			}
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkbox-1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		Thread.sleep(2000);
		
		WebElement successMsg = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
	
		System.out.println(successMsg.getText());
		driver.close();
		
	}
	
	
}
