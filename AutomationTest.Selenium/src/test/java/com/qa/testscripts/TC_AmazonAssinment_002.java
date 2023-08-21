package com.qa.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;


public class TC_AmazonAssinment_002 extends TestBase{
	@Test
	public void AmazonPixel() throws IOException {
		
		for(int i=0;i<5;i++) {
			String screenShot="ScreenShot"+i+".png";
			JS.executeScript("window.scrollBy(0,1000)");
			File driverScrcImag=Ts.getScreenshotAs(OutputType.FILE);
			File taegetSrcImg =new File(System.getProperty("user.dir")+"/ScreenShots/"+screenShot);
			FileUtils.copyFile(driverScrcImag, taegetSrcImg);
		}
		
		
	}

}
