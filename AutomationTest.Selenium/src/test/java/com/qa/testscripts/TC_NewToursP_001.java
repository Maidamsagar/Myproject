package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.NewToursPages_001;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewToursP_001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		
		NewToursPages_001  newTour =new NewToursPages_001(driver);
		driver.get("https://demo.guru99.com/test/newtours");
		
		
		newTour.getSearchUserName().sendKeys("mercury");
		newTour.getSearchPassward().sendKeys("mercury");
		newTour.getSubmit().click();
		Thread.sleep(3000);
		
		

	}

}
