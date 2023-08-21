package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_Destin_001 extends TestBase{
	@Test
	public void CheckDestination() {
		
		boolean contains=driver.getCurrentUrl().contains("http://destinationqa.com/aut/RadioButtons.html");
		
		if(contains) {
			System.out.println("user is landed on home page");
			Assert.assertTrue(contains);
		}else {
			System.out.println("user is not landed on home page");
			Assert.assertTrue(contains);
		}
		DestinOR.getRadiocheck();
	     boolean status=DestinOR.getRadiocheck().isSelected();
	     if(status) {
	    	 System.out.println("Wednesday is selected");
	    	 
	     }else {
	    	 System.out.println("Wednesday is not selected");
	    	 
	     }
	    	
	     DestinOR.getRadioMonday().click();
	     
	     boolean red=DestinOR.getcheckRedBox().isSelected();
	     boolean yello=DestinOR.getcheckRedBox().isSelected();
		if(yello&&red){
			System.out.println("both are selected");
		}else
		{
			System.out.println("both are not selected");
		}
		DestinOR.getcheckRedBox().click();
		DestinOR.getcheckBoxOrange().click();
		
		
	}

}
