package classesWithAttribute;

/*a�a��daki de�i�kenlere attribure veya field denir*/
/*bir class sadece bir i�i yapar,bir metot sadece bir i�i yapar.*/
/* bir de�i�keni private tan�mlarsak sadece tan�mland��� blokta ge�erli olur */
/* get() --> getter,bir de�eri getir anlam�nda,oku anlam�nda,bir de�eri okumaya y�nelik i�lemdi.Gette parametre vermemixe gerek yoktur */
/*set() --> setter,bir de�eri set et,yani kur anlam�nda,bir�eyin de�erini vermeye yarar.Sette parametre vermemiz gerekir. */
/*Overloadig(A��r� y�kleme ) ayn� isimli metod veya constructorlar�n ayn� isimle farkl� tip veya parametrelerle i�lem yapmas�d�r*/ 
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
