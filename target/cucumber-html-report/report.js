$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ApplyLoan.feature");
formatter.feature({
  "line": 2,
  "name": "Mandatory field validation of login page",
  "description": "",
  "id": "mandatory-field-validation-of-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Field validation of email address  and password and captcha in login page",
  "description": "",
  "id": "mandatory-field-validation-of-login-page;field-validation-of-email-address--and-password-and-captcha-in-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@login1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user navigates to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on Do the check button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter about company details as \"\u003cCOMPANY_NAME\u003e\" and \"\u003cLOAN_AMOUNT\u003e\" and \"\u003cSELECT_REASON\u003e\" and \"\u003cSELECT_NTTB\u003e\" and \"\u003cSELECT_COMPLEX\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on start applcation",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on transaction data",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click on consent transaction data",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on share transaction data",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user selfupload file \"\u003cFILE_NAME\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user click on complete button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enter annual figure as \"\u003cYEARLY_REVENUE\u003e\" and \"\u003cNET_PROFIT\u003e\" and \"\u003cDEPRECIATION\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user click on nee button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user click on view offer button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user click on 1 apply button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user enter data for financing immediately as \"\u003cFIRST_NAME\u003e\" and \"\u003cLAST_NAME\u003e\" and \"\u003cEMAIL\u003e\" and \"\u003cPHONE\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user click on personal offer",
  "keyword": "And "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "mandatory-field-validation-of-login-page;field-validation-of-email-address--and-password-and-captcha-in-login-page;",
  "rows": [
    {
      "cells": [
        "COMPANY_NAME",
        "LOAN_AMOUNT",
        "SELECT_REASON",
        "SELECT_NTTB",
        "SELECT_COMPLEX",
        "FILE_NAME",
        "YEARLY_REVENUE",
        "NET_PROFIT",
        "DEPRECIATION",
        "FIRST_NAME",
        "LAST_NAME",
        "EMAIL",
        "PHONE"
      ],
      "line": 24,
      "id": "mandatory-field-validation-of-login-page;field-validation-of-email-address--and-password-and-captcha-in-login-page;;1"
    },
    {
      "cells": [
        "Flevo Landscaping B.V.",
        "56000",
        "werkkapitaal",
        "Niet Rabobank",
        "een bedrijf",
        "RABO_ExLow-PD_v2.swi",
        "780000",
        "670000",
        "1200",
        "Abhinav",
        "Jain",
        "abhinav.jain@rabobank.nl",
        "0647852992"
      ],
      "line": 25,
      "id": "mandatory-field-validation-of-login-page;field-validation-of-email-address--and-password-and-captcha-in-login-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 57323600,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Field validation of email address  and password and captcha in login page",
  "description": "",
  "id": "mandatory-field-validation-of-login-page;field-validation-of-email-address--and-password-and-captcha-in-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 4,
      "name": "@login1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user navigates to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on Do the check button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter about company details as \"Flevo Landscaping B.V.\" and \"56000\" and \"werkkapitaal\" and \"Niet Rabobank\" and \"een bedrijf\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on start applcation",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on transaction data",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click on consent transaction data",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on share transaction data",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user selfupload file \"RABO_ExLow-PD_v2.swi\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user click on complete button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user enter annual figure as \"780000\" and \"670000\" and \"1200\"",
  "matchedColumns": [
    6,
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user click on nee button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user click on view offer button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user click on 1 apply button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user enter data for financing immediately as \"Abhinav\" and \"Jain\" and \"abhinav.jain@rabobank.nl\" and \"0647852992\"",
  "matchedColumns": [
    9,
    10,
    11,
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user click on personal offer",
  "keyword": "And "
});
formatter.match({
  "location": "GlobalStepDefinition.user_navigates_to_Home_page()"
});
formatter.result({
  "duration": 9469281400,
  "status": "passed"
});
formatter.match({
  "location": "LoanCheck.clickdoCheckButtton()"
});
formatter.result({
  "duration": 114320100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Flevo Landscaping B.V.",
      "offset": 37
    },
    {
      "val": "56000",
      "offset": 66
    },
    {
      "val": "werkkapitaal",
      "offset": 78
    },
    {
      "val": "Niet Rabobank",
      "offset": 97
    },
    {
      "val": "een bedrijf",
      "offset": 117
    }
  ],
  "location": "LoanCheck.user_enter_about_company_details_as_and_and_and_and(String,String,String,String,String)"
});
formatter.result({
  "duration": 2826305600,
  "status": "passed"
});
formatter.match({
  "location": "LoanCheck.user_click_on_start_applcation()"
});
formatter.result({
  "duration": 1814853900,
  "status": "passed"
});
formatter.match({
  "location": "LoanCheck.user_click_on_transaction_data()"
});
formatter.result({
  "duration": 356522600,
  "status": "passed"
});
formatter.match({
  "location": "LoanCheck.user_click_on_consent_transaction_data()"
});
formatter.result({
  "duration": 66918200,
  "status": "passed"
});
formatter.match({
  "location": "LoanCheck.user_click_on_share_transaction_data()"
});
formatter.result({
  "duration": 864140400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RABO_ExLow-PD_v2.swi",
      "offset": 22
    }
  ],
  "location": "LoanCheck.user_selfupload_file(String)"
});
formatter.result({
  "duration": 9489045600,
  "status": "passed"
});
formatter.match({
  "location": "LoanCheck.user_click_on_complete_button()"
});
formatter.result({
  "duration": 94009000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "780000",
      "offset": 29
    },
    {
      "val": "670000",
      "offset": 42
    },
    {
      "val": "1200",
      "offset": 55
    }
  ],
  "location": "LoanCheck.user_enter_annual_figure_as_and_and(String,String,String)"
});
formatter.result({
  "duration": 2285993000,
  "status": "passed"
});
formatter.match({
  "location": "LoanCheck.clickNee()"
});
formatter.result({
  "duration": 68067400,
  "status": "passed"
});
formatter.match({
  "location": "LoanCheck.clickNext()"
});
formatter.result({
  "duration": 63388300,
  "status": "passed"
});
formatter.match({
  "location": "LoanCheck.clickViewOffer()"
});
formatter.result({
  "duration": 30057151900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[text()\u003d\u0027Bekijk nu je aanbod\u0027]\"}\n  (Session info: chrome\u003d90.0.4430.212)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-GDMII1S\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.10\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.212, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:50618}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 8b83a2e4b808f185cf3964c6d2e34fa7\n*** Element info: {Using\u003dxpath, value\u003d//button[text()\u003d\u0027Bekijk nu je aanbod\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.abhinavautomation.util.SeleniumUtil.getWebElement(SeleniumUtil.java:179)\r\n\tat com.abhinavautomation.pageobject.HomePage.clickViewOfferBtn(HomePage.java:142)\r\n\tat com.abhinavautomation.stepdef.LoanCheck.clickViewOffer(LoanCheck.java:75)\r\n\tat ✽.And user click on view offer button(ApplyLoan.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 14
    }
  ],
  "location": "LoanCheck.clickapplybtn(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Abhinav",
      "offset": 46
    },
    {
      "val": "Jain",
      "offset": 60
    },
    {
      "val": "abhinav.jain@rabobank.nl",
      "offset": 71
    },
    {
      "val": "0647852992",
      "offset": 102
    }
  ],
  "location": "LoanCheck.user_enter_data_for_financing_immediately_as_and_and_and(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoanCheck.clickPersonalofffer()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 176452200,
  "status": "passed"
});
});