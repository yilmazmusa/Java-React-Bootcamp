package staticDemo;

public class ProductValidator {
	
	
	public ProductValidator() { // Bu bir yap�c� metotdur newlwyincw �al���r
		
		System.out.println("Yap�c� blok �al��t�");
		
		
		
	}
	
	
	
	
	//STAT�CLER D�REKT CLASS �SM�YLR �A�RILIR
	public static boolean isValid(Product product) { //bir metotu static yapt���m�zda class ismiyle �a�r�labilir
		
		if(product.price>0 && !product.name.isEmpty()) { //�r�n�n veritab�n�na kaydedilebilmesi i�in fiyat�>0 ve bir ismi olmas� laz�m
			
			return true;
			
		}
		
		else {
			return false;
		
		}
			
	}
	
	public void bisey() {  //bir metotu static yapt���m�zda class ismiyle �a�r�labilir.mesela burda static tan�mlamad�k
		
		
	}
	
}
