package oopIntro;

public class Product {
	
	public Product() {        //Construster buraya yaz�l�r
		
		System.out.println("Ben �al��t�m");
		
	}
	
	/*Burda aun� isimli 2 tane Product isimli constructor var.Yani burda overloading(a��r� y�kleme) var.Ayn� isimli iki Product ayn� i�i yap�yo fakat farkl� parametrelerle.*/
	/*Overloadig(A��r� y�kleme ) ayn� isimli metod veya constructorlar�n ayn� isimle farkl� tip veya parametrelerle i�lem yapmas�d�r*/ 
	
	
	
	public  Product(int id,String name,double unitePrice, String detail) { //burdada yine consructer  yapt�kki,main blogunun i�indeki haline uygun olsun diye 
	
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
