package com.magento.luma.pages.homepage;

import com.magento.luma.util.WebUtil;

public class HomePage extends HomePageOR{

	private WebUtil wt;
	
	
	public HomePage(WebUtil we) {
		super(we);
		this.wt = we;
	}

	
	public void clickOnCreateAccount() {
		wt.click(getCreateButton());
	}
	
	public void clickOnSignIn() {
		wt.click(getSignInButton());
	}
	
}
