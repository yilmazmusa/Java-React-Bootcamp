package kodlamaio.hrms.business.businessRules;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import kodlamaio.hrms.business.constants.Messages;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;



public class BusinessRules {
	
	public static Result run(Result... logics){
        for(Result logic:logics){
            if(!logic.isSuccess()){
                return logic;
            }
        }
        return new SuccessResult();
    }
	
	
	

	/*public static boolean checkFirstName(String firstName) {
		
		if (firstName.length()<2) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkLastName(String lastName) {
		
		if (lastName.length()<2) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkMail(String eMail) 	{
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		
		if (matcher.matches()) {
			
			return true;
			
		}else {
			
			return false;
		}
	}
	
	public  Result checkPhone(String phone) {
	
		if (phone.length()<7) {			
			return new ErrorResult(Messages.errorPhone);
		}else {
			return new SuccessResult();
		}			
	}
	
	public static boolean checkNationalityId(String nationalityId) {
		
		if (nationalityId.length()<11 || nationalityId.length()>11) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkPassword(String password) {
		
		if (password.length()<6) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkCompanyName(String companyName) {
		
		if (companyName.length()<2) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkWebSite(String webSite) {
		
		if (webSite.length()<5) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkDateOfBirth(LocalDate dateOfBirth) {
		
		if (dateOfBirth == null) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkPositionName(String positionName) {
		
		if (positionName.length()<2) {			
			return false;
		}else {
			return true;
		}			
	}*/

}
