package stepdefinition;


import org.junit.Assert;

import com.digisoft.selenium.basics.utils.ActitimeUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeStepDefinitions extends ActitimeUtils
{

	
	@Given("user is on Login page")
	public void user_is_on_login_page() {
		getDriver();
	    launch();
	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	   // login("admin", "manager");
		type("id", "username", "admin");
		type("name", "pwd", "manager");
	}
	@When("click on login button")
	public void click_on_login_button() {
		click("id", "loginButton");
		pauseExecution(10000);
		

	}
	@Then("Appliction dashboard page is dispalyed")
	public void appliction_dashboard_page_is_dispalyed() {
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	}

}
