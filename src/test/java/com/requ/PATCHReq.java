package com.requ;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PATCHReq {

	public static void main(String[] args) {
		
		
		RestAssured.baseURI="https://reqres.in";
		
		
		Response patch = RestAssured.given().header("Content-Type","application/json").body(RequestBody.patch()).when().patch("/api/users/2");
		
		int code = patch.getStatusCode();
		System.out.println("Response status code ;"+ code);
		
		
		String string = patch.getBody().asString();
		System.out.println(string);
		
		 
		
		
		
		
	}
	
	
	
	
}
