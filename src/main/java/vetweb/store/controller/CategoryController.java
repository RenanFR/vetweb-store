package vetweb.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vetweb.store.entity.Category;
import vetweb.store.service.CategoryService;

@Controller
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(path = "/form")
	public String saveForm(Model model) {//Injected by the framework to interact with the page entity
		model.addAttribute("category", new Category());
		return "category/save";
	}
	
	@PostMapping(path = "/save")
	public String save(@ModelAttribute("category")Category category) {//Received automatically from the page by the framework
		categoryService.save(category);
		return "redirect:/categories";
	}
	
	@GetMapping
	public String findAll(Model model) {
		model.addAttribute("categories", categoryService.findAll());
		return "category/categories";
	}
	
	@GetMapping(path = "/{id}")
	public String findById(@PathVariable("id")Long id, Model model) {
		Category category = categoryService.findById(id);
		model.addAttribute("category", category);
		return "category/save";
	}
	
	@GetMapping(path = "/delete/{id}")
	public String delete(@PathVariable("id")Long id, Model model) {
		Category category = categoryService.findById(id);
		categoryService.delete(category);
		return "redirect:/categories";
	}
	
	@GetMapping(path = "/edit/{id}")
	public String edit(@PathVariable("id")Long id, Model model) {
		Category category = categoryService.findById(id);
		model.addAttribute("category", category);
		return "category/save";
	}
	
}
