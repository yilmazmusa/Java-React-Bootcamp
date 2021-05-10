package staticDemo;

public class ProductValidator {
	
	
	public ProductValidator() { // Bu bir yapýcý metotdur newlwyincw çalýþýr
		
		System.out.println("Yapýcý blok çalýþtý");
		
		
		
	}
	
	
	
	
	//STATÝCLER DÝREKT CLASS ÝSMÝYLR ÇAÐRILIR
	public static boolean isValid(Product product) { //bir metotu static yaptýðýmýzda class ismiyle çaðrýlabilir
		
		if(product.price>0 && !product.name.isEmpty()) { //ürünün veritabýnýna kaydedilebilmesi için fiyatý>0 ve bir ismi olmasý lazým
			
			return true;
			
		}
		
		else {
			return false;
		
		}
			
	}
	
	public void bisey() {  //bir metotu static yaptýðýmýzda class ismiyle çaðrýlabilir.mesela burda static tanýmlamadýk
		
		
	}
	
}
