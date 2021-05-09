package interfaces;import java.security.MessageDigest;

public class CustomerManager {
	
	private Logger[] loggers;
	
	
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}


	public void add(Customer customer) {
		
		System.out.println("Müþteri eklendi : " + customer.getFirstName());
		
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
	}

	
	public void delete(Customer customer) {
		
		System.out.println("Müþteri silindi :" + customer.getFirstName());
		
			Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	
}


// CustomerManager loglamaya baðýmlý.2 tip baðýmlýlýk vardýr
// 1)loosly coupled-gevþek
// 2)tightly coupled-katý baðlý  -->tavsiye edilmez