package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewTours_001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Browser ="Chrome";
		WebDriver driver =null;
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}else if(Browser.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours");
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		String url="https://demo.guru99.com/test/newtours/login_sucess.php";
		String expectedurl= driver.getCurrentUrl();
		
		if(url.equalsIgnoreCase(expectedurl))
		{
			System.out.println("login successful");
		}else
		{
			System.out.println("login fail");
		}
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
