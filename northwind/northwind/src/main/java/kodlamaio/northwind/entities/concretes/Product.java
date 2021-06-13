package kodlamaio.northwind.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="products") 									// bu class veritabanında hangi tabloya denk geliyo onu belirtiyoruz
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
		
		@Id  												// İşlemlerini id ye göre yapacağı için sorgular bu id ye göre yapılandırılır
		@GeneratedValue(strategy = GenerationType.IDENTITY) // idyi+1 şeklinde artır her seferinde diyoruz
		@Column(name="product_id") 		     				//  bu class veritabanında hangi kolona denk geliyo onu belirtiyoruz
		private int id;
		
		//@Column(name="category_id")
		//private int categoryId;
		
		@Column(name="product_name")
		private String productName;
		
		@Column(name="unit_price")
		private double unitPrice;
		
		@Column(name="units_in_stock")
		private short unitsInStock;
		
		@Column(name="quantity_per_unit")
		private String quantityPerUnit;
		
		@ManyToOne()
		@JoinColumn(name="category_id")
		private Category category ;
	
}
	

	