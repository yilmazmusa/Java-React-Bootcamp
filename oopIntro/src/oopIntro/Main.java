package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo v14",15000, "16 GB RAM");  //referans oluþturma 
		
		
		
		
		Product product2 = new Product();  //referans oluþturma
		
		product2.id = 2;
		product2.name = "Lenovo v15";
		product2.unitPrice = 17000;
		product2.detail = "32 GB RAM";
		
		Product product3 = new Product();  //referans oluþturma
		
		product3.id = 3;
		product3.name = "Lenovo v20";
		product3.unitPrice = 5000;
		product3.detail = "84 GB RAM";
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			
			System.out.println(product.name);
			
		}
		
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Ev/Bahçe";
		
		
		ProductManager  productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
		
		


		
		
		
		
	}

}
