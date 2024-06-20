package com.magento.luma.pages.signindetailpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.luma.util.WebUtil;

import lombok.Getter;

@Getter
public class SignInDetailPageOR {


	public SignInDetailPageOR(WebUtil we) {
		PageFactory.initElements(we.getDriver(), this);
	}
	
	@FindBy(xpath = "//span[@class='logged-in']")
	protected WebElement welcomeMassage;
	
	
}
