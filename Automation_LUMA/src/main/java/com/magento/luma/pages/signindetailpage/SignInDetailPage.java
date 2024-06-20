package com.magento.luma.pages.signindetailpage;

import com.magento.luma.util.WebUtil;

public class SignInDetailPage extends SignInDetailPageOR {

	private WebUtil wt;
	
	public SignInDetailPage(WebUtil we) {
		super(we);
		this.wt = we;
	}
	
	public String verifySignInMassage() {
		String actual= wt.mygetText(getWelcomeMassage());

		return actual;
	}

}
