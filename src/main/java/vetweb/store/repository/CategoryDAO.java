package vetweb.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import vetweb.store.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, Long>{
	
	public Category findByDescription (String description);
	
	public Category findByDescriptionContainingIgnoreCase (String description); 
	
	@Query("select category from Category category where category.description like %:desc%")
	//For more complex queries with custom rules we can write the query by our own with @Query
	public List<Category> findLikeDescription(@Param("desc")String description);
	//To explicit what of the method arguments is used as named parameter in the query we should use @Param

}