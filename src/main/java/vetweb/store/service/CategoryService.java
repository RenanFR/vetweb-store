package vetweb.store.service;

import org.springframework.beans.factory.annotation.Autowired;

import vetweb.store.entity.Category;
import vetweb.store.repository.CategoryDAO;

public class CategoryService {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	public void save(Category category) {
		this.categoryDAO.save(category);
	}
	
}
