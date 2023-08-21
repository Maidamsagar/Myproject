package com.qa.testscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_NewToursAss_001 extends TestBase {
	@Test
	public void GuruValidation() throws InterruptedException {
		boolean contains=driver.getTitle().contains("GURU");
		if(contains) {
			System.out.println("user is landed on the newtours home page");
		}else
		{
			System.out.println("user is not landedon newtours home page");
		}
		newtour.getSearchUserName().sendKeys("mercury");
		newtour.getSearchPassward().sendKeys("mercury");
		newtour.getSubmit().click();
		Thread.sleep(3000);
		
		String url="https://demo.guru99.com/test/newtours/login_sucess.php";
		String expectedurl= driver.getCurrentUrl();
		
		if(url.equalsIgnoreCase(expectedurl))
		{
			System.out.println("login successful");
		}else
		{
			System.out.println("login fail");
		}
		
		newtour.getLinkFlight().click();
		
		String url1="https://demo.guru99.com/test/newtours/login_sucess.php";
		String expectedurl1= driver.getCurrentUrl();
		
		if(url1.equalsIgnoreCase(expectedurl1))
		{
			System.out.println("login successful user is landedon flights page");
		}else
		{
			System.out.println("login fail");
		}
		
		
		Select Depart = new Select(newtour.getPortFrom());
		Select Return = new Select(newtour.gettoPort());
		if(Depart.getFirstSelectedOption().getText().equals(Return.getFirstSelectedOption().getText())){

			System.out.println("value in the Departing from and returning select box are same.");
			}

			else{

			System.out.println("value in the Departing from and returning select box are not same.");

			}
		
		
		
		
	}
	
	
	

}
