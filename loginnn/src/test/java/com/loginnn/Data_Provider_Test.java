package com.loginnn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {
	
	@Test(dataProvider = "test_data")
	public void credentials(String username, int password ) {
		
		System.out.println("username:"+username);
		System.out.println("password:"+password);

	}
	@DataProvider
	public Object [][] test_data() {
		return new Object[][] {
			{"smith","234"},
			{"vasanth","786"},
			{"john","987"}
			
		};
  
	}
	
	

}
