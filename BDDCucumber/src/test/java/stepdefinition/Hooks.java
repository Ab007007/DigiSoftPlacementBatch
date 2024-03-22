package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import utils.WebDriverUtils;

public class Hooks extends WebDriverUtils {

	
	
	@Before
	public void setupStep(Scenario sc)
	{
		System.out.println("************************************");
		System.out.println(sc.getName());
		System.out.println(sc.getSourceTagNames());
		System.out.println(sc.getId());
	}
	
	@AfterStep
	public void cleanupScenario(Scenario sc)
	{
		System.out.println("..........................................");
		String testName = sc.getName().replace(" " , "_");
		System.out.println("Scenario Status : " + sc.getStatus());
		if(sc.isFailed())
		{
			System.out.println("********capturing Screen shots **************");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(srcFile, new File("target\\screenshots\\" + testName + "_" + getDateAndTime() + ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
	}
	
	@Before("@dev")
	public void setupScenrioDev()
	{
		System.out.println("*******$$$$$$$$$$$$$$$$$$$$$$$$$$$$*********");
	}
	
	@After("@dev")
	public void cleanupScenarioDev()
	{
		System.out.println("##########&&&&&&&&&&&&&&&&&&&&&&&&&&&&#######");
	}
	
	
	@BeforeStep
	public void stepScenario()
	{
		System.out.println("-------------------------------------------");
	}
	
	@After
	public void afterScenrio()
	{
		System.out.println("###############################################3");
	}
}
