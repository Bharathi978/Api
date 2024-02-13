package com.requ;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTReq {

	
	public static void main(String[] args) {
		//To declare baseURI
		RestAssured.baseURI="https://reqres.in";
		
		// given when
		Response post = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}").when().post("/api/users");
		
		
		// To status Code
		int code = post.getStatusCode();
		System.out.println("Response status code ;"+ code);
		
		//To get response code
		String string = post.getBody().asString();
		System.out.println(string);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
