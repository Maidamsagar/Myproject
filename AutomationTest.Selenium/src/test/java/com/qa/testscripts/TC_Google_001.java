package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Google_001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Browser="Chrome";
		WebDriver driver =null;
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}else if(Browser.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		boolean contains= driver.getTitle().contains("Google");
		
		if(contains) {
			System.out.println("the user is landed on the Google");
		}else {
			System.out.println("the user is not landed on the Google");
		}
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation Testing");
		Thread.sleep(3000);
		
		List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul/li[@class='sbct']"));
		System.out.println("Total suggentions are:"+ AllSuggestions.size());
		
		
		
		for(WebElement e:AllSuggestions) 
		{			
			System.out.println(e.getText());
		}
		//driver.close();


	}

}
