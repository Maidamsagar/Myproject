package com.qa.testscripts;

import java.io.IOException;
import java.util.List;
import com.qa.pages.GooglePages_001;
import com.qa.utility.ExcelUtility;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tc_Google_003 extends TestBase{
	@Test(priority=1, dataProvider="getData")
	public void getSuggestions(String itemName) throws InterruptedException {
		SoftAssert sAssert=new SoftAssert();
		Google.getSearchTextField().clear();
		Google.getSearchTextField().sendKeys(itemName);
		Thread.sleep(3000);
		
		List<WebElement> Suggest= Google.getAllList();
		
		int count=Suggest.size();
		System.out.println("Total Suggestions are"+count);
		
		sAssert.assertEquals(count,10);
		for(WebElement item:Suggest)
			System.out.println(item.getText());
		Thread.sleep(3000);
		Google.getSearchTextField().submit();
		String title= driver.getTitle();
		boolean containsTitle =title.contains(itemName);
		if(containsTitle) {
			System.out.println("User landed on"+itemName+"Page");
			sAssert.assertTrue(containsTitle);
			
		}
		else {
			System.out.println("User not landed on"+itemName+"Page" );
			sAssert.assertTrue(containsTitle);
		}
		sAssert.assertAll();
	}
	@DataProvider
	public String[][] getData() throws IOException{
		String xFile="C:\\Users\\MAIDAMSAGAR\\eclipse-workspace\\AutomationTest.Selenium\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
		String xSheetName="Sheet1";
		
		int rowCount=ExcelUtility.getRowCount(xFile, xSheetName);
		int cellCount=ExcelUtility.getCellCount(xFile, xSheetName, rowCount);
		
		String[][] data =new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				data[i-1][j]=ExcelUtility.getCellData(xFile,xSheetName,i, j);
			}
		}
		return data;
		
		
	}
	
	
	

}
