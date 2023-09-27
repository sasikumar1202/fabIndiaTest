package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.tlh.ach;
import drivers.DriverInstance;
import pObject.Kids;

public class Kids_Page_Step_Definition extends Kids  {

	
	@Given("user should click the kids section")
	public void userShouldClickTheKidsSection() {
		kidsSelect();
	}


	@Given("user should click the boys ethnic wear section in the below dropdown")
	public void userShouldClickTheBoysEthnicWearSectionInTheBelowDropdown() throws InterruptedException {
		selectBoysEthnic();
	
	}

	@Given("user should click the size and select")
	public void userShouldClickTheSizeAndSelect() {
		sizeSelect();
	}
	
	@Given("user should click the category and select {string}")
	public void userShouldClickTheCategoryAndSelect(String dress) {
		categoryAndDress(dress);
		
	}

	
}
