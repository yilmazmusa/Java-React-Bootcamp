package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.User;

public interface UserService {
	
	Result add(User user);
	DataResult<List<User>> getAll();
	Boolean existsByeMail(String eMail);


}
