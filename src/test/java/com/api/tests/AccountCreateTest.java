package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.request.model.SignUpRequest;
import com.test.base.AuthService;

import io.restassured.response.Response;

public class AccountCreateTest {
	
	@Test(description = "Sign up the Account")
	public void accountcreate()
	{
		
		 SignUpRequest si= new  SignUpRequest.Builder()
		.username("sunil1234")
		.email("sunil@gmail.com")
		.firstName("sunil")
		.lastName("kumar")
		.password("sunil1234")
		.mobileNumber("12345679899")
		.build();
		
		AuthService serAuthService = new AuthService();
		Response response= serAuthService.signUp(si);
		Assert.assertEquals(response.getStatusCode(), 200l);
		System.out.println(response);
	}
	

}
