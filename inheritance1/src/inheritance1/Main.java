package inheritance1; // inheritance miras demektir.Bizim 2 tane sýnýfýmýz var ve bu sýnýflarýn deðiþken veya operasyonlarýnýn çoðunluðu ayný
					  // iþte biz böyle durumlarda 3. class oluþturup ortak olan özellikleri ona koyup diðerlerinden çýkarýz.Daha sonra 
					  // diðer iki classý bu 3. olan ana classtan extend ederiz.

public class Main {

	public static void main(String[] args) {
		
		
		indivudualCustomer   musa = new indivudualCustomer();
		musa.customerNumber="12345";
		
		
		
		
		CorpotareCustomer    trendyol = new CorpotareCustomer();
		trendyol.customerNumber="84695";
		
		
		SendikaCustomer abc=new SendikaCustomer();
		abc.customerNumber="88789";
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(trendyol);
		customerManager.add(musa);
		customerManager.add(abc);
	}

}
