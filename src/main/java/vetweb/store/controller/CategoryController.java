package vetweb.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vetweb.store.entity.Category;
import vetweb.store.service.CategoryService;

@Controller
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public String saveForm() {
		return "category/save";
	}
	
	@PostMapping
	public String save(Category category) {
		categoryService.save(category);
		return null;
	}

}
