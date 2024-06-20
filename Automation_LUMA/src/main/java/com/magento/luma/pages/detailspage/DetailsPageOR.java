package com.magento.luma.pages.detailspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.luma.util.WebUtil;

import lombok.Getter;

@Getter
public class DetailsPageOR {

	
	public DetailsPageOR(WebUtil we) {
		PageFactory.initElements(we.getDriver(), this);
	}
	
	
	@FindBy(xpath = "//div[text()='Thank you for registering with Main Website Store.']")
	protected WebElement verifyMassage;
	
	
}
