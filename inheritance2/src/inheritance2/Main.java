 package inheritance2;

public class Main {

	public static void main(String[] args) {
		
		//loglama:kim ne zaman ne yapt� loglama budur arka planda loglan�r yani tutulur.Biz bu loglar� bir dosyan�n i�inde veya veritab�nda veya mail(bu sizi takip etti,be�endi tarz�nda) olarak tutabiliriz.
		//birbirinin alternatifi olan kodlar  if  ile yaz�lmaz
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new EmailLogger());
		
		
		
		
		
	}

}
