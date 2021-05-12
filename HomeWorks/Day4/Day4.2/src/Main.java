import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;

import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {				

		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisAdaptor());
			
			
		
		customerManager.save(new Customer(1, "Musa","Yýlmaz",1996,"12171049702") );
		
	}

}
