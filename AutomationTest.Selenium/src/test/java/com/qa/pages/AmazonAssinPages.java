package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonAssinPages {
	WebDriver driver;
	
	
	@FindBy(linkText="Start here.")
	WebElement SinIn;
	
	public WebElement getSinIn() {
		return SinIn;
	}
	
	@FindBy(id="ap_customer_name")
	WebElement UserField;
	public WebElement getUserField() {
		return UserField;
	}
	
	@FindBy(id="ap_phone_number")
	WebElement UserMobo;
	public WebElement getUserMobo() {
		return UserMobo;
	}
	
	@FindBy(id="ap_email")
	WebElement UserEmail;
	public WebElement getUserEmail() {
		return UserEmail;
	}
	
	@FindBy(id="ap_password")
	WebElement UserPass;
	public WebElement getUserPass() {
		return UserPass;
	}

	public AmazonAssinPages(WebDriver rDriver) {
		this.driver=rDriver;
		PageFactory.initElements(rDriver,this);
	}

}
