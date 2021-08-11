package org.stepdefinition;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClassCreation;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClassCreation {
	
	@Before
	public void beforeClass() {
	HooksClass h=new HooksClass();
	h.getdriver("chrome");
	h.getUrl("https://adactinhotelapp.com/");
	
	 
		
	}
	@After
	public void afterClass(Scenario sc) {
		if (sc.isFailed()) {
			TakesScreenshot js=(TakesScreenshot)driver;
			byte[] screenshotAs = js.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshotAs, sc.getName()+".png");
			driver.quit();			
		}
	}

}
