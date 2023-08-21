package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedinPages {
	
	WebDriver driver;
	@
	FindBy(linkText="User Agreement")
	WebElement LinkedinUserAgreeLink;
	public WebElement getLinkedinUserAgreeLink() {
		return LinkedinUserAgreeLink;
	}
	
	@
	FindBy(linkText="Privacy Policy")
	WebElement LinkedinPolcyLink;
	public WebElement getLinkedinPolcyLink() {
		return LinkedinPolcyLink;
	}
	
	@
	FindBy(linkText="Community Guidelines")
	WebElement LinkedinCookPolcyLink;
	public WebElement getLinkedinCookPolcyLink() {
		return LinkedinCookPolcyLink;
	}
	

	public LinkedinPages(WebDriver rDriver) {
		this.driver=rDriver;
		PageFactory.initElements(rDriver, this);
		
	}

}
