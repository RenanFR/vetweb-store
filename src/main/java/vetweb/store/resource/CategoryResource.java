package vetweb.store.resource;

import org.springframework.beans.factory.annotation.Autowired;

import vetweb.store.entity.Category;
import vetweb.store.service.CategoryService;

public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	public void save(Category category) {
		this.categoryService.save(category);
	}

}
