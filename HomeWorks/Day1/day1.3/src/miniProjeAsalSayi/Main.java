package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int sayi=8;
		int remainder =sayi % 2;
		System.out.println(remainder);
		
		
		boolean isPrime=true;
		
		for(int i=2;i<sayi;i++) {
			
			if(sayi % i ==0) {
				isPrime=false;
				
			}
			
			
		}
		
		if(isPrime) {
			
			System.out.println(sayi+" asaldir");
			
		}
		
		else {
			
			System.out.println(sayi+" asal deðildir");
		}
	}

}
