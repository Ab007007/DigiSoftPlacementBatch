package com.digisoft.selenium.basics.suggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleAutoSuggestions {

	
	@Test
	public void printAutoSuggestoins() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("IBM");
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox' and @class='G43f7e']//div[@role='presentation']"));
		
		for (WebElement suggestion : suggestions)
		{
			System.out.println(suggestion.getText());
		}
		
		
	}
}
