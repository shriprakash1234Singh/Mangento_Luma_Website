package com.magento.luna.stepdefs.signindetails;

import org.junit.Assert;

import com.magento.luma.pages.detailspage.DetailsPage;
import com.magento.luma.pages.signindetailpage.SignInDetailPage;
import com.magento.luma.util.WebUtil;

import io.cucumber.java.en.Then;

public class SignInDetailStepDefs {


	private WebUtil wb = WebUtil.getInstance();
	
	
	@Then("^verify that user is successfully sign in in account$")
	public void verifySuccessful_Sign_In_Massage() {
		String expect = "Welcome, ShriPrakash Singh!";
		SignInDetailPage ca = new SignInDetailPage(wb);
		String actual = ca.verifySignInMassage();
		wb.verifyText(actual, expect);
		Assert.assertEquals(" Verify Successful sign in ", expect, actual);
	}
	
}
