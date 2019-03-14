package vetweb.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vetweb.store.entity.Category;
import vetweb.store.repository.CategoryDAO;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	public void save(Category category) {
		this.categoryDAO.save(category);
	}
	
	public List<Category> findAll() {
		return this.categoryDAO.findAll(); 
	}
	
	public Category findByDescription(String description) {
		return this.categoryDAO.findByDescription(description);
	}
	
	public Category findById(Long id) {
		return this.categoryDAO.findById(id).get();
	}
	
	public void delete(Category category) {
		categoryDAO.delete(category);
	}
	
}
