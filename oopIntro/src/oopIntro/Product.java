package oopIntro;

public class Product {
	
	public Product() {        //Construster buraya yazýlýr
		
		System.out.println("Ben çalýþtým");
		
	}
	
	/*Burda auný isimli 2 tane Product isimli constructor var.Yani burda overloading(aþýrý yükleme) var.Ayný isimli iki Product ayný iþi yapýyo fakat farklý parametrelerle.*/
	/*Overloadig(Aþýrý yükleme ) ayný isimli metod veya constructorlarýn ayný isimle farklý tip veya parametrelerle iþlem yapmasýdýr*/ 
	
	
	
	public  Product(int id,String name,double unitePrice, String detail) { //burdada yine consructer  yaptýkki,main blogunun içindeki haline uygun olsun diye 
	
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
