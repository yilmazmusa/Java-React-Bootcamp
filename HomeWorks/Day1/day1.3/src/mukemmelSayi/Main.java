package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
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
		int sayilar[]= {1,2,5,7,9,0};
		int aranacak=3;
		boolean varMý=false;
		
		for(int sayii:sayilar) {
			
			if(sayii==aranacak) {
				varMý=true;
				break;
				
			}
			
		}
			if(varMý) {
				
				System.out.println("Sayi mevcuttur.");
			}
			else {
				
				System.out.println("Sayi mevcut deðildir.");
			}
		
	}
}
	
		
	
	
	
	
	

