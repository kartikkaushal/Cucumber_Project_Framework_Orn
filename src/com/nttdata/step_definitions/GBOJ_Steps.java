package com.nttdata.step_definitions;

import com.nttdata.wrappers.WebActions;

import io.cucumber.java.en.Given;

public class GBOJ_Steps extends WebActions
{
	@Given("User launches GBOJ Application URL")
	public void User_launches_GBOJ_Application_URL(){
		openURL();
	}
	

}
