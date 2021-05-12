import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer)throws NumberFormatException, RemoteException  {
		
		return true;
	}

	
	
	}
