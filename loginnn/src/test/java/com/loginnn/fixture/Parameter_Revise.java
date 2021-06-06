package com.loginnn.fixture;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Revise {
	
	@Test
	@Parameters({"username","password"})
	private void credentials(@Optional("vasanthAfreen")String username,@Optional("786")int password) {
		System.out.println("username:"+username);
		System.out.println("password:"+password);

	}
	
	

}
