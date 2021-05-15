package com.abhinavautomation.pageobject;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abhinavautomation.util.SeleniumUtil;

public class HomePage {
	
	public static final By ACCEPT_COOKIES =By.xpath("//button[text()='Cookies akkoord']");
	public static final By DOE_DE_CHECK =By.xpath("//button[@class='button primary width-100 margin-bottom-0' and text()='Doe de check']");
	public static final By COMPANY_NAME =By.xpath("//input[@id='companySearch']");
	public static final By COMPANY_NAME_SELECT =By.xpath("//ul[@class='resultDropdown']/li/p");
	public static final By LOAN_AMOUNT =By.xpath("//input[@id='loanAmount']");
	public static final By SELECT_REASON =By.id("selectedReason");
	public static final By SELECT_NTTB =By.id("NTTB");
	public static final By SELECT_COMPLEX =By.id("isComplex");
	public static final By CHECK_OPTION =By.xpath("//button[text()='Check je mogelijkheden']");
	public static final By START_APPLICATION =By.xpath("//button[text()='Start aanvraag']");
	public static final By TRANSACTION_DATA =By.xpath("//p[text()='geef inzicht in de transactiegegevens']");
	public static final By CONSENT_TRANSACTION_DATA =By.id("give-consent-btn");
	public static final By SHARE_TRANSACTION_DATA =By.xpath("//p[text()='Deel de transactiegegevens']");
	public static final By SELF_UPLOAD_FILE =By.xpath("//li[text()='Zelf uploaden']");
	public static final By SELECT_FILE =By.xpath("//label[text()='Selecteer bestand om te uploaden']");
	public static final String UPLOADED_FILE ="//p[text()='fileName']";
	public static final By COMPLETE_BTN =By.id("complete-tx-btn");
	public static final By YEARLY_REVENUE =By.id("yearlyRevenue");
	public static final By NET_PROFIT =By.id("netProfit");
	public static final By DEPRECIATION =By.xpath("//input[@id='depreciation']");
	public static final By NEE=By.xpath("//li[text()='Nee']");
	public static final By NEXT_BTN =By.id("complete-mbc-btn");
	public static final By VIEW_OFFER =By.xpath("//button[text()='Bekijk nu je aanbod']");
	public static final By APPLY_DIRECTLY =By.xpath("//button[text()='Direct aanvragen']");
	public static final By FIRST_NAME =By.id("firstname");
	public static final By LAST_NAME =By.id("lastname");
	public static final By EMAIL =By.id("email");
	public static final By PHONE =By.xpath("//input[@id='phone']");
	public static final By PERSONAL_OFFER =By.xpath("//button[text()='Ontvang indicatief persoonlijk aanbod']");
	public static final By RENTING_STEP_SKIP =By.xpath("//span[text()='Volgende stap']");

	
	
	
	
	
	
	
	
	
	
	


	
	public static void acceptCookies() {
		List<WebElement> elementList=SeleniumUtil.getWebElements(ACCEPT_COOKIES);
		if(elementList.size()>0) {
			elementList.get(0).click();
		}
	}

	public static void clickDoeDeCheck() {
		
		SeleniumUtil.getWebElement(DOE_DE_CHECK).click();
		
	}
	
	public static void enterCompanyData(String company,String loanAmount,String reason,String nttb,String complex) throws InterruptedException {
		SeleniumUtil.getWebElement(COMPANY_NAME).sendKeys(company);
		Thread.sleep(2000);
		SeleniumUtil.getWebElement(COMPANY_NAME_SELECT).click();
		SeleniumUtil.getWebElement(LOAN_AMOUNT).sendKeys(loanAmount);
		SeleniumUtil.selectWebList(SELECT_REASON, reason, "selectByVisibleText");
		SeleniumUtil.selectWebList(SELECT_NTTB, nttb, "selectByVisibleText");
		SeleniumUtil.selectWebList(SELECT_COMPLEX, complex, "selectByVisibleText");
		SeleniumUtil.getWebElement(CHECK_OPTION).click();
		
		
		
	}
	
	public static void clickStartApplication() {
		
		SeleniumUtil.getWebElement(START_APPLICATION).click();
	}
	
    public static void clickTransactionData() {
		
		SeleniumUtil.getWebElement(TRANSACTION_DATA).click();
	}
    public static void clickConsentTransactionData() {
		
		SeleniumUtil.getWebElement(CONSENT_TRANSACTION_DATA).click();
	}
    
   public static void clickShareTransactionData() {
		
		SeleniumUtil.getWebElement(SHARE_TRANSACTION_DATA).click();
	}
   public static void clickSelfUploadFile() {
		
		SeleniumUtil.getWebElement(SELF_UPLOAD_FILE).click();
	}
   public static void fileUpload(String fileName) throws Throwable {
		
		SeleniumUtil.getWebElement(SELECT_FILE).click();
		File file = new File("src/test/resources/Upload/"+fileName);
		String path = file.getAbsolutePath();
		//String path="https://aucdt.edu.gh/img/AUCDT-Logo-for-Website.png";
		System.out.println("path of file "+path);
		Thread.sleep(2000);
		SeleniumUtil.robotUploadFile(path);
		SeleniumUtil.validateWebElementVisible(By.xpath(UPLOADED_FILE.replace("fileName", fileName)), 20000);
		Thread.sleep(2000);
		
		
		
	}
   public static void clickCompleteBtn() {
		
		SeleniumUtil.getWebElement(COMPLETE_BTN).click();
	}
   
   public static void enterAnnualFigure(String yearlyRevenue,String netProfit,String depreciation ) {
	   SeleniumUtil.getWebElement(YEARLY_REVENUE).sendKeys(yearlyRevenue);
	   SeleniumUtil.getWebElement(NET_PROFIT).sendKeys(netProfit);
	   SeleniumUtil.getWebElement(DEPRECIATION).sendKeys(depreciation);
	}
 
   public static void clickNeeBtn() throws InterruptedException {
	   SeleniumUtil.validateWebElementVisible(NEE, 30);
	   Thread.sleep(2000);
		SeleniumUtil.getWebElement(NEE).click();
	}
   public static void clickNextBtn() {
		
		SeleniumUtil.getWebElement(NEXT_BTN).click();
	}
   public static void clickViewOfferBtn() {
		
		SeleniumUtil.getWebElement(VIEW_OFFER).click();
	}
   public static void clickApplyDirectly(int butttonId) {
		
		List<WebElement> elementList=SeleniumUtil.getWebElements(APPLY_DIRECTLY);
		elementList.get(butttonId).click();
	}
   
   public static void enterfinancing(String FirstName,String lastName,String email ,String phone) {
	   SeleniumUtil.getWebElements(FIRST_NAME).get(1).sendKeys(FirstName);
	   SeleniumUtil.getWebElements(LAST_NAME).get(1).sendKeys(lastName);
	   SeleniumUtil.getWebElements(EMAIL).get(1).sendKeys(email);
	   SeleniumUtil.getWebElements(PHONE).get(2).sendKeys(phone);
	}
   
   
  
   public static void clickPersonalOfferBtn() {
		
		SeleniumUtil.getWebElements(PERSONAL_OFFER).get(1).click();
	}
   public static void clickSkip() throws InterruptedException {
	   SeleniumUtil.validateWebElementVisible(RENTING_STEP_SKIP, 30);
	   Thread.sleep(2000);
		SeleniumUtil.getWebElement(RENTING_STEP_SKIP).click();
	}
	
  
}
