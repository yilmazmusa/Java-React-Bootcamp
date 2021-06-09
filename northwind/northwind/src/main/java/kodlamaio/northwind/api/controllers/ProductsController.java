package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController						 // ProductsController'a sen bir controllersın diyoruz
@RequestMapping("/api/products") 	// /api/products adresine bi istek gelirse aşağıdaki ProductsController sınıfı
									// karşılıycak // farklı farklı controller olduğunu belirtiyoruz(sipariş
									// için,ürün için,sepete ekleme için vs)

public class ProductsController {

	private ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall") // getall diye bir istekte bulunursak burası çalışacak // veri isteme
							// yapacağımız için bunu koyuyoruz(Biz istekte bulunucaz diyoruz)
	public DataResult<List<Product>>  getAll() {
		
		return this.productService.getAll();
				
				

	}
	
	@PostMapping("/add") //@RequestBody hem istek yapıyo hemde al datan budur diyo.instaya foto atarken fotoyu,yazıyı,konumu vs ekleyip gönderiyosun
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
		
		
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName) {
		
		return this.productService.getByProductName(productName);
		
	}
	//list yaparsak liste şeklinde dersek  productName  categoryId ye uyan kaç tane varsa ürün varsa o kadar getirir.list yapmazsak ilk uyanı getirir.
	
	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Product> getByProductNameAndCategoryId(@RequestParam("productname") String productName,@RequestParam("categoryId") int categoryId){
		
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}

	@GetMapping("/getByProductNameContains")
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
		
		return this.productService.getByProductNameContains(productName);
		
	}
	
	@GetMapping("/getAllByPage")
	DataResult<List<Product>>  getAll(int pageNo, int pageSize){
		return this.productService.getAll(pageNo, pageSize);
		
		
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Product>> getAllSorted() {
	
		return this.productService.getAllSorted();
	}
	
	
	
	
	
	
}
