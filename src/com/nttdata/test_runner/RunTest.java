package com.nttdata.test_runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.nttdata.drivers.WebDriverHelper;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"resources/features/E2E_ProposalSubmission"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags = ("@GBOJ"),
		glue = {"com.nttdata.step_definitions"},
		monochrome=true
		)

public class RunTest extends AbstractTestNGCucumberTests{
	public static String currentBrowser="";
	public static WebDriver driver;
	
	
	@BeforeClass
	@Parameters("browser")
	public WebDriver setupTestBase(String browser) throws Exception{
		
		currentBrowser = browser;
		if(browser.equalsIgnoreCase("chrome")) {
			driver = WebDriverHelper.startChromeDriver();
			
		}
		
		return driver;
		
	}

}
