package com.qa.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_WebDriver_001 {

	public static void main(String[] args) {
		/* 
		 1.Method 
		     1) configuration drive  binary Chrome browser
		     2)Object reference to invoke
		 */
//		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\MAIDAMSAGAR\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
//		ChromeDriver  driver = new ChromeDriver();
//		
//		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\MAIDAMSAGAR\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
//        EdgeDriver edriver = new EdgeDriver();
//        
        /*
         * method 2:configure browser excecutable through webDriver
         */
    // for chrome
//        WebDriverManager.chromedriver().setup();
       // ChromeDriver driver1= new ChromeDriver();
    // for edge
        WebDriverManager.edgedriver().setup();
        EdgeDriver eDriver1 = new EdgeDriver();
    // for TE browser
//        WebDriverManager.iedriver().setup();
//        InternetExplorerDriver i=new InternetExplorerDriver(); 
	}

}
