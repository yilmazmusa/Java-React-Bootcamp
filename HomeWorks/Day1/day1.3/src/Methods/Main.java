package Methods;

public class Main {

	public static void main(String[] args) {

			/*sayiBulmaca();*/
			
			

	}
	
		public static void sayiBulmaca() {
			
			
			int sayilar[]= {1,2,5,7,9,0};
			int aranacak=2 ;
			boolean varMý=false;
			
			for(int sayii:sayilar) {
				
				if(sayii==aranacak) {
					varMý=true;
					break;
					
				}
				
			}
			String mesaj;
			
				if(varMý) {
					mesaj=aranacak + " Sayisi mevcuttur";
					mesajVer(mesaj);
					
				}
				else {
					mesaj=aranacak + " Sayisi mevcut deðildir";
					mesajVer(mesaj);
				}
			
		}
		
		public static void mesajVer(String mesaj) {
			
			System.out.println(mesaj);
			
		}
		
		 
			
}
