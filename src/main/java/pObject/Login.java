package pObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriverInstance;

public class Login extends DriverInstance {
	
	private String site = "https://www.fabindia.com/";
	private String loginDropdown = "//button[@class='border-0 bg-transparent']";
	private String loginBtn = "//button[@class='dropdown-item' and text()=' Log In ']";
	private String emailRadioButton = "//input[@id='emailLoginRadio']";
	private String userName = "//input[@id='logiemail']";
	private String passkey = "//input[@id='logipass']";
	private String submitBtn = "//button[@id='send-otp']";
	
	public void navigateFabIndia()
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(site);
	}
	
	public void loginDropdown() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(loginDropdown)).click();
	    driver.findElement(By.xpath(loginBtn)).click();
	}
	public void clickonEmail()
	{
		driver.findElement(By.xpath(emailRadioButton)).click();
	}
	
	public void enterUsername(String email)
	{
		driver.findElement(By.xpath(userName)).sendKeys(email);
	}
	
	public void enterPassword(String password) throws InterruptedException {
		driver.findElement(By.xpath(passkey)).sendKeys(password);
	    Thread.sleep(3000);
	}
	
	public void clickSubmit() throws InterruptedException {
		driver.findElement(By.xpath(submitBtn)).click();
		   Thread.sleep(4000);
	}

}
