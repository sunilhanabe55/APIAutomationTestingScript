package com.test.base;

import com.api.filter.LoggingFilter;
import com.api.request.model.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService { // wrapper of Rest assured
	// Base Uri
	// Creating the Request
	// Handling the Response

	private static final String BASE_URI = "http://64.227.160.186:8080/";
	private RequestSpecification requestSpecification;

	  static {
	        RestAssured.filters(new LoggingFilter());
	    }
	
	public BaseService() {
		requestSpecification = RestAssured.given().baseUri(BASE_URI);
	}

	protected void setAuthToken(String token)
	{
		requestSpecification.header("Authorization", "Bearer ", token);
		
	}
	protected Response postRequest(Object payload, String endPoint) {
            return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);
    }

	protected Response putRequest(Object payload, String endPoint) {
        return requestSpecification.contentType(ContentType.JSON).body(payload).put(endPoint);
}
	
	protected Response getRequest(String endPoint) {
        return requestSpecification.get(endPoint);
}
	
}
