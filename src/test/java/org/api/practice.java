
package org.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class practice {

	public static void main(String[] args) throws IOException, ParseException {


		FileReader f = new FileReader("C:\\Users\\Bharathi\\eclipse-workspace\\ApiProject\\src\\test\\resources\\practice.json");
		JSONParser p = new JSONParser();

		Object parse = p.parse(f);


		JSONObject j = (JSONObject)parse;
		System.out.println(j.get("id"));
		System.out.println(j.get("type"));
		System.out.println(j.get("name"));
		System.out.println(j.get("ppu"));

		System.out.println(j.get("batters"));
		
		Object object = j.get("batters");
		JSONObject h = (JSONObject)object;
		
		Object object2 = h.get("batter");
		
		JSONArray array1 =(JSONArray)object2;
		for (int i = 0; i < array1.size(); i++) {
			System.out.println(array1.get(i));
		}
		
		
		Object object1 = j.get("topping");
		JSONArray array = (JSONArray)object1;

		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}









	}































}
