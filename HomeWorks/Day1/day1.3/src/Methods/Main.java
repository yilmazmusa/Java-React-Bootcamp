package Methods;

public class Main {

	public static void main(String[] args) {

			sayiBulmaca();


	}
	
		public static void sayiBulmaca() {
			
			
			int sayilar[]= {1,2,5,7,9,0};
			int aranacak=2 ;
			boolean varM�=false;
			
			for(int sayii:sayilar) {
				
				if(sayii==aranacak) {
					varM�=true;
					break;
					
				}
				
			}
			String mesaj;
			
				if(varM�) {
					mesaj=aranacak + " Sayisi mevcuttur";
					mesajVer(mesaj);
					
				}
				else {
					mesaj=aranacak + " Sayisi mevcut de�ildir";
					mesajVer(mesaj);
				}
			
		}
		
		public static void mesajVer(String mesaj) {
			
			System.out.println(mesaj);
			
		}
		
		 
			
}
