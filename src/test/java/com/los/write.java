package com.los;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class write {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File f= new File("C:\\Users\\Bharathi\\eclipse-workspace\\ApiProject\\src\\test\\resources\\write.json");
		
		
		ObjectMapper object = new ObjectMapper();
		
		
		Address address = new Address("chennai", "TamilNAdu", "India");
		
		
		ArrayList<String> courses = new ArrayList<String>();
		Root root = new Root("Bharathi", 30, true, address, courses);
		object.writeValue(f, root);
		
		courses.add("Java");
		courses.add("selenium");
		courses.add("python");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
