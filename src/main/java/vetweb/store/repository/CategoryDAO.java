package vetweb.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vetweb.store.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, Long>{
	
	public Category findByDescription (String description);
	
	public Category findByDescriptionContainingIgnoreCase (String description); 

}