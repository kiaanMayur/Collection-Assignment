package com.capgemini.collectiontest;

// class to test the functionality of a HashMap 
import java.util.*;

public class CollectionHashMapTest {
	
	public static void main(String[] args) {
		
		Map<String, String> studentDetails = new HashMap<>(); // initialized a  HashMap
		
		// adding the Key and the Value to the HashMap
		studentDetails.put("Mayur", "Apple");
		studentDetails.put("Alok", "Banana");
		studentDetails.put("Gaurav", "Pomogranate");
		studentDetails.put("Udit", "Tomato");
		studentDetails.put("Rahul", "Banana");
		
		// Returns a Set view of the mappings contained in this map
		Set<Map.Entry<String, String>> entrySet = studentDetails.entrySet();
		
		// for each loop to display the keys and values of this map
		for(Map.Entry<String, String> e : entrySet) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}
		
		
	}

}
