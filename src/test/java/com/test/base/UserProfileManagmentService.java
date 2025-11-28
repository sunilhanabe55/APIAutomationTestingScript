package com.test.base;

import com.api.request.model.LoginRequest;
import com.api.request.model.ProfileRequest;

import io.restassured.response.Response;

public class UserProfileManagmentService extends BaseService {

	private static final String BASE_PATH = "/api/users/";

	public Response getProfile(String token) {
		setAuthToken(token);
		return getRequest(BASE_PATH + "profile");
	}
	
	public Response updateProfile(ProfileRequest payload,String token)
	{
		setAuthToken(token);
		return updateProfile(payload, BASE_PATH + "profile");
		
	}

}
