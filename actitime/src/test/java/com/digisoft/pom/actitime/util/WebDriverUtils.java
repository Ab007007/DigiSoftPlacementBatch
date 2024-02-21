package com.digisoft.pom.actitime.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils 
{
	
	public WebDriver driver = null;
	public WebDriverWait wait = null;
	
	public static ExtentReports reports = null;
	public static ExtentTest test = null;
	
	
	List data = null;
	File f = null;
	FileReader fr;
	BufferedReader br = null;

	
	
	@BeforeSuite
	public void conigureReports()
	{
		String date = new Date().toString().replace(":", "_").replace(" " , "_");
		ExtentSparkReporter spark = new ExtentSparkReporter("reports/ExtentReport_" + date + ".html");
		reports = new ExtentReports();
		reports.attachReporter(spark);

		System.out.println("Creating Repoerts");
	}
	
	
	@AfterSuite
	public void savingReports()
	{
		reports.flush();
	}
	public void launch(String url) {
		test.log(Status.INFO , "Launching URL : " + url);
		driver.get(url);
	
	}
	
	public WebDriver getDriver()
	{
		test.log(Status.INFO , "--- Creating a Chrome Driver Object ---");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//wait = new WebDriverWait(driver, Integer.valueOf(timeout));
		wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.valueOf(30)));

		return driver;
	}
	/**
	 * @author Aravind
	 * @param type - chrome, edge, ff, opera, ie
	 * @return - returns Brower object based on the type
	 * By default browser is maximized and set to a default implicit wait of 20 sec
	 */
	public WebDriver getDriver(String type) {
		System.out.println("Creating a browser of type : " + type);
		test.log(Status.INFO, "Creating a Browser Object " + type);
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
//			driver = new OperaDriver();
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
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		wait = new WebDriverWait(driver, Integer.valueOf(timeout));
		wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.valueOf(20)));
		test.log(Status.PASS, "Created a browser object " + type + " and configured with implicit and explict wait");
		return driver;

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
	
	
	public void verifyElementisVisibleUsingJS(WebElement ele)
	{
		test.log(Status.INFO , "verifyElementisVisibleUsingJS - Entering");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		test.log(Status.INFO , "verifyElementisVisibleUsingJS - Exiting");
		
	
	}
	
	
	public void verifyElementIsVisibleUsingFW(WebElement ele)
	{
		FluentWait<WebElement> wait = new FluentWait<WebElement>(
				ele)
				.pollingEvery(Duration.ofMillis(100)).withTimeout(Duration.ofSeconds(30))
				.ignoring(NoSuchElementException.class).ignoring(Exception.class);

//STEP-2
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {

			@Override
			public Boolean apply(WebElement ele) {
				boolean flag = false;
				if (!ele.isDisplayed()) {
					System.out.println("Waiting for the element!!!!");
				} else {
					flag = true;
					System.out.println("Element Displayed");
				}
				return flag;

			}
		};

		wait.until(fun);
	}
	
	
	public void closeDriver()
	{
		driver.close();
	}
	
	
	
	public String getDateAndTime()
	{
		return new Date().toString().replace(" " , "_").replace(":", "_");
	}
	
	public void takeScreenShot(String testName) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcFile, new File("screenshots\\" + testName + "_" + getDateAndTime() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
