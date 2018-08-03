package com.capgemini.collection;

/*a laptop class which has its company, model, operating system & processor*/
public class Laptop {
	
	//instance members
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	
	// argument c'tor
	public Laptop(String model, String company, String operatingSystem, String processor) {
		super();
		this.model = model;
		this.company = company;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", processor=" + processor + "]";
	}
}
