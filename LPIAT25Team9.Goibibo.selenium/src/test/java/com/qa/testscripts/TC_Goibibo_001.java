package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_Goibibo_001 extends TestBase{
	
	String month="November";
	String date="30";
	@Test
	public void Flights() throws InterruptedException {
		
		boolean contains=driver.getTitle().contains("Goibibo");
		if(contains) {
			System.out.println("user is landed on the Goibibo page");
		}else
		{
			System.out.println("user is not landedon Goibibo page");
		}
		
		OrGoibibo.getoneRadio().click();
		Thread.sleep(5000);
		System.out.println("landed");
        //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")).click();
        
		driver.findElement(By.xpath("//span[text()='From']")).click();
		//input
		driver.findElement(By.xpath("//input")).sendKeys("HYDERABAD");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input")).sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
        System.out.println("FROM SELECTED");
      
//        List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']"));
//		System.out.println("Total suggentions are:"+ AllSuggestions.size());
//		
        
        List<WebElement> allL=OrGoibibo.getAllSuggestions();
        Thread.sleep(5000);
        System.out.println("total "+allL.size());
		
      //*[@id="root"]/div[4]/div/div/div[1]/div[2]/div/div[2]/div/input
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[2]/div/div[2]/div/input")).sendKeys("DELHI");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[2]/div/div[2]/div/input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//		while(true) {
//			driver.findElement(By.xpath("//div[@xpath='1']")).getText();
//		}
		String text=driver.findElement(By.xpath("//div[contains(text(),'October 2022')]")).getText();
		Thread.sleep(5000);
		System.out.println(text);
		
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[2]/div/span[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Done')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'regular')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='sc-dtDOqo iuIbnZ']")).click();
		Thread.sleep(5000);
//		Thread.sleep(3000);
		//fiedFrom.sendKeys("hyderabad");
		//OrGoibibo.getFrom().sendKeys("Hyderabad");
//		OrGoibibo.getFrom().clear();
//		OrGoibibo.getFrom().sendKeys("Hyderabad");
		
		
		
	}

}
