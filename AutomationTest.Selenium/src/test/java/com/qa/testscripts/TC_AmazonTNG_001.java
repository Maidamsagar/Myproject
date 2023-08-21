package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;

public class TC_AmazonTNG_001 extends TestBase {
	
	AmazonPages AmazonP;
	
	@Test(priority=1)
	public void searchItem() {
		
		
		
	    
	    AmazonP.getCategoryListBox().selectByVisibleText("Books");
	    AmazonP.getSearchTextField().sendKeys("Da vinci code");
	    AmazonP.getMagnifierBut().click();
	    
	    boolean contains2 = driver.getTitle().contains("Da vinci code");
		if(contains2) {
			System.out.println("Item is searched");
		}else {
			System.out.println("item is not serched");
		}
		List<WebElement>allItems=AmazonP.getAllItems();
       System.out.println("Total no. of items loaded on the page are:"+ allItems.size());
		
		for(WebElement item:allItems) {
			System.out.println(item.getText());
		}
		//Thread.sleep(3000);
		//driver.close();
	}
//	@Test(priority=2)
//	public void footLinks() {
//		System.out.println("LOC for hyper links in the footsection of page");
//	}
	

}


