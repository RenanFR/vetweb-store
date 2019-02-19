package vetweb.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class IndexController {
	
	@GetMapping
	@ResponseBody
	public String index() {
		return "Index page for test";
	}

}
