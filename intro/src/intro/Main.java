package intro;

public class Main {

	public static void main(String[] args) {
		
				
			
			String internetSubeButonu="�nternet �ubesine Gitmek ��in T�klay�n�z";  //camelcase(ilk kelimenin ilk harfi k���k geri kalan�n�n ilk harfi b�y�k)
			double dolarDun = 8.50;
			double dolarBugun = 8.50;
			int vade = 180;
			boolean dustuMu = true;
			
			System.out.println(internetSubeButonu);		
			
			
			
			if(dolarBugun<dolarDun) {
						
				System.out.println("Dolar D��t� Resmi");
				
			}
			
			else if(dolarBugun>dolarDun) {
				
				System.out.println("Dolar Y�kseldi Resmi");
						
			}
			
			else {
				
				System.out.println("Dolar E�ittir  Resmi");
				
				
			}
		
			String kredi1="H�zl� Kredi";
			String kredi2="Mutlu Hayat Kredi";
			String kredi3="Konut Kredi";
			String kredi4="�if�i Kredi";
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
					
					"H�zl� Kredi",
					"Mutlu Hayat Kredi",
					"Konut Kredi",
					"�if�i Kredi",
					"MSB Kredi",
					"Meb Kredi",
					"K�lt�r Bakanl��� Kredisi"
				
			    };
			
			//foreach d�ng�s�
			for(String kredi: krediler) 
			
			{
				
				System.out.println(kredi);
				
				
			}
			
			for(int i=0;i<krediler.length;i++) {
				
				System.out.println(krediler[i"]);
				
				
				
				
			}
			
			
			
			
			
			
			
		
		
	}

}

