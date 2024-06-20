package com.magento.luma.pages.createaccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.luma.util.WebUtil;

import lombok.Getter;

@Getter
public class CreateAccountOR {


	public CreateAccountOR(WebUtil we) {
		PageFactory.initElements(we.getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@id='firstname']")
	protected WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	protected WebElement lastName;
	
	@FindBy(xpath = "//input[@id='email_address']")
	protected WebElement EmailAdd;
	
	@FindBy(xpath = "//input[@id='password']")
	protected WebElement password;
	
	@FindBy(xpath = "//input[@id='password-confirmation']")
	protected WebElement confirmPassword;
	
	
	@FindBy(xpath = "//button[@class='action submit primary']")
	protected WebElement submitButton;
	
	
	
	
}
