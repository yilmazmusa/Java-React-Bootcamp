package kodlamaio.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.dataAccess.UserDao;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccesDataResult;
import kodlamaio.northwind.core.utilities.results.SuccesResult;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	

	@Override
	public Result add(User user) {
		
		this.userDao.save(user);
		return new SuccesResult("Kullanıcı Eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		
		return new SuccesDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı Bulundu");
		
	}

}
