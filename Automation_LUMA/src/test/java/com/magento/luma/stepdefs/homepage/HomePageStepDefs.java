package com.magento.luma.stepdefs.homepage;

import com.magento.luma.pages.homepage.HomePage;
import com.magento.luma.util.WebUtil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class HomePageStepDefs {

	private WebUtil wb = WebUtil.getInstance();
	
	@When("^user click on create an account link$")
	public void clickOnCreateAccount() {
		HomePage hp = new HomePage(wb);
		hp.clickOnCreateAccount();
	}
	
	@When("^user click on sign in link$")
	public void clickOnSignin() {
		HomePage hp = new HomePage(wb);
		hp.clickOnSignIn();
	}
	
}
