package com.los;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		FileReader file = new FileReader("C:\\Users\\Bharathi\\eclipse-workspace\\ApiProject\\src\\test\\resources\\testing.json");

		ObjectMapper mapper = new ObjectMapper();
		Root readValue = mapper.readValue(file, Root.class);

		String name = readValue.getName();

		System.out.println(name);


		System.out.println(readValue.getAge());
		System.out.println(readValue.isStaus());

		Address address = readValue.getAddress();
		String city = address.getCity();
		String state = address.getState();
		String country = address.getCountry();
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);




		ArrayList<String> courses = readValue.getCourses();
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));
		}







	}

}
