package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages_001 {

	
	  WebDriver driver;
		
		@FindBy(name="q")
		WebElement SearchTextField;
		
		public WebElement getSearchTextField() {
			return SearchTextField;
		}
		
		
		@FindBy(xpath="//ul/li[@class='sbct']")
		List<WebElement> AllList;
		
		public List<WebElement> getAllList() {
			return AllList;
			
		}
		
		public GooglePages_001(WebDriver rDriver) {
			this.driver=rDriver; 
			
			PageFactory.initElements(rDriver,this);
		}

	

	
		
	

}
