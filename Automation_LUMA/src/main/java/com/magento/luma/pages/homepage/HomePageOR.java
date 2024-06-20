package com.magento.luma.pages.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.luma.util.WebUtil;

import lombok.Getter;

@Getter
public class HomePageOR {

	
	public HomePageOR(WebUtil we) {
		PageFactory.initElements(we.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[text()='Create an Account']")
	protected WebElement createButton;
	
	
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	protected WebElement signInButton;
	
}
