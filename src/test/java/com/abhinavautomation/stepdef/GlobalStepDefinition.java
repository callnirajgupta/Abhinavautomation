package com.abhinavautomation.stepdef;

import java.util.logging.Level;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.abhinavautomation.pageobject.HomePage;
import com.abhinavautomation.util.SeleniumUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


public class GlobalStepDefinition {
	
	private static final Logger LOGGER = LogManager.getLogger(GlobalStepDefinition.class);
	//public WebDriver driver=null;

	@Before()
	public void Setup(Scenario scenario) {
		LOGGER.info("Inside Setup method");
		SeleniumUtil.getInstance();
	}
	
	
	
	@Given("^user navigates to home page$")
	public void user_navigates_to_Home_page() throws Throwable {
		LOGGER.info("user navigates to login page");
		if (Boolean.FALSE.equals(SeleniumUtil.driverStatus)) {
			SeleniumUtil.getDriver();
			SeleniumUtil.maximizeBrowser();
			 //((RemoteWebDriver) SeleniumUtil.getDriver()).setLogLevel(Level.INFO);
		}
		SeleniumUtil.launchApplication(SeleniumUtil.getConfigProperties().getProperty("HomePageUrl"));
		SeleniumUtil.ImplicitWait();
		HomePage.acceptCookies();
		
		
	}
	
	
	
	@After()
	public void TearDown(Scenario scenario) {
		LOGGER.info("Inside Teardown method");

		if (scenario.isFailed()) {
			LOGGER.debug("###################  i am inside screen shot after fail ####################");
			final byte[] screenshot = ((TakesScreenshot) SeleniumUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			

		}
		if (SeleniumUtil.getDriver() != null) {
			
			SeleniumUtil.closeBrowser();
			SeleniumUtil.setDriver(null);
			SeleniumUtil.driverStatus=false;
		}

		
	}
	
	

}
