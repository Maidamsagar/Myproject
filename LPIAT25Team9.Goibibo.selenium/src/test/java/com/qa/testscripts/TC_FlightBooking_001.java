package com.qa.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TC_FlightBooking_001 extends TestBase {
	@Test
	public void validatingLanded() throws InterruptedException, IOException {
		SoftAssert sAssert=new SoftAssert();
		boolean contains=driver.getTitle().contains("Goibibo");
		if(contains) {
			System.out.println("user is landed on the Goibibo page");
			sAssert.assertTrue(contains);
		}else
		{
			System.out.println("user is not landedon Goibibo page");
			captureScreenshot(driver,"Goibibof");
			sAssert.assertTrue(contains);
		}
		
		Thread.sleep(5000);
		OrGoibibo.getFlights().click();
		boolean contains1=driver.getTitle().contains("Goibibo");
		if(contains1) {
			System.out.println("user is landed on the Goibibo Flights page");
			sAssert.assertTrue(contains1);
		}else
		{
			System.out.println("user is not landedon Goibibo Flights page");
			captureScreenshot(driver,"Goibibof");
			sAssert.assertTrue(contains1);
		}
		Thread.sleep(5000);
		
	}

}
