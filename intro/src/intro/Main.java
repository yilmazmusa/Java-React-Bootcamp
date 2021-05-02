package intro;

public class Main {

	public static void main(String[] args) {
		
				
			
			String internetSubeButonu="Ýnternet Þubesine Gitmek Ýçin Týklayýnýz";  //camelcase(ilk kelimenin ilk harfi küçük geri kalanýnýn ilk harfi büyük)
			double dolarDun = 8.50;
			double dolarBugun = 8.50;
			int vade = 180;
			boolean dustuMu = true;
			
			System.out.println(internetSubeButonu);		
			
			
			
			if(dolarBugun<dolarDun) {
						
				System.out.println("Dolar Düþtü Resmi");
				
			}
			
			else if(dolarBugun>dolarDun) {
				
				System.out.println("Dolar Yükseldi Resmi");
						
			}
			
			else {
				
				System.out.println("Dolar Eþittir  Resmi");
				
				
			}
		
			String kredi1="Hýzlý Kredi";
			String kredi2="Mutlu Hayat Kredi";
			String kredi3="Konut Kredi";
			String kredi4="Çifçi Kredi";
			String kredi5="MSB Kredi";
			String kredi6="Meb Kredi";
		
			
			System.out.println(kredi1);
			System.out.println(kredi2);
			System.out.println(kredi3);
			System.out.println(kredi4);
			System.out.println(kredi5);
			System.out.println(kredi6);
			
			
			String[] krediler= 
				{
					
					"Hýzlý Kredi",
					"Mutlu Hayat Kredi",
					"Konut Kredi",
					"Çifçi Kredi",
					"MSB Kredi",
					"Meb Kredi",
					"Kültür Bakanlýðý Kredisi"
				
			    };
			
			//foreach döngüsü
			for(String kredi: krediler) 
			
			{
				
				System.out.println(kredi);
				
				
			}
			
			for(int i=0;i<krediler.length;i++) {
				
				System.out.println(krediler[i"]);
				
				
				
				
			}
			
			
			
			
			
			
			
		
		
	}

}

