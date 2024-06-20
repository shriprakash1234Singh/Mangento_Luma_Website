package com.magento.luna.stepdefs.details;

import org.junit.Assert;

import com.magento.luma.pages.createaccount.CreateAccount;
import com.magento.luma.pages.detailspage.DetailsPage;
import com.magento.luma.util.WebUtil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DetalisPageStepDefs {


	private WebUtil wb = WebUtil.getInstance();
	
	
	@Then("^verify that user is successfully created an account$")
	public void verifyMassage() {
		String expect = "Thank you for registering with Main Website Store.";
		DetailsPage ca = new DetailsPage(wb);
		String actual = ca.verifyAcCreationMassage();
		wb.verifyText(actual, expect);
		Assert.assertEquals(" Verify Account Creation ", expect, actual);
	}
	
}
