package staticDemo;

public class Main {

	public static void main(String[] args) {

		
		ProductManager manager= new ProductManager(); 
		Product product= new Product();
		product.price=10;
		product.name="Mouse";
		manager.add(product);
		
		
		

	}

}
//javada ana class static olamaz ama ana class�n i�inde bir class a�arsak buna inner class denir
//inner class static tan�mlanabilir
