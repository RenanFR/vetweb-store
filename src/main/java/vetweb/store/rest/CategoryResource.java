package vetweb.store.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vetweb.store.entity.Category;
import vetweb.store.service.CategoryService;

@RestController
@RequestMapping("/endpoint/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<Category>> allCategories() {
		return new ResponseEntity<List<Category>>(categoryService.findAll(), HttpStatus.OK);
	}

}
