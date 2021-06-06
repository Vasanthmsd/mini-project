package com.loginnn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_project {
	
	@BeforeSuite
	public static void setproperty() {
		System.out.println("set");

	}
	
	@BeforeTest
	public static void browserlaunch() {
		System.out.println("broser launch");

	}
	
	
	@BeforeClass
	public static void geturl() {
		System.out.println("geturl");

	}
	
	@BeforeMethod
	public static void login() {
		System.out.println("login");

	}
	@Test
	public static void cicking() {
		System.out.println("click");

	}
	@AfterMethod
	public static void searching() {
		System.out.println("searching");
		
	

	}
	@AfterClass
	public static void homepage() {
		System.out.println("homepage");

	}
	
	@AfterTest
	public static void browserclose() {
		System.out.println("browser close");

	}
	@AfterSuite
	public static void deleteallcookie() {
		System.out.println("del");

	}
	

}
