package com.qa.testscripts;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_Linkedin_001 extends TestBase{
	@Test
	public void WorkingWithWindows() {
	boolean contains=driver.getCurrentUrl().contains("linkedin");
		if(contains)
		{
			System.out.println("The user is landed on homePage");
			Assert.assertTrue(contains);
			
		}else {
			System.out.println("not landed on home page");
			Assert.assertTrue(contains);
		}
		
		LinkedinOR.getLinkedinUserAgreeLink().click();
		LinkedinOR.getLinkedinPolcyLink().click();
		LinkedinOR.getLinkedinCookPolcyLink().click();
		
		Set<String>AllWindows=driver.getWindowHandles();
		Iterator<String>Ite=AllWindows.iterator();
		while(Ite.hasNext()) {
			String WindID=Ite.next();
			System.out.println(WindID);
			WebDriver window=driver.switchTo().window(WindID);
			
			System.out.println(window.getTitle());
		}
	}
	

}
