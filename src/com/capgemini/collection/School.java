package com.capgemini.collection;

/*a school class which has its name, city, district, and ranking*/
public class School {
	
	//instance members
	private String name;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;
	
	//argument c'tor
	public School(String name, String city, String schoolDistrict, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict
				+ ", greatSchoolRanking=" + greatSchoolRanking + "]";
	}
	
	

}
