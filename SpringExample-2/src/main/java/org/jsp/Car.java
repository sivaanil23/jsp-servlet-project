package org.jsp;

public class Car {
	private String brand;
	private String milage;
	private String model;
	private double cost;
	private String color;
	public Car(String brand, String milage, String model, double cost, String color) {
		super();
		this.brand = brand;
		this.milage = milage;
		this.model = model;
		this.cost = cost;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", milage=" + milage + ", model=" + model + ", cost=" + cost + ", color=" + color
				+ "]";
	}
	
	

}
