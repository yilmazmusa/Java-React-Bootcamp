 package inheritance2;

public class Main {

	public static void main(String[] args) {
		
		//loglama:kim ne zaman ne yaptý loglama budur arka planda loglanýr yani tutulur.Biz bu loglarý bir dosyanýn içinde veya veritabýnda veya mail(bu sizi takip etti,beðendi tarzýnda) olarak tutabiliriz.
		//birbirinin alternatifi olan kodlar  if  ile yazýlmaz
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new EmailLogger());
		
		
		
		
		
	}

}
