package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.pages.NewToursPages_001;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewToursP_003 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		NewToursPages_001 newtour=new NewToursPages_001(driver);
		
		driver.get("https://demo.guru99.com/test/newtours");
		
		newtour.getSearchUserName().sendKeys("mercury");
		newtour.getSearchPassward().sendKeys("mercury");
		newtour.getSubmit().click();
		
		Thread.sleep(3000);
		
		
		newtour.getLinkFlight().click();
		boolean selectState =newtour.getRoundTrip().isSelected();
		
		if(selectState)
		{
			System.out.println("Round trip radio button is selected by default");
		}else {
			System.out.println("Round trip radio button is not selected by default");
		}
		
		Select s = new Select(newtour.getPassCount());
		if(Integer.parseInt(s.getFirstSelectedOption().getText())==1) {

		System.out.println("Passengers count is 1 by default");
		}
		else {

		System.out.println("Passengers count is not 1 by default");
		}
		
		
		List<WebElement> AllItems=newtour.getFormPort();
		System.out.println("total "+AllItems.size());
		for(WebElement e:AllItems) 
		{			
			System.out.println(e.getText());
		}
		if(AllItems.contains("India")) {

			System.out.println("Departing select box contains india in its options");
			}
			else {

			System.out.println("Departing select box doesn't contains india in its options");
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
