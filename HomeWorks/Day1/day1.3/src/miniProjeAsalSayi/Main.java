package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {

		int sayi = 1;
		int remainder = sayi % 2;
		System.out.println(remainder);

		boolean isPrime = true;

		if (sayi < 1) {

			System.out.println("Gecersiz Deger");
			return;

		}

		if (sayi == 1) {

			System.out.println("Sayi asal degildir");
			return;
		}

		for (int i = 2; i < sayi; i++) {

			if (sayi % i == 0) {
				isPrime = false;

			}

		}

		if (isPrime) {

			System.out.println(sayi + " asaldir");

		}

		else {

			System.out.println(sayi + " asal degildir");
		}
	}

}
