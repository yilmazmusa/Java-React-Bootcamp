package staticDemo;

public class ProductManager {
	
	public void add(Product product) {
		
		//ProductValidator validator= new ProductValidator(); // bunun yerine a�a��da ProductValidator yaz�p gelmesi i�in,ProductValidator s�n�f�na gidip static yapmam�z gerekiyot
															  //VE YAPTIKTA ZATEN
		if(ProductValidator.isValid(product)) {    //bir metotu static yapt���m�zda class ismiyle �a�r�labiliriz mesela burdaki gibi
			System.out.println("Eklendi");			//STAT�CLER D�REKT CLASS �SM�YLR �A�RILIR
			
			
		}
		else {
			
			System.out.println("�r�n bilgileri ge�ersizdir.");
		}
		
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey(); 	//MESELA BURDA PRODUCTVAL�DATORDEK� bisey() metodunu static tan�mlamad�k
									//o y�zden burda gelip new i�lemi yapt�k sonra bisey() metodunu �a��rd�k
		
		
		
		
		
	}

}
