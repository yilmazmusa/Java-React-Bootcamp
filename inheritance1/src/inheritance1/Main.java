package inheritance1; // inheritance miras demektir.Bizim 2 tane s�n�f�m�z var ve bu s�n�flar�n de�i�ken veya operasyonlar�n�n �o�unlu�u ayn�

						// i�te biz b�yle durumlarda 3. class olu�turup ortak olan �zellikleri ona koyup di�erlerinden ��kar�z.Daha sonra 
						// di�er iki class� bu 3. olan ana classtan extend ederiz.

public class Main {

	public static void main(String[] args) {

		indivudualCustomer musa = new indivudualCustomer();
		musa.customerNumber = "12345";

		CorpotareCustomer trendyol = new CorpotareCustomer();
		trendyol.customerNumber = "84695";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "88789";

		CustomerManager customerManager = new CustomerManager();
		// customerManager.add(trendyol);
		// customerManager.add(musa);
		// customerManager.add(abc);

		Customer[] customers = { musa, trendyol, abc };

		customerManager.addMultiple(customers);

	}

}
