# PortalAcdtEdu

How to run:

Update the browser name in config.properties under src/test/resoureces/config
 Example :Browser=firefox/Chrome

If you are using Eclipse then go to  pakacge com.abhinavautomation.action-->TestRunner.class and update the tag which you want to run it.
Tag can be found in feature file.

Then right click the TestRunner.class and click Run as -->Junit test

Or

you can go to cmd/terminal
 
navigate to project

type this: mvn clean install

IF youwant to override the Testrunner tag then pass from terminal 
Runing from Terminal/cmd with updated tag
mvn clean install -DCucumber.options="-t @login1"

BrowserDriver:

Drivers will download automatically.No need to download browser driver

Reports:
We are gererating  report1 Under Target folder 

1.->Cucumber-html-report-->index.html

details report with pass and fail count and screen shot for failed step




