package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks extends TestBase{
	
	
	  @Test(priority=1)
	     public void setup()throws InterruptedException {
	        
	            
	           
	           
//	            driver.manage().window().maximize();
//	            driver.get("https://www.flipkart.com/");
	        //   driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	            FooterlinkOR.getCancelBtn().click();
	           WebElement footer = driver.findElement(By.xpath("/html/body/div/div/footer/div/div[3]/div[1]"));
	            
	            System.out.println(footer.findElements(By.tagName("a")).size());
	            
	            for(int i=0;i<footer.findElements(By.tagName("a")).size();i++) {
	                String s=Keys.chord(Keys.CONTROL,Keys.ENTER);
	            	
	                footer.findElements(By.tagName("a")).get(i).sendKeys(s);
	                Thread.sleep(3000);
	            }
	    }
	

}
