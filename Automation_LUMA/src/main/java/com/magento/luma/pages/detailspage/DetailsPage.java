package com.magento.luma.pages.detailspage;

import com.magento.luma.util.WebUtil;

public class DetailsPage extends DetailsPageOR {

	private WebUtil wt;
	
	public DetailsPage(WebUtil we) {
		super(we);
		this.wt = we;
	}

	public String verifyAcCreationMassage() {
		String actual= wt.mygetText(getVerifyMassage());
		return actual;
	}
	
}
