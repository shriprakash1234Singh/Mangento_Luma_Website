package com.magento.luma.pages.createaccount;

import java.util.Map;

import com.magento.luma.util.WebUtil;

public class CreateAccount extends CreateAccountOR{

	private WebUtil wt;
	
	
	public CreateAccount(WebUtil we) {
		super(we);
		this.wt = we;
	}
	
	
	public void enterValidInfo(Map<String , String > accountMapData) {
		wt.mySendKeys(accountMapData.get("FirstName"), getFirstName());
		wt.mySendKeys(accountMapData.get("LastName"), getLastName());
		wt.mySendKeys(accountMapData.get("EmailFiled"), getEmailAdd());
		wt.mySendKeys(accountMapData.get("Password"), getPassword());
		wt.mySendKeys(accountMapData.get("ConfirmPassword"), getConfirmPassword());
		

	}
	
	public void clickOnCreate() {
		wt.click(getSubmitButton());
	}
	
}
