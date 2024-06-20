package com.magento.luma.pages.loginpage;

import java.util.Map;

import com.magento.luma.util.WebUtil;

public class LoginPage extends LoginPageOR{

	private WebUtil wt;
	
	public LoginPage(WebUtil we) {
		super(we);
		this.wt = we;
	}
	
	public void enterUsernameAndPassword(Map<String , String> signMapData) {
		wt.mySendKeys(signMapData.get("EmailFiled"), getSignEmail());
		wt.mySendKeys(signMapData.get("Password"), getSignPassword());
	}
	
	public void clickOnSignIn() {
		wt.click(getSignButton());
	}

}
