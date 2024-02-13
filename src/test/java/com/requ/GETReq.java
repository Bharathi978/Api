package com.requ;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETReq {
	
	public static void main(String[] args) {
		
		
		// To Declare baseURI
		RestAssured.baseURI="https://reqres.in";
			
		// Given When
		Response re = RestAssured.given().header("Content-Type","application/json").queryParam("page", "2").when().get("/api/users");
		
		// To get the Status Code
		int code = re.getStatusCode();
		System.out.println("Response status code :"+ code);
		
		// To Get Response Body
		String sd = re.getBody().asString();
		System.out.println(sd);
		
	}
	
	
	
	
	
	

}
