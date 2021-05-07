package oopIntro;

public class Product {

	// encapsilation

	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discont;
	//private double unitPriceAfterDiscont;

	public Product() {

	}

	public Product(int id, String name,double unitPrice, String detail,  double discont) {

		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discont = discont;
		//this.unitPriceAfterDiscont = unitPriceAfterDiscont;
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscont() {
		return discont;
	}

	public void setDiscont(double discont) {
		this.discont = discont;
	}

	public double getUnitPriceAfterDiscont() {
		return  this.unitPrice - (this.unitPrice*this.discont / 100);
	}

	
	
	
	
	
	
	
	
	/*
	 * public Product() { //Constructer buraya yaz�l�r.Yani bu bir constructerdur
	 * 
	 * System.out.println("Ben �al��t�m");
	 * 
	 * }
	 * 
	 * /*Burda aun� isimli 2 tane Product isimli constructor var.Yani burda
	 * overloading(a��r� y�kleme) var.Ayn� isimli iki Product ayn� i�i yap�yo fakat
	 * farkl� parametrelerle.
	 */
	/*
	 * Overloadig(A��r� y�kleme ) ayn� isimli metod veya constructorlar�n ayn�
	 * isimle farkl� tip veya parametrelerle i�lem yapmas�d�r
	 */

	/*
	 * public Product(int id,String name,double unitePrice, String detail) {
	 * //burdada yine consructer yapt�kki,main blogunun i�indeki haline uygun olsun
	 * diye
	 * 
	 * this.id=id; this.name=name; this.unitPrice = unitPrice; this.detail=detail;
	 * 
	 * }
	 * 
	 */

}
