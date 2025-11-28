package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.request.model.LoginRequest;
import com.api.response.model.LoginResponse;
import com.test.base.AuthService;

import io.restassured.response.Response;

public class PasswordResetTest {

	@Test(description = "Password reset")
	public void passwordResetApiTest() {
	
		AuthService authService = new AuthService();
		Response  response = authService.forgot_password("sunil@gmail.com");
		Assert.assertEquals(response.getStatusCode(), 200);

		
	}
	
}
