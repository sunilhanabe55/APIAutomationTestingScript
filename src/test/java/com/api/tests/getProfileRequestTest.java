package com.api.tests;

import org.testng.annotations.Test;

import com.api.request.model.LoginRequest;
import com.api.response.model.LoginResponse;
import com.api.response.model.ProfileResponse;
import com.test.base.AuthService;
import com.test.base.UserProfileManagmentService;

import io.restassured.response.Response;

public class getProfileRequestTest {

	
	@Test
	public void profileRequest()
	{
		LoginRequest login= new LoginRequest("/uday1234/", "/uday1234/");
		AuthService authService = new AuthService();
		Response loginresponse =authService.login(login);
		LoginResponse loginResponse = loginresponse.as(LoginResponse.class); 
		
		UserProfileManagmentService upms = new UserProfileManagmentService();
		Response  profileResponse =upms.getProfile(loginResponse.getToken());
		System.out.println(profileResponse.asPrettyString());
		ProfileResponse userprofileResponse = profileResponse.as(ProfileResponse.class);
		
		System.out.println(userprofileResponse.getUsername());
	}
	
}
