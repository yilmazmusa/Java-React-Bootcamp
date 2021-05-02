package oopIntro;

public class Product {
	
	public Product() {        //Construster buraya yazýlýr
		
		System.out.println("Ben çalýþtým");
		
	}
	
	
	
	public  Product(int id,String name,double unitePrice, String detail) {
	this();
	this.id=id;
	this.name=name;
	this.unitPrice = unitPrice;
	this.detail=detail;
	
	}
	

	int id;
	String name;
	double unitPrice;
	String detail;

}
