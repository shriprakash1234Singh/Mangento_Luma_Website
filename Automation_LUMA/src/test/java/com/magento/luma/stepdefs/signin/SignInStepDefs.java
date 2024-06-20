package com.magento.luma.stepdefs.signin;

import java.util.List;
import java.util.Map;

import com.magento.luma.pages.homepage.HomePage;
import com.magento.luma.pages.loginpage.LoginPage;
import com.magento.luma.util.WebUtil;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SignInStepDefs {

	
private WebUtil wb = WebUtil.getInstance();

private LoginPage hp ;
	
	@And("^user enter valid username and password in filed$")
	public void enterEmailAndPassword(DataTable dt) {
		 hp = new LoginPage(wb);
		 List<Map<String, String>> listOfDataMap = dt.asMaps();
			for (int i = 0; i < listOfDataMap.size() ; i++) {
				Map<String , String > dataMap = listOfDataMap.get(i);
		hp.enterUsernameAndPassword(dataMap);
	}
	}
	
	@And("^click on sign in button$")
	public void clickSignIn() {
		hp.clickOnSignIn();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
