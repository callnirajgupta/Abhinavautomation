
package com.abhinavautomation.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featurefile/", tags = {
		"@login1" }, plugin = { "pretty", "html:target/cucumber-html-report",
				"json:target/cucumber.json", "junit:target/cucumber.xml"
				 }, glue = { "com.abhinavautomation" })

public class TestRunner {
	
	@BeforeClass
	public static void beforeClass() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		System.setProperty("currentdate", dateFormat.format(new Date()));
		
	}

	
	
	
    

}
