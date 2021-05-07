package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo v14", 15000, "16 GB RAM", 10); // referans oluþturma

		Product product2 = new Product(); // referans oluþturma

		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setUnitPrice(16000);
		product2.setDiscont(10);
		
		
		System.out.println(product2.getUnitPriceAfterDiscont());
		
		
		Category category=new Category();
		category.setId(1);
		category.setName("Ýçecek");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category.getName());
		System.out.println(category2.getName());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		Product product3 = new Product(); // referans oluþturma

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {

			System.out.println(product.name);

		}

		System.out.println(products.length);

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);

		productManager.addToCart(product2);

		productManager.addToCart(product3);
		
		*/

	}

}
