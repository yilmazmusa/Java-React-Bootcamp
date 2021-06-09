package kodlamaio.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.CategoryService;
import kodlamaio.northwind.dataAcces.abstracts.CategoryDao;
import kodlamaio.northwind.entities.concretes.Category;

@Service
public class CategoryManager implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	@Override
	public boolean addCategory(Category category) {
		this.categoryDao.save(category);
		return true;
	}

}
