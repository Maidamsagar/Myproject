package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.GooglePages_001;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Google_002 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		GooglePages_001 Google= new GooglePages_001(driver); 
		driver.get("http://www.google.com");
		
		
		Google.getSearchTextField().sendKeys("Automation Testing");
		Thread.sleep(3000);
		List<WebElement> alLists =Google.getAllList();
		System.out.println("total "+alLists.size());
		for(WebElement e:alLists) 
		{			
			System.out.println(e.getText());
		}
		 

	}

}
