package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_JustdialPages {
	WebDriver driver;
	
	//@FindBy(className="hotkeys_sprite hotkeys-icon airtk-icon")
//	@FindBy(xpath="//a[@id='ContextualHotkey_5']")
//	//@FindBy(linkText="Air Tickets")
//	WebElement AirTicket;
//	public WebElement getAirTicket() {
//		return AirTicket;
//	}
		
	
	
	
	

	public TC_JustdialPages(WebDriver rDriver) {
		this.driver=rDriver;
	    PageFactory.initElements(rDriver,this);
		
	}

}
