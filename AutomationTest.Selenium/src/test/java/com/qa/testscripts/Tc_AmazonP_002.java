package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_AmazonP_002 {
	WebDriver driver;
	AmazonPages AmazonP;
	//public static void main(String[] args) throws InterruptedException {
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    AmazonP=new AmazonPages(driver);
	    driver.manage().window().maximize();
	    driver.get("http://www.amazon.in");
	}
	@AfterClass
	public void tearDown() {
		driver.close();
		
	}
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
	@Test(priority=2)
	public void footLinks() {
		System.out.println("LOC for hyper links in the footsection of page");
	}
	

}
//}