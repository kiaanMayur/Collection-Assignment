package com.capgemini.collectiontest;

import java.util.*;
// class to implement the concept of LinkedHashSet
public class CollectionLinkedHashSet {
	
	public static void main(String[] args) {
		
		// initializing the LinkedHashSet
		Set<String> studentName = new LinkedHashSet<>();
		
		//Adding the elements(objects) to the LinkedHashSet
		studentName.add("Mayur");
		studentName.add("Alok");
		studentName.add("Gaurav");
		studentName.add("Udit");
		studentName.add("Rahul");
		
		//printing the information of the LinkedHashSet using 'For Each' loop
		for(String sc :studentName) {
					System.out.println(sc);
				}
		System.out.println("Order maintained.");

	}

}
