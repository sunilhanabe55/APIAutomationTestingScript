package com.api.tests;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import com.api.request.model.LoginRequest;
import com.api.response.model.LoginResponse;
import com.test.base.AuthService;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListeners.class)
public class LoginTest {

//	@Test
//	public void loginApiTest() {
//	
//		Response response = RestAssured.given()
//				.baseUri("http://64.227.160.186:8080/")
//				.header("Content-Type", "application/json")
//				.body("{\"username\": \"uday1234\",\"password\":\"uday1234\"}")
//				.post("api/auth/login");
//		System.out.println(response.asPrettyString());
//		Assert.assertEquals(response.getStatusCode(), 200);
//	}

	@Test
	public void loginApiTest() {

		LoginRequest loginRequestModel = new LoginRequest("uday1234", "uday1234");
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequestModel);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
	}

}
