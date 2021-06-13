package kodlamaio.northwind.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

	@Override
	public DataResult<Product> getByProductName(String productName) {
		
		return new SuccesDataResult<Product>
		(this.productDao.getByProductName(productName),"  Data Listelendi");
		
	}

	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String  productName,  int categoryId) {
		
		//buseiness codes(aşağıdakileri listelemek için burdaki şartları sağla)
		
		return new SuccesDataResult<Product>
		(this.productDao.getByProductNameAndCategory_CategoryId( productName,  categoryId),"  Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName,  int categoryId) {
		
		return new SuccesDataResult<List<Product>>
		(this.productDao.getByProductNameOrCategory_CategoryId( productName, categoryId),"  Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
		return new SuccesDataResult<List<Product>>
		(this.productDao.getByCategoryIn(categories),"  Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccesDataResult<List<Product>>
		(this.productDao.getByProductNameContains(productName),"  Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccesDataResult<List<Product>>
		(this.productDao.getByProductNameStartsWith(productName),"  Data Listelendi");
	}

	

	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		return new SuccesDataResult<List<Product>>
		(this.productDao.getByNameAndCategory_CategoryId(productName, categoryId),"  Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return new SuccesDataResult<List<Product>>(this.productDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<Product>> getAllSorted() {
		
		Sort sort=Sort.by(Sort.Direction.DESC,"productName");
		return new SuccesDataResult<List<Product>>(this.productDao.findAll(sort),"Başarılı şekilde getirildi");
		
	}

}
