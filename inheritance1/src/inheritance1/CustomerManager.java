package inheritance1;

public class CustomerManager {

	public void add(Customer customer) {
		
		System.out.println(customer.customerNumber + "  kaydedildi.");
		
	}
	
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		
		for (Customer customer : customers) {
			
			add(customer);
			
			
		}
		
		
	}
	
	
	
	
	
}//SOLID - Open Closed Principle:Bu prensip derki sisteme yeni özellik eklendiðinde mevcutta bulunan hiç bir kodu deðiþtiremezsin,sadece yeni kodu ekleyebilirsin.
