package interfaces;import java.security.MessageDigest;

public class CustomerManager {
	
	private Logger[] loggers;
	
	
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}


	public void add(Customer customer) {
		
		System.out.println("M��teri eklendi : " + customer.getFirstName());
		
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
	}

	
	public void delete(Customer customer) {
		
		System.out.println("M��teri silindi :" + customer.getFirstName());
		
			Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	
}


// CustomerManager loglamaya ba��ml�.2 tip ba��ml�l�k vard�r
// 1)loosly coupled-gev�ek
// 2)tightly coupled-kat� ba�l�  -->tavsiye edilmez