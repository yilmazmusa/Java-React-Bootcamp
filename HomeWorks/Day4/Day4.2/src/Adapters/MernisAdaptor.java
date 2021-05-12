package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdaptor implements CustomerCheckService {
	@Override
    public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {

        KPSPublicSoap client = new KPSPublicSoapProxy();
        if (client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFistName().toUpperCase(),
                customer.getLastName().toUpperCase(), customer.getDateOfBirth())) {
            return true;

        } else {

            return false;
        }
	
	
	}
	
}
