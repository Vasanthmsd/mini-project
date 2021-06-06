package com.loginnn;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Test {
	@Test
	@Parameters({ "username", "password" })
	public static void credentials(@Optional("vvv")String username,@Optional("258") int password) {
		System.out.println("username:" + username);
		System.out.println("password:" + password);

	}

}
