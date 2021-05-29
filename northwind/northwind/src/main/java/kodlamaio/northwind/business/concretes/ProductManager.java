package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAcces.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service // bu class projede servis görevi görecek diye spring e bilgi veriyoruz
public class ProductManager implements ProductService {
	
	private ProductDao productDao; 		// burada productdao injekşını yaptık(katmanlı mimari) ED DERS6 2:20

	@Autowired 							// spring gidip arka planda buna karşılık gelebilecek projede ProductdDao nun instancesi olabilecek bir tane sınıfı üretiyo ve onu veriyo
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

}
