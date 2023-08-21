package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_NewToursAss_002 extends TestBase{
	
	
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
		
		String url1="https://demo.guru99.com/test/newtours/reservation.php";
		String expectedurl1= driver.getCurrentUrl();
		
		if(url1.equalsIgnoreCase(expectedurl1))
		{
			System.out.println("login successful user is landedon flights page");
		}else
		{
			System.out.println("login fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		List<WebElement> AllItems=newtour.getFormPort();
//		System.out.println("total "+AllItems.size());
//		for(WebElement e:AllItems) 
//		{			
//			System.out.println(e.getText());
//		}
		if(AllItems.contains("India")) {

			System.out.println("Departing select box contains india in its options");
			}
			else {

			System.out.println("Departing select box doesn't contains india in its options");
			}
		

}
}