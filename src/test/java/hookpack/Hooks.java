package hookpack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import drivers.DriverInstance;

public class Hooks extends DriverInstance{

	@After
	public void afterScenarios(Scenario sc) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] shots = ts.getScreenshotAs(OutputType.BYTES);
		sc.embed(shots, "image/png");
		
		
	}
	
}
