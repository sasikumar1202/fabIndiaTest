package pObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverInstance;

public class Kids extends DriverInstance {

	private String kidsBtn = "//nav/span/cx-generic-link/a[@class='all' and @href='/kids']/p";
	private String ethnicSets = "//a[@href='/clothing/girls-ethnic-sets']";
	private String category = "//button[text()=' Category ']/cx-icon[@class='expand-icon cx-icon fas fa-angle-down']";
	private String dresspath = "//label[text()=' Kurta Sets ']";
	private String size = "//button[text()=' Size ']/cx-icon[@class='expand-icon cx-icon fas fa-angle-down']";
	private String sizeclick = "//label[@class='label mobileFacet-filter-label' and text()=' 12-14Y ']";
	
	public void kidsSelect()  {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(kidsBtn))));
	    driver.findElement(By.xpath(kidsBtn)).click();
	}
	public void selectBoysEthnic() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath(ethnicSets)).click();
	}
	
	public void sizeSelect() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(size))));
		driver.findElement(By.xpath(size)).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(sizeclick))));
		driver.findElement(By.xpath(sizeclick)).click();
	}
	public void categoryAndDress(String dress) {
		driver.findElement(By.xpath(category)).click();
		driver.findElement(By.xpath("//label[text()=' "+dress+" ']")).click();
	}
	
	
	
	
}
