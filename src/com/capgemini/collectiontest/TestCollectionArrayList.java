package com.capgemini.collectiontest;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.collection.*;

//Class to test the collection concept, arraylist
public class TestCollectionArrayList {

	public static void main(String[] args) {
		
		//Initialising the array list for types Car, Cellphone, laptop, School, Television
		List<Car> car = new ArrayList<>();
		List<CellPhone> cellPhone = new ArrayList<>();
		List<Laptop> laptop = new ArrayList<>();
		List<School> school = new ArrayList<>();
		List<Television> tv = new ArrayList<>();
		
		//Adding the elements(objects) to the Arraylist
		car.add(new Car("Maruti" , "MS_800", 2_00_000, 1999));
		car.add(new Car("Porsche", "911 _Spyder", 1_20_78_000, 2016));
		car.add(new Car("Ferrari" , "Ferrari_488",2_67_00_000, 2015));
		
		cellPhone.add(new CellPhone("Nokia", "Lumia", "3G", "Symbian", 20_000));
		cellPhone.add(new CellPhone("Motorola", "G4_Plus", "4G/3G", "Stock Android", 15_000));
		cellPhone.add(new CellPhone("Apple", "IPhoneX", "Face_Id", "iOS", 90_000));
		
		laptop.add(new Laptop("ab219tx", "HP", "Windows 10", "i5"));
		laptop.add(new Laptop("inspiron", "DELL", "ubunto", "i3"));
		laptop.add(new Laptop("macBook pro", "Apple", "Mac OS", "i7"));
		
		school.add(new School("KV", "Jodhpur", "Jodhpur", 23));
		school.add(new School("DPS", "R.K.Puram", "New Delhi", 2));
		school.add(new School("Prisidium", "Manesar", "Gurugram", 14));
		
		tv.add(new Television("Sony", "LED", true, 1_20_000));
		tv.add(new Television("LG", "Plasma", true, 4_12_000));
		tv.add(new Television("Samsung", "LCD", false, 45_000));
		
		//printing the information of the arraylist using 'For Each' loop
		for(Car c : car) {
			System.out.println(c);
		}
		
		for(CellPhone cp : cellPhone) {
			System.out.println(cp);
		}
		
		for(Laptop l : laptop) {
			System.out.println(l);
		}
		
		for(School sc : school) {
			System.out.println(sc);
		}
		
		for(Television t : tv) {
			System.out.println(t);
		}
		
		
	}

}
