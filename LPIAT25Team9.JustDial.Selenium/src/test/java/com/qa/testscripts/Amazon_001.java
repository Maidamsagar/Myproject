package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.Amazonpages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_001 {
	@Test
	public  void setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Amazonpages  AmazonOr=new Amazonpages(driver);
		 driver.manage().window().maximize();
			driver.get("http://www.amazon.in/");
			
			AmazonOr.getCategoryListBox().selectByVisibleText("Books");
			AmazonOr.getSearchTextField().sendKeys("Da vinci code");
			AmazonOr.getMagnifierBut().click();
		    
		    boolean contains2 = driver.getTitle().contains("Da vinci code");
			if(contains2) {
				System.out.println("Item is searched");
			}else {
				System.out.println("item is not serched");
			}
			List<WebElement>allItems=AmazonOr.getAllItems();
	       System.out.println("Total no. of items loaded on the page are:"+ allItems.size());
			
			for(WebElement item:allItems) {
				System.out.println(item.getText());
			}
			
	}

}
