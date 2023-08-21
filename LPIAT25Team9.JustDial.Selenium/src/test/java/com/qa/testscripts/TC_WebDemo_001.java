package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_WebDemo_001 {

	public static void main(String[] args) {
    String Browser="Chrome";
    WebDriver driver =null;
    
    if(Browser.equalsIgnoreCase("Chrome")) {
    	System.out.println(" Chrome browser Invoked");
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	
    }else {
    	System.out.println("Edge browser Invoked");
    	WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        
    }
  //  driver.get("http://www.amazon.in/");
    driver.get("http://www.google.com");
    
    String src=driver.getTitle();
    if(Browser.contains(src)) {
    	System.out.println("user is landed on  google");
    	
    }else {
    	System.out.println("user is not landed on google");
    }
    
    
    System.out.println(driver.getWindowHandles());
    driver.close(); 
}
}
