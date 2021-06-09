package kodlamaio.northwind.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Category;

public interface CategoryDao extends JpaRepository<Category, Short> {

}
