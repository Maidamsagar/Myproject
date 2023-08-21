package com.qa.testscripts;

import java.util.List;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import com.qa.pages.GooglePages_001;


public class TC_GoogleTNG_001 extends TestBase {
	
	@Test(priority=1, dataProvider="getData")
	
	public void searchItem(String ItemName) throws InterruptedException {
		
	    Google.getSearchTextField().sendKeys(ItemName);
	    Thread.sleep(3000);
	    Google.getSearchTextField().clear();
		 
		List<WebElement> suggestions =Google.getAllList();
        for(WebElement item:suggestions) {
            System.out.println("Suggestions list"+item.getText());
        }
        Thread.sleep(3000);
	    Google.getSearchTextField().submit();
	    }
	    
	    @DataProvider
	    public Object[][] getData(){
	        Object[][] data =new Object[3][1];
	        data[0][0]= "Automation Testing";
	        data[1][0]= "Performance Testing";
	        data[2][0]= "API testing";
	        return data;
	        
	    }
	    



	
	}


