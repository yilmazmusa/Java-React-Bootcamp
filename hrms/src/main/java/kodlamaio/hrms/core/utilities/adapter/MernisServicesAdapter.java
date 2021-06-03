package kodlamaio.hrms.core.utilities.adapter;

import java.rmi.RemoteException;

import kodlamaio.hrms.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServicesAdapter implements IdentityValidation {

	@Override
	public boolean isRealPerson(Candidate candidate) {
		boolean result; 
        KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy(); 
        try { 
            result = kpsPublicSoapProxy.TCKimlikNoDogrula(
                    Long.parseLong(candidate.getIdentificationNumber()),
                    candidate.getFirstName().toUpperCase(),
                    candidate.getLastName().toUpperCase(),
                    candidate.getBirthDate().getYear()); 
        }
        catch (RemoteException e) { 
            result = false; 
            e.printStackTrace(); 
        }

        return result;
		
	}
	
	

}
