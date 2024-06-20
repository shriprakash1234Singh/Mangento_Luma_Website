package com.magento.luma.pages.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.luma.util.WebUtil;

import lombok.Getter;

@Getter
public class LoginPageOR {

	public LoginPageOR(WebUtil we) {
		PageFactory.initElements(we.getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@id='email']")
	protected WebElement signEmail;
	
	
	@FindBy(xpath = "//input[@id='pass']")
	protected WebElement signPassword;
	
	@FindBy(xpath = "//span[text()='Sign In']")
	protected WebElement signButton;
	
	
	
}
