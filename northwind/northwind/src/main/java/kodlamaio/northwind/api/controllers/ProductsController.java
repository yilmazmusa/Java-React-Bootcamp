package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController // ProductsController'a sen bir controllersın diyoruz
@RequestMapping("/api/products") // /api/products adresine bi istek gelirse aşağıdaki ProductsController sınıfı
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
	public List<Product> getAll() {
		
		return this.productService.getAll();

	}
	

}
