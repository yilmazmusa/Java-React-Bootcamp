package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccesDataResult;
import kodlamaio.northwind.core.utilities.results.SuccesResult;
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
	public DataResult<List<Product>>  getAll() {
		
		return new SuccesDataResult<List<Product>>(this.productDao.findAll(),"  Data Listelendi"); //BAŞARILI OLMASI DURUMUNDA ÇALIŞACAK DATA GÖNDERECEK MESAJ GÖNDERECEK ZATEN SUCCES OLDUĞU İÇİN TRUE YAZMAMIZA GEREK YOK
				
				
	}

	@Override
	public Result add(Product product) {

		this.productDao.save(product);
		return new SuccesResult("Ürün eklendi");
		
	}

}
