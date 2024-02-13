package org.api;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		
		// To Read the File
		FileReader f = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\payload\\sample.json");
		
		// To parse the JSONFile
		JSONParser g = new JSONParser();
		Object p = g.parse(f);
		
		// To cast into JSONObject
		JSONObject j = (JSONObject)p;
		Object d = j.get("Manager");

		//To cast into  manager JSONArray
        JSONArray k =  (JSONArray)d;
        Object l = k.get(0);
		
		// To cast into manager JSONObject
		JSONObject h= (JSONObject)l;
		Object o = h.get("firstname").toString();
		System.out.println("firstname:"+o);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
