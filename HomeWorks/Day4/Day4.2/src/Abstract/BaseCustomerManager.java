package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public  class BaseCustomerManager implements CustomerService  {

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {

		System.out.println("Save to db : " + customer.getFistName() +" "+customer.getLastName());
		
	}

	

}
