package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;

import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	//depent�sin �njeks�n yani sen data accesse ba�l�s�n ama gev�ek ba��� olmas� gerekkiyor.Dataaccessin sadece 
	//referans tutucu olan abstract klos�r�ndeki yap�s�na ba�lanabiilirsin.O y�zden bir bi a�a�� private Productdao de�i�keni olu�turmam�z laz�m
	
	private ProductDao productDao;
	private LoggerService loggerService;
	
	

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		//i� kodlar� yaz�l�r
		if(product.getCategoryId()==1) {
			
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
			return;
			
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi" + product.getName());
		
		
		
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
