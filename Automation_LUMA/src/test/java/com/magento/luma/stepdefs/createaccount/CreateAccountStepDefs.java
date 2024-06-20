package com.magento.luma.stepdefs.createaccount;

import java.util.List;
import java.util.Map;

import com.magento.luma.pages.createaccount.CreateAccount;
import com.magento.luma.util.WebUtil;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class CreateAccountStepDefs {

	private WebUtil wb = WebUtil.getInstance();
	
	private CreateAccount ca; 
	
	@And("^user enter valid information in filed$")
	public void enterInfo(DataTable dt) {
		 ca = new CreateAccount(wb);
		List<Map<String, String>> listOfDataMap = dt.asMaps();
		for (int i = 0; i < listOfDataMap.size() ; i++) {
			Map<String , String > dataMap = listOfDataMap.get(i);
		ca.enterValidInfo(dataMap);
		
		}
	}
	
	@And("^click on create an account button$")
	public void clickOnSubmit() {
		ca.clickOnCreate();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
