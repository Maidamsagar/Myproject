package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTripPages {
	WebDriver driver;
	
	
	
	   @FindAll(@FindBy(xpath = "//ul[@class='makeFlex font12']/li"))
    List<WebElement> AllIcons;
    
    public List<WebElement> getAllIcons(){
        return AllIcons;
    }

	public MakeMyTripPages(WebDriver rDriver) {
		this.driver=rDriver;
		PageFactory.initElements(rDriver,this);
	}

}
