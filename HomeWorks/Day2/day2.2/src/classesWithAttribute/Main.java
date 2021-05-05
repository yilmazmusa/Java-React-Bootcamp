package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
		
		Product product=new Product();
		
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Efsane Hýz");
		product.setPrice(5800);
		product.setStockAmount(150);
		
		
		
		ProductManager productmanager=new ProductManager();
		productmanager.Add(product);
		
		System.out.println(product.getKod());
		
		
		
		
		
		
	}

}
