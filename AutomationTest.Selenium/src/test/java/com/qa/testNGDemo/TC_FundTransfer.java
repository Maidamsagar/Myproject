package com.qa.testNGDemo;

import org.testng.annotations.Test;

public class TC_FundTransfer extends TC_TestBase{
	@Test(priority=1)
	public void fundTransferIMPS() {
		System.out.println("LOC to test IMPS");
	}
	
	@Test(priority=2)
	public void fundTransferINTERNATIONAL() {
		System.out.println("LOC to test fund INTERNATIONAL");
	}
	
	@Test(priority=3)
	public void fundTransferNEFT() {
		System.out.println("LOC to test fund NEFT");
	}
	
	
	
	

}
