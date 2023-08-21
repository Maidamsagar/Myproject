package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Amazon_001 {

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
		driver.get("http://www.amazon.in/");
		
		boolean contains= driver.getTitle().contains("Amazon");
		
		if(contains) {
			System.out.println("the user is landed on the amazon");
		}else {
			System.out.println("the user is not landed on the amazon");
		}
		
		
		WebElement Ele = driver.findElement(By.id("searchDropdownBox"));
		Select Category = new Select(Ele);
		Category.selectByVisibleText("Books");
		
		
		WebElement SearchTextField = driver.findElement(By.id("twotabsearchtextbox"));
		
		SearchTextField.sendKeys("Da vinci code");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		boolean contains2 = driver.getTitle().contains("Da vinci code");
		if(contains2) {
			System.out.println("Item is searched");
		}else {
			System.out.println("item is not serched");
		}
		
		List<WebElement> AllItems = driver.findElements(By.xpath("//span[@class='a-size-medium a color-base a-text-normal']"));
		
		System.out.println("Total no. of items loaded on the page are:"+ AllItems.size());
		
		for(WebElement item:AllItems) {
			System.out.println(item.getText());
		}
		Thread.sleep(3000);
		driver.close();
		

	}

}
