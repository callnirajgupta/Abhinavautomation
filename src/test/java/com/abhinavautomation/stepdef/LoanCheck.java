package com.abhinavautomation.stepdef;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import com.abhinavautomation.pageobject.HomePage;
import com.abhinavautomation.util.SeleniumUtil;

import cucumber.api.java.en.When;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.core.har.HarEntry;

public class LoanCheck {
	
	@When("^user click on Do the check button$")
	public void clickdoCheckButtton() {
		HomePage.clickDoeDeCheck();
	}
	
	@When("^user enter about company details as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_about_company_details_as_and_and_and_and(String company,String loanAmount,String reason,String nttb,String complex) throws Throwable {
		HomePage.enterCompanyData(company, loanAmount, reason, nttb, complex); 
	
	}
	
	@When("^user click on start applcation$")
	public void user_click_on_start_applcation() throws Throwable {
		HomePage.clickStartApplication();
	}

	@When("^user click on transaction data$")
	public void user_click_on_transaction_data() throws Throwable {
		HomePage.clickTransactionData();
	}

	@When("^user click on consent transaction data$")
	public void user_click_on_consent_transaction_data() throws Throwable {
		HomePage.clickConsentTransactionData();
	}

	@When("^user click on share transaction data$")
	public void user_click_on_share_transaction_data() throws Throwable {
		HomePage.clickShareTransactionData();
	}

	@When("^user selfupload file \"([^\"]*)\"$")
	public void user_selfupload_file(String fileName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.clickSelfUploadFile();
		HomePage.fileUpload(fileName);
	}

	@When("^user click on complete button$")
	public void user_click_on_complete_button() throws Throwable {
		HomePage.clickCompleteBtn();
	}

	@When("^user enter annual figure as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_annual_figure_as_and_and(String yearly, String net, String dep) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage.enterAnnualFigure(yearly, net, dep);
	}

	
	@When("^user click on nee button$")
	public void clickNee() throws InterruptedException {
		HomePage.clickNeeBtn();
		//HomePage.clickSkip();
		
	}
	@When("^user click on next button$")
	public void clickNext() throws InterruptedException {
		HomePage.clickNextBtn();
		HomePage.clickSkip();
	}
	
	@When("^user click on view offer button$")
	public void clickViewOffer() {
		HomePage.clickViewOfferBtn();
	}
	
	@When("^user click on (\\d+) apply button$")
	public void clickapplybtn(int buttonId) {
		HomePage.clickApplyDirectly(buttonId);
	}
	@When("^user enter data for financing immediately as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_data_for_financing_immediately_as_and_and_and(String firstName, String lastName, String email, String phone) throws Throwable {
		
			HomePage.enterfinancing(1,firstName, lastName, email, phone,2);
		
	}
	@When("^user enter data for discuss your options as \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_data_for_discuss_your_options_as_and_and_and(String firstName, String lastName, String email, String phone) throws Throwable {
		
			HomePage.enterfinancing(0,firstName, lastName, email, phone,0);
		
	}
	
	@When("^user click on personal offer$")
	public void clickPersonalofffer() {
		HomePage.clickPersonalOfferBtn();
		/*
		 * final Har httpMessages = SeleniumUtil.proxyServer.getHar(); for(HarEntry
		 * httpMessage : httpMessages.getLog().getEntries()){
		 * 
		 * // check no errors on the XHR requests
		 * if(httpMessage.getRequest().getUrl().contains("/messageset")) {
		 * Assert.assertEquals(200, httpMessage.getResponse().getStatus()); } }
		 */
	}
	
	@When("^user click on leave data$")
	public void clickLeaveData() throws InterruptedException {
		HomePage.clickLeaveData();
		/*
		 * LogEntries jsErrors =
		 * SeleniumUtil.getDriver().manage().logs().get(LogType.PERFORMANCE);
		 * 
		 * System.out.println("Print all Log"+jsErrors.getAll()); String scriptToExecute
		 * =
		 * "var performance = window.performance || window.mozPerformance || window.msPerformance || window.webkitPerformance || {}; var network = performance.getEntries() || {}; return network;"
		 * ; String netData =
		 * ((JavascriptExecutor)SeleniumUtil.getDriver()).executeScript(scriptToExecute)
		 * .toString(); System.out.println("network data"+netData);
		 */
     
}
}
