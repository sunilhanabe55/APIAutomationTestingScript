package com.api.tests;

import org.testng.annotations.Test;

import com.api.request.model.LoginRequest;
import com.api.request.model.ProfileRequest;
import com.api.response.model.LoginResponse;
import com.test.base.AuthService;
import com.test.base.UserProfileManagmentService;

import io.restassured.response.Response;

public class UpdateProfileTest {

	@Test
	public void updateProfile()
	{
		ProfileRequest profileRequest =	new ProfileRequest.Builder().firstname("snil").email("sunil@yahoo.com").build();
				
		
		LoginRequest loginRequest = new LoginRequest("udaya1234", "udaya1234");
		AuthService authService = new AuthService();
		Response response =  authService.login(loginRequest);
		
		      LoginResponse loginResponse= response.as(LoginResponse.class);
		      System.out.println(loginResponse.getToken());
		      
		      UserProfileManagmentService userProfile = new UserProfileManagmentService();
		      userProfile.updateProfile(null, loginResponse.getToken());
		
	}
	
}
