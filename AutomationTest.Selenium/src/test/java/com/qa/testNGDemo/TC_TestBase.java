package com.qa.testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TC_TestBase {
	@BeforeSuite
	public void setUp() {
		System.out.println("Starting sute");
	}
	@AfterSuite
	public void tearDown() {
		System.out.println("Stopping suite");
	}
	@BeforeTest
	public void invokeBrowser() {
		System.out.println("invokeBrowser");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}
	@BeforeClass
	public void Login() {
		System.out.println("LOC for Login");
	}
	@AfterClass
	public void LogOUt() {
		System.out.println("LOC for LOGOUT");
	}
	@BeforeMethod
	public void chectkBalance() {
		System.out.println("Check Balance");
	}
	@AfterMethod
	public void Acknowledgement() {
		System.out.println("print Ackn");
	}
	

}
