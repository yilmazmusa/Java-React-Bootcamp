package classesWithAttribute;


/*classlar ya attribute(deðiþken/özellik) ya da operasyon(classýn içinde metot tanýmlama
   o metotda ekle/sil/güncelle tarzýnda operasyonlar tutar) tutar. 
 
/*aþaðýdaki deðiþkenlere attribure veya field denir*/
/*bir class sadece bir iþi yapar,bir metot sadece bir iþi yapar.*/
/* bir deðiþkeni private tanýmlarsak sadece tanýmlandýðý blokta geçerli olur */
/* get() --> getter,bir deðeri getir anlamýnda,oku anlamýnda,bir deðeri okumaya yönelik iþlemdi.Gette parametre vermemixe gerek yoktur */
/*set() --> setter,bir deðeri set et,yani kur anlamýnda,birþeyin deðerini vermeye yarar.Sette parametre vermemiz gerekir. */
/*Overloadig(Aþýrý yükleme ) ayný isimli metod veya constructorlarýn ayný isimle farklý tip veya parametrelerle iþlem yapmasýdýr*/ 



public class Product {

		private int id;
		private String name;
		private String description;
		private double price;
		private int stockAmount;
		private String kod;
		
		
			
		
		public int getId() {
			
			return id;
		}
		
		
		public void setId(int id) {
			
			this.id=id;
			
		}
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}

		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}

		


		public int getStockAmount() {
			return stockAmount;
		}


		public void setStockAmount(int stockAmount) {
			this.stockAmount = stockAmount;
		}


		public String getKod() {
			return this.name.substring(0, 3) + id;
		}


		


		

		


		


		
		
		
		
		
		
}
