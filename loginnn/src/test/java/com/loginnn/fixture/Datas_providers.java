package com.loginnn.fixture;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datas_providers {

	@Test(dataProvider = "data_types")
	public void credentials(String username, int password) {
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		
	}
	@DataProvider
	public Object[][] data_types() {
		return new Object[][] {
			
			{"raj","555"},
			{"ccc","555"},
			{"eee","888"},
		};

	}
}
