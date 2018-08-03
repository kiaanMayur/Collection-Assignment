package com.capgemini.collection;

/*cellphone which has its manf. company, model, description, operating system and price*/
public class CellPhone {
	
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private int price;
	
	//argument c'tor
	public CellPhone(String company, String model, String description, String operatingSystem, int price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operatingSystem=" + operatingSystem + ", price=" + price + "]";
	}

}
