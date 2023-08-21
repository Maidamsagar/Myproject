package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.Amazonpages;
import com.qa.pages.TC_JustdialPages;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase {
	TC_JustdialPages OrJustdial;
	Amazonpages  AmazonOr;
	
	WebDriver driver;
	@Parameters({"Browser","Url"})
	@BeforeClass
	
	public void setup(String Browser,String Url) { 
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();
			}else if(Browser.equalsIgnoreCase("Edge")) { 
				WebDriverManager.edgedriver().setup(); 
				driver=new EdgeDriver();
			}
		
		OrJustdial=new TC_JustdialPages(driver); 
		AmazonOr=new Amazonpages(driver);
		driver.manage().window().maximize();
		driver.get(Url);
		
		
		
	}
	 @AfterClass
	    public void teardown() {
	        driver.close();
	    }

}
