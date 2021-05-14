@login @Regression
Feature: Mandatory field validation of login page

  @login1
  Scenario Outline: Field validation of email address  and password and captcha in login page
    Given user navigates to home page
    When user click on Do the check button
    And user enter about company details as "<COMPANY_NAME>" and "<LOAN_AMOUNT>" and "<SELECT_REASON>" and "<SELECT_NTTB>" and "<SELECT_COMPLEX>"
    And user click on start applcation
    And user click on transaction data
    And user click on consent transaction data
    And user click on share transaction data
    And user selfupload file "<FILE_NAME>"
    And user click on complete button
    And user enter annual figure as "<YEARLY_REVENUE>" and "<NET_PROFIT>" and "<DEPRECIATION>"
    And user click on nee button
    And user click on next button
    And user click on view offer button
    And user click on 1 apply button 
    And user enter data for financing immediately as "<FIRST_NAME>" and "<LAST_NAME>" and "<EMAIL>" and "<PHONE>"
    And user click on personal offer
    
    Examples: 
      | COMPANY_NAME             | LOAN_AMOUNT |SELECT_REASON  | SELECT_NTTB   |SELECT_COMPLEX|FILE_NAME|YEARLY_REVENUE|NET_PROFIT|DEPRECIATION|FIRST_NAME|LAST_NAME|EMAIL|PHONE|
      | Flevo Landscaping B.V.   | 56000       |werkkapitaal   | Niet Rabobank |een bedrijf|RABO_ExLow-PD_v2.swi|780000|670000|1200|Abhinav|Jain|abhinav.jain@rabobank.nl|0647852992|
      
     