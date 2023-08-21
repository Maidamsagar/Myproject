package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazonpages {
	WebDriver driver;
	
	@FindBy(id="searchDropdownBox")
	WebElement CategoryList;
	
	public Select getCategoryListBox() {
		
		Select category =new Select(CategoryList); 
		return category;
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchTextField;
	
	public WebElement getSearchTextField() {
		return SearchTextField;
	}
	
	
	@FindBy(id="nav-search-submit-button")
	WebElement MagnifierBut;
	
	public WebElement getMagnifierBut() {
		return MagnifierBut;
	}
	
	@FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))
	List<WebElement> AllItems;
	
	public List<WebElement> getAllItems(){
		return AllItems;
	}
	

	public Amazonpages(WebDriver rDriver) {
		this.driver=rDriver;
		PageFactory.initElements(rDriver, this);
		
	}

}
