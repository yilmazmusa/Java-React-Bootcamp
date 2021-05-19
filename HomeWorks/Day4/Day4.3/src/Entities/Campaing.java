package Entities;

import Absrtact.Entity;

public class Campaing implements Entity {
	
	int id;
	String name;
	double discount;
	
	public Campaing() {
		
		
	}

	public Campaing(int id, String name, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
