package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		char harf='�';
		
		switch(harf) {
		
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kal�n sesli harf");
			break;
			
			default:
			System.out.println("�nce sesli harf");
		
		}
		
		int sayi=6;
		int total=0;
		
		for(int i=1;i<sayi;i++) {
			
			if(sayi % i ==0) {
				
				total=total+i;
			}
			
		}
		
		if(total==sayi) {
			System.out.println(sayi+" mukemmel sayidir.");
			
			
		}
		else {
			
			System.out.println(sayi+" mukemmel sayi degildir.");
		}
	}

}
