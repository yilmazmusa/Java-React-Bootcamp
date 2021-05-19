package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;

import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	//depentýsin ýnjeksýn yani sen data accesse baðlýsýn ama gevþek baðþý olmasý gerekkiyor.Dataaccessin sadece 
	//referans tutucu olan abstract klosöründeki yapýsýna baðlanabiilirsin.O yüzden bir bi aþaðý private Productdao deðiþkeni oluþturmamýz lazým
	
	private ProductDao productDao;
	private LoggerService loggerService;
	
	

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		//iþ kodlarý yazýlýr
		if(product.getCategoryId()==1) {
			
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
			
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi" + product.getName());
		
		
		
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
