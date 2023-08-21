package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewTours_002 {

	public static void main(String[] args) {
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
		
		driver.findElement(By.xpath("//a[contains(@href,'reservation')]")).click();
		
		String url2="https://demo.guru99.com/test/newtours/reservation.php";
		String expectedurl2= driver.getCurrentUrl();
		
		if(url2.equalsIgnoreCase(expectedurl2))
		{
			System.out.println("User is landed on the Book a flight page");
		}else
		{
			System.out.println("login failed");     
		}
		WebElement radio =driver.findElement(By.xpath("//input[@value='roundtrip']"));
		boolean selectState =radio.isSelected();
		if(selectState)
		{
			System.out.println("Round trip radio button is selected by default");
		}else {
			System.out.println("Round trip radio button is not selected by default");
		}
		
		WebElement dropBox=driver.findElement(By.name("passCount"));
		Select s = new Select(dropBox);
		if(Integer.parseInt(s.getFirstSelectedOption().getText())==1) {

		System.out.println("Passengers count is 1 by default");
		}
		else {

		System.out.println("Passengers count is not 1 by default");
		}
		
		
		
		
		
		
		List<WebElement> AllItems = driver.findElements(By.name("fromPort"));

		System.out.println("List of counties present in departing:");

		for(WebElement item:AllItems) {
		System.out.println(item.getText());
		}

		if(AllItems.contains("India")) {

		System.out.println("Departing select box contains india in its options");
		}
		else {

		System.out.println("Departing select box doesn't contains india in its options");
		}

		WebElement Departing_From =driver.findElement(By.name("fromPort"));
		Select Depart = new Select(Departing_From);

		WebElement Returning =driver.findElement(By.name("toPort"));
		Select Return = new Select(Departing_From);

		if(Depart.getFirstSelectedOption().getText().equals(Return.getFirstSelectedOption().getText())){

		System.out.println("Default value in the Departing from and returning select box are same.");
		}

		else{

		System.out.println("Default value in the Departing from and returning select box are not same.");

		}


		
		
	}

}
