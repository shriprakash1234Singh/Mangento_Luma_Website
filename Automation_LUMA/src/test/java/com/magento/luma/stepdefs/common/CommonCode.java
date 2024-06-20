package com.magento.luma.stepdefs.common;

import com.magento.luma.util.WebUtil;

import io.cucumber.java.en.Given;

public class CommonCode {

	private WebUtil wb = WebUtil.getInstance();
	
	@Given("^user launch browser and navigate to home page with url as \"([^\"]*)\"$")
	public void launchBrowserOpenUrl(String url) {
		wb.launchBrowser();
		wb.openUrl(url);	
		
	}
}
