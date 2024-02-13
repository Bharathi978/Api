package com.requ;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PUTReq {
	
	
	public static void main(String[] args) {
		
		

		RestAssured.baseURI="https://reqres.in";
		
		
		Response put = RestAssured.given().header("Content-Type","application/json").body(RequestBody.put()).when().put("/api/users/2");
		
		int code = put.getStatusCode();
		System.out.println("Response status code ;"+ code);
		
		
		String string = put.getBody().asString();
		System.out.println(string);
		
	}

}
