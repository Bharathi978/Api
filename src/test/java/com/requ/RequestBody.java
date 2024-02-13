package com.requ;

public class RequestBody {

	
	
	public static String postbody() {
		
		String input = "{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}";
		
		
		return input;
		

	}
	
	
	public static String patch() {
		String input ="{\r\n" + 
				"    \"name\": \"bharathi\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}";
		
		return input;
	

	}
	
	public static String put() {
		
		String input ="{\r\n" + 
				"    \"name\": \"sharathi\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}";
		return input;

	}
	
	
	
	
	
	
	
	
	
	
	
}
