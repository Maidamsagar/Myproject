package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoibiboPages {
	WebDriver driver;
	

	@FindBy(linkText="Flights")
	WebElement Flights;
	public WebElement getFlights() {
		return Flights;
	}
	@FindBy(xpath="//span[contains(text(),'One-way')]")
	WebElement oneRadio;
	public WebElement getoneRadio() {
		return oneRadio;
	}
	@FindBy(xpath="//span[contains(text(),'Round-trip')]")
	//@FindBy(id="Round-trip")
	WebElement roundradio;
	public WebElement getroundradio() {
		return roundradio;
	}
	
	//@FindBy(name="sc-dJjYzT eyHaJv fswWidgetLabel")
	@FindBy(xpath="//span[text()='From']")
	WebElement From;
	public WebElement getFrom() {
		return From;
	}
	
	
	@FindBy(xpath="//input")
	WebElement FromField;
	public WebElement getFromField() {
		return FromField;
	}
	
	@FindBy(xpath="//input")
	WebElement To;
	public WebElement getTo() {
		return To;
	}
	
	@FindAll(@FindBy(xpath="*//div[@class=\"DayPicker-Day\"]"))
	List <WebElement> selectDate;
	public List<WebElement> getselectDate() {
		return selectDate;
	}
	
	
	
	
	
	@FindBy(xpath="//span[text()='Done']")
	WebElement doneDate;
	public WebElement getdoneDate() {
		return doneDate;
	}
	               
	@FindBy(css="body.desktop:nth-child(2) div.sc-1gt8xf5-0.cEQQxj div.sc-1gt8xf5-3.cBVNVf div.sc-bYoBSM.fqpLgz div.sc-fFeiMQ.emsbJF div.sc-hiCibw.csHDph:nth-child(5) div.sc-dvQaRk.jBHqZz div.sc-bTfYFJ.rYVRK div.sc-kHOZwM.ikflyV div.sc-jUosCB.gIycCp div.sc-lcepkR.dFRxpk:nth-child(1) div.sc-faUpoM.sZvNY span.sc-Galmp.dZbQsT:nth-child(3) svg:nth-child(1) > path:nth-child(1)")
	WebElement increAdult;
	public WebElement getincreAdult() {
		return increAdult;
	}
	
	@FindBy(css="body.desktop:nth-child(2) div.sc-1gt8xf5-0.cEQQxj div.sc-1gt8xf5-3.cBVNVf div.sc-bYoBSM.fqpLgz div.sc-fFeiMQ.emsbJF div.sc-hiCibw.csHDph:nth-child(5) div.sc-dvQaRk.jBHqZz div.sc-bTfYFJ.rYVRK div.sc-kHOZwM.ikflyV div.sc-jUosCB.gIycCp div.sc-lcepkR.dFRxpk:nth-child(2) div.sc-faUpoM.sZvNY span.sc-Galmp.dZbQsT:nth-child(3) svg:nth-child(1) > path:nth-child(1)")
	WebElement increChild;
	public WebElement getincreChild() {
		return increChild;
	}
	
	@FindBy(xpath="//a[contains(text(),'Done')]")
	WebElement adultDone;
	public WebElement getadultDone() {
		return adultDone;
	}
	
	@FindBy(xpath="//span[@class='sc-gKclnd hrZfTH']")
	WebElement regular;
	public WebElement getregular() {
		return regular;
	}
	@FindBy(xpath="//span[@class='sc-gKclnd cczwjK']")
	WebElement armed;
	public WebElement getarmed() {
		return armed;
	}
	@FindBy(xpath="//span[@class='sc-dtDOqo iuIbnZ']")
	WebElement serachFlight;
	public WebElement getserachFlight() {
		return serachFlight;
	}
	
	@FindBy(xpath="//span[contains(text(),'Direct')]")
	WebElement nonStop;
	public WebElement getnonStop() {
		return nonStop;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/section/div[3]/div/div/div/label[1]/div")
	WebElement modifyFare;
	public WebElement getmodifyFare() {
		return modifyFare;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/section/div[1]/div[2]/label")
	WebElement roundTrip;
	public WebElement getroundTrip() {
		return roundTrip;
	}
	@FindBy(xpath="//body/div[@id='root']/div[2]/section[1]/div[2]/div[1]/div[2]/*[1]")
	WebElement swapDetails;
	public WebElement getswapDetails() {
		return swapDetails;
	}
	
	
	@FindAll(@FindBy(xpath="//*[@class='sc-efQSVx bUzoZw']"))
	List<WebElement> AllSuggestions;
	public List<WebElement>  getAllSuggestions() {
		return AllSuggestions;
	}
	

	
	public GoibiboPages(WebDriver rDriver) {
		this.driver=rDriver;
		PageFactory.initElements(rDriver,this);
		
	}

}
