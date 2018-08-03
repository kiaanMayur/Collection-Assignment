package com.capgemini.collection;

/*class which implements comparable interface so compareTo() is overridden for sorting the values*/
public class Car  implements Comparable<Car> {
	
	// instance members
	private String maker;
	private String model;
	private int price;
	private int year;
	
	// argument c'tor
	public Car(String maker, String model, int price, int year) {
		super();
		this.maker = maker;
		this.model = model;
		this.price = price;
		this.year = year;
	}
	
	// c'tor without args
	public Car() {
		// TODO Auto-generated constructor stub
	}

	
	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Car [maker=" + maker + ", model=" + model + ", price=" + price + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maker == null) ? 0 : maker.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		result = prime * result + year;
		return result;
	}

	//equals method to check if the two values are same or not
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (maker == null) {
			if (other.maker != null)
				return false;
		} else if (!maker.equals(other.maker))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public int compareTo(Car car) {
		
		int hash = this.maker.compareTo(car.maker);
        return hash;
	}

}
