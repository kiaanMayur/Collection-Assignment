package com.capgemini.collection;

/*a television class which has its company, type, is it 3D enabled or not & price*/
public class Television {
	
	//instance members
	private String company;
	private String type;
	private boolean threeDEnabled;
	private int price;
	
	// arguments c'tor
	public Television(String company, String type, boolean threeDEnabled, int price) {
		super();
		this.company = company;
		this.type = type;
		this.threeDEnabled = threeDEnabled;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", threeDEnabled=" + threeDEnabled + ", price="
				+ price + "]";
	}
	
}
