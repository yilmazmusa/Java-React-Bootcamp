package Methods1;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);

		int toplama = topla(5, 9);
		System.out.println(toplama);
		
		int toplam=topla2(2,3,4,4,4,5,8);
		
		System.out.println(toplam);
	}

	public static void ekle() {

	}

	public static void sil() {

	}

	public static void guncelle() {

	}

	public static int topla(int sayi1, int sayi2) {

		return sayi1 + sayi2;

	}

	public static String sehirVer() {

		return "Ankara";
	}

	public static int topla2(int...  sayilar) {
		
		for (int sayi : sayilar) {
			int toplam=0;
			toplam=toplam+sayi;
			return toplam;
			
		} 
			return toplam;
		
		
	}

}
