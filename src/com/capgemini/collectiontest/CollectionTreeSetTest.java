package com.capgemini.collectiontest;

import java.util.*;
import com.capgemini.collection.*;  //To import the classes(Car, Cellphone, Laptop, School, Television)

//This class is used to test the TressSet implementation and sorting the values in tree set by overriding 
//the compareTo() in Car Object
public class CollectionTreeSetTest {
	
	public static void main(String[] args) {
		
		Set<Car> carDetails = new TreeSet<Car>();
		
		//Adding the elements(objects) to the TreeSet
		carDetails.add(new Car("Maruti" , "MS_800", 2_00_000, 1999));
		carDetails.add(new Car("Porsche", "911 _Spyder", 1_20_78_000, 2016));
		carDetails.add(new Car("Ferrari" , "Ferrari_488",2_67_00_000, 2015));
		carDetails.add(new Car("Alfa Romero" , "AF_230",67_00_000, 2012));
		
		for(Car c : carDetails) {
			System.out.println(c);
		}
		
		// initializing the Treeset
				Set<String> studentName = new TreeSet<>();
				
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
				
	}

}
