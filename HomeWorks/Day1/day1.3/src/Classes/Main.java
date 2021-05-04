package Classes;

public class Main {

	public static void main(String[] args) {

		int sayi = 24;

		if (sayi < 20) {

			System.out.println("Sayi 20 den küçüktür.");

		}

		else if (sayi == 20) {

			System.out.println("Sayi 20 ye eþittir.");

		}

		else {

			System.out.println("Sayi 20 den büyüktür.");

		}

		/* SWÝTCH CASELER */

		char grade = 'B';

		switch (grade) {
		
		case 'A': {

			System.out.println("Mükemmel Geçtiniz.");
			break;
		}
		
		case 'B': {

			System.out.println("Ýyi Geçtiniz.");
			break;

		}
		
		case 'C' : {
			
			System.out.println(" Geçtiniz.");
			break;
		}
		
		case 'F' : {
			
			System.out.println("Kaldýnýz.");
			break;
		}
		

		default:
			
			System.out.println("Geçersiz not girdiniz");
		}

		
								/*    DÖNGÜLER  */
		
		/*FOR DÖNGÜSÜ*/
		
		int sayii=10;
		
		for (int i = 2; i < sayii; i+=2) {
			
			System.out.println(i);
			
			
		}
		
		System.out.println("Döngü bitti");
		
		/*WHÝLE DÖNGÜSÜ*/
		
		int i=1;
		while(i<10) {
			
			System.out.println(i);
			i+=2;
			
		}
		
		System.out.println("While Döngüsü bitti.");
		
	
	
									/* DÝZÝLER(Arrays)  */

	
	
		String [] kisiler = new String[5];
		kisiler[0]="Musa";
		kisiler[1]="Ahmet";
		kisiler[2]="Mehmet";
		kisiler[3]="Can";
		kisiler[4]="Aliþ";
		
		/*for (int j = 0; j < kisiler.length; j++) {
			System.out.println(kisiler[j]);
			
		} */
		
		for (String kisi : kisiler) {   /*foreach döngüsü*/
			
			System.out.println(kisi);
			
		}
		
		double [] myList = {1.2,2.3,4.8,5.4,11.9};
		double total=0;
		double max=myList[0];
		for (double number : myList) {
			
			if(max<number) {
				
				max=number;
				
			}
			
			total=total+number;
			System.out.println(number);
			
		}
		System.out.println("En büyük sayi= "+max);
		System.out.println("Toplam = "+total);
		
		
		String mesaj="Bugün hava çok güzel laaaaaan haha";
		System.out.println(mesaj);
		System.out.println("Eleman Sayisi= "+mesaj.length());
		System.out.println("5.Eleman= "+mesaj.charAt(6));
		System.out.println(mesaj.concat(" Yaþasýnnnn..."));
		System.out.println(mesaj.startsWith("B"));  /* Metin B harfi ile baþlýyo mu ? ona göre true ya da false döndürür*/
		System.out.println(mesaj.endsWith("n"));     /* Metin n harfi ile bitiyo mu ? ona göre true ya da false döndürür*/
	    
		char [] karakterler= new char[10];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
	
		
		
									/* REPLACE :metin içindeki a harflerini e yap/boþluk yerine - yap gibi */
	
		/*System.out.println(mesaj.replace(oldChar:, k)); */  
		
									
						
									/*  SUBSTRÝNG :metinin 6.indisinden itibaren  10.indise kadar al yazdýr/2.indisten itibaren al sonuna kadar yazdýr*/
		
		System.out.println(mesaj.substring(6,mesaj.length()));
		
		System.out.println(mesaj.substring(6,10));
		
					
										/*  SPLÝT: metni parçalamak için kullanýlýr.Mesela boþluklara göre sýrala  */
		
		for(String kelime : mesaj.split(" ")) {
			
			System.out.println(kelime);
			
			
			
		}
								/*toLowerCase: Büyük harfleri Küçük harfe çevirir.*/
								/*toUpperCase: Küçük harfleri Büyük harfe çevirir.*/
			
			
			System.out.println(mesaj.toLowerCase()); 
			System.out.println(mesaj.toUpperCase()); /* veritananýna arama ifadesi gönderdiðimizde kullanýrýz*/
			
		
								/* TRÝM: Metnin baþýndaki ve sonundaki boþluklarý siler*/
			
			System.out.println(mesaj.trim());
	
	
	
	
	
	
	
	}
}