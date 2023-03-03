package com.greedy.branch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuOneController {
	
	@GetMapping("/menu_1")
	public void menu_1(Model model) {
		
		model.addAttribute("message", "menu_1 결과 등장!"); 
	}

}
