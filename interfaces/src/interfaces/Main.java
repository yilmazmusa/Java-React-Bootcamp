package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new DatabaseLogger(), new EmailLoger(), new SmsLogger(), new FileLogger()};
		
		CustomerManager customerManager= new CustomerManager(loggers);

		Customer musa= new Customer(1, "Musa", "Y�lmaz");
		
		customerManager.add(musa);
		
	}

}
//interfaceler newlenemez