package com.nttdata.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverHelper {

	public static WebDriver startChromeDriver() {
		WebDriver driver = null;
		WebDriverManager.chromedriver().driverVersion("132").setup();
		driver = new ChromeDriver();
		
		
		return driver;
	}

}
