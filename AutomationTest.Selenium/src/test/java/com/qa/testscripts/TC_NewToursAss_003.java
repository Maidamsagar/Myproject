package com.qa.testscripts;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_NewToursAss_003 extends TestBase{
	@Test
	public void UserWidthHeigt() {
		int f1=newtour.getSearchUserName().getSize().getHeight();
		int f2=newtour.getSearchUserName().getSize().getWidth();
		
		int f3=newtour.getSearchPassward().getSize().getHeight();
		int f4=newtour.getSearchPassward().getSize().getWidth();
		
		if(f1==f3&&f2==f4) {
			System.out.println("both height and woiidth are same");
			Assert.assertTrue(f1==f3&&f2==f4);
		}else
		{
			System.out.println("both height and woiidth  are not same");
			Assert.assertTrue(f1==f3&&f2==f4);
		}
	}

}
