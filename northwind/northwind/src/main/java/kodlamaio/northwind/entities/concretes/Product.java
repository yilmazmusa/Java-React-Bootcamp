package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="products") 				// bu class veritabanında hangi tabloya denk geliyo onu belirtiyoruz
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
		
		@Id  							// İşlemlerini id ye göre yapacağı için sorgular bu id ye göre yapılandırılır
		@GeneratedValue 				// idyi+1 şeklinde artır her seferinde 
		@Column(name="product_id") 		//  bu class veritabanında hangi kolona denk geliyo onu belirtiyoruz

		private int id;
		
		@Column(name="category_id")
		private int categoryId;
		
		@Column(name="product_name")
		private String productName;
		
		@Column(name="unit_price")
		private double unitPrice;
		
		@Column(name="units_in_stock")
		private short unitsInStock;
		
		@Column(name="quantity_per_unit")
		private String quantityPerUnit;
	
}
	

	