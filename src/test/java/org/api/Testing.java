package org.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Testing {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		
		FileReader f =new FileReader("C:\\Users\\Bharathi\\eclipse-workspace\\ApiProject\\src\\test\\resources\\testing.json");
		JSONParser ja = new JSONParser();
		
		
		Object parse = ja.parse(f);
		
		
		// type  cast - object JSONObject
		JSONObject obj =(JSONObject)parse;
		
		System.out.println(obj.get("Name"));
		System.out.println(obj.get("age"));
		System.out.println(obj.get("Status"));
		//System.out.println(obj.get("address"));
		System.out.println(obj.get("courses"));
		System.out.println("============================================================");
		
		
		// for all get method  - Return Type Object
		Object object = obj.get("address");
		
		
		//Type casting from object - JSONObject
		
		JSONObject h = (JSONObject)object;
		System.out.println(h.get("city"));
		System.out.println(h.get("State"));
		System.out.println(h.get("country"));
		
		
		System.out.println("=================================================================");		
		
		Object object2 = obj.get("courses");
		
		//Type Casting from Object - JSonArray
		JSONArray array =(JSONArray)object2;
		
		for (int i = 0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
