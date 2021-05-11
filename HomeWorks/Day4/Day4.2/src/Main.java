import Abstract.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {				

		BaseCustomerManager customerManager= new StarbucksCustomerManager();
		customerManager.save(new Customer(1, "Musa","Yýlmaz","1996.03.30","12171049702") );
		
	}

}
