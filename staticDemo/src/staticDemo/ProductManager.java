package staticDemo;

public class ProductManager {
	
	public void add(Product product) {
		
		//ProductValidator validator= new ProductValidator(); // bunun yerine aþaðýda ProductValidator yazýp gelmesi için,ProductValidator sýnýfýna gidip static yapmamýz gerekiyot
															  //VE YAPTIKTA ZATEN
		if(ProductValidator.isValid(product)) {    //bir metotu static yaptýðýmýzda class ismiyle çaðrýlabiliriz mesela burdaki gibi
			System.out.println("Eklendi");			//STATÝCLER DÝREKT CLASS ÝSMÝYLR ÇAÐRILIR
			
			
		}
		else {
			
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey(); 	//MESELA BURDA PRODUCTVALÝDATORDEKÝ bisey() metodunu static tanýmlamadýk
									//o yüzden burda gelip new iþlemi yaptýk sonra bisey() metodunu çaðýrdýk
		
		
		
		
		
	}

}
