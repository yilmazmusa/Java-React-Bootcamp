package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;


public class Main {

	public static void main(String[] args) {
		
		
		//spring Ioc ile çözülecek
		ProductService productService = new  ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
	
		Product product = new Product(1,2 ,"Elma",12,50);
		productService.add(product);

	}

}
