package com.qa.testscripts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_MakeMyTripAss_001 extends TestBase {
	@Test
	public void TopView() throws InterruptedException, IOException {
		
		 List<WebElement> Icons= trip.getAllIcons();                                                       
	        int count = Icons.size();
	        System.out.println("The total number of Items = "+count);
	    
	        for(int i=0;i<count;i++) {
	            Thread.sleep(1000);
	            File driverScrImg = Icons.get(i).getScreenshotAs(OutputType.FILE);
	            System.out.println(Icons.get(i).getText());
	            String s = "MakeMyTripScreenshot"+(i+1)+".png";
	            File driverTargetImg = new File(System.getProperty("user.dir")+"/Screenshots/"+s);
	            FileUtils.copyFile(driverScrImg, driverTargetImg);
	        }            
//		Thread.sleep(3000);
//	    List<WebElement> AllList = trip.getTopList();
//	    Thread.sleep(3000);
//	    System.out.println("Total items present are:"+ AllList.size());
//	    for (WebElement webElement : AllList)
//        {
//   
//              
//              
// 
//       String screenshot="MakeMytripScreenshot_VC"+1+".png";
//       File driverSrcImg  = webElement.getScreenshotAs(OutputType.FILE);
//       File driverTargetImg = new File(System.getProperty("user.dir")+"/Screenshots/"+screenshot);
//       FileUtils.copyFile(driverSrcImg, driverTargetImg);
//       
//       }
//		System.out.println("Total items present are:"+ AllList.size());
//		
//		
//		
//		for(WebElement e:AllList) 
//		{			
//			System.out.println(e.getText());
//		}
	}
	
	

}
