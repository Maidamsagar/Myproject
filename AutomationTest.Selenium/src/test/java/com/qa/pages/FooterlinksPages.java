package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterlinksPages {
	 WebDriver driver;
	 
	 @FindBy(xpath="/html/body/div[2]/div/div/button")
	    WebElement CancelBtn;
	public WebElement getCancelBtn() {
	        return CancelBtn;
	    }
	    @FindBy(xpath="/html/body/div/div/footer/div/div[3]/div[1]")
	    WebElement link;
	  public WebElement getlink() {
	        return link;
	    }

	 public FooterlinksPages(WebDriver rDriver) {
	        // TODO Auto-generated constructor stub
	                this.driver = rDriver;
	                PageFactory.initElements(rDriver,this);
	            }

}
