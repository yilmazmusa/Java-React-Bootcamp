package Classes;

public class Main {

	public static void main(String[] args) {

		int sayi = 24;

		if (sayi < 20) {

			System.out.println("Sayi 20 den k���kt�r.");

		}

		else if (sayi == 20) {

			System.out.println("Sayi 20 ye e�ittir.");

		}

		else {

			System.out.println("Sayi 20 den b�y�kt�r.");

		}

		/* SW�TCH CASELER */

		char grade = 'B';

		switch (grade) {
		
		case 'A': {

			System.out.println("M�kemmel Ge�tiniz.");
			break;
		}
		
		case 'B': {

			System.out.println("�yi Ge�tiniz.");
			break;

		}
		
		case 'C' : {
			
			System.out.println(" Ge�tiniz.");
			break;
		}
		
		case 'F' : {
			
			System.out.println("Kald�n�z.");
			break;
		}
		

		default:
			
			System.out.println("Ge�ersiz not girdiniz");
		}

		
								/*    D�NG�LER  */
		
		/*FOR D�NG�S�*/
		
		int sayii=10;
		
		for (int i = 2; i < sayii; i+=2) {
			
			System.out.println(i);
			
			
		}
		
		System.out.println("D�ng� bitti");
		
		/*WH�LE D�NG�S�*/
		
		int i=1;
		while(i<10) {
			
			System.out.println(i);
			i+=2;
			
		}
		
		System.out.println("While D�ng�s� bitti.");
		
	
	
									/* D�Z�LER(Arrays)  */

	
	
		String [] kisiler = new String[5];
		kisiler[0]="Musa";
		kisiler[1]="Ahmet";
		kisiler[2]="Mehmet";
		kisiler[3]="Can";
		kisiler[4]="Ali�";
		
		/*for (int j = 0; j < kisiler.length; j++) {
			System.out.println(kisiler[j]);
			
		} */
		
		for (String kisi : kisiler) {   /*foreach d�ng�s�*/
			
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
		System.out.println("En b�y�k sayi= "+max);
		System.out.println("Toplam = "+total);
		
		
		String mesaj="Bug�n hava �ok g�zel laaaaaan haha";
		System.out.println(mesaj);
		System.out.println("Eleman Sayisi= "+mesaj.length());
		System.out.println("5.Eleman= "+mesaj.charAt(6));
		System.out.println(mesaj.concat(" Ya�as�nnnn..."));
		System.out.println(mesaj.startsWith("B"));  /* Metin B harfi ile ba�l�yo mu ? ona g�re true ya da false d�nd�r�r*/
		System.out.println(mesaj.endsWith("n"));     /* Metin n harfi ile bitiyo mu ? ona g�re true ya da false d�nd�r�r*/
	    
		char [] karakterler= new char[10];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
	
		
		
									/* REPLACE :metin i�indeki a harflerini e yap/bo�luk yerine - yap gibi */
	
		/*System.out.println(mesaj.replace(oldChar:, k)); */  
		
									
						
									/*  SUBSTR�NG :metinin 6.indisinden itibaren  10.indise kadar al yazd�r/2.indisten itibaren al sonuna kadar yazd�r*/
		
		System.out.println(mesaj.substring(6,mesaj.length()));
		
		System.out.println(mesaj.substring(6,10));
		
					
										/*  SPL�T: metni par�alamak i�in kullan�l�r.Mesela bo�luklara g�re s�rala  */
		
		for(String kelime : mesaj.split(" ")) {
			
			System.out.println(kelime);
			
			
			
		}
								/*toLowerCase: B�y�k harfleri K���k harfe �evirir.*/
								/*toUpperCase: K���k harfleri B�y�k harfe �evirir.*/
			
			
			System.out.println(mesaj.toLowerCase()); 
			System.out.println(mesaj.toUpperCase()); /* veritanan�na arama ifadesi g�nderdi�imizde kullan�r�z*/
			
		
								/* TR�M: Metnin ba��ndaki ve sonundaki bo�luklar� siler*/
			
			System.out.println(mesaj.trim());
	
	
	
	
	
	
	
	}
}