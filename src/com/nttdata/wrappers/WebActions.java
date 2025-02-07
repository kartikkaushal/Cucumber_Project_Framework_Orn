package com.nttdata.wrappers;

import com.nttdata.test_runner.RunTest;

public class WebActions extends RunTest{
	
	public static void openURL() {
		driver.get("https://www.google.com");
	}

}
