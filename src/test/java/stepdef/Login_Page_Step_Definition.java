package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import drivers.DriverInstance;
import pObject.Login;

public class Login_Page_Step_Definition extends Login {

	
	
	
	@Given("user should navigate to the application")
	public void userShouldNavigateToTheApplication() {
		navigateFabIndia();
	}

	@Given("user should move to login dropdown and click Log-in")
	public void userShouldMoveToLoginDropdownAndClickLogIn() {
		loginDropdown();
	}

	@Given("user should click the Email Radio Button")
	public void userShouldClickTheEmailRadioButton() {
		clickonEmail();
	   
	}

	@Given("user should enter the username {string}")
	public void userShouldEnterTheUsername(String email) {
	    enterUsername(email);
	}

	@Given("user should enter the passkey {string}")
	public void userShouldEnterThePasskey(String password) throws InterruptedException {
	    enterPassword(password);
	}

	@Then("user should click the login button")
	public void userShouldClickTheLoginButton() throws InterruptedException {
	   
		clickSubmit();
		
	}
}
