package com.greedy.branch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuTwoController {

	@GetMapping("/menu_2")
	public void menu_2(Model model) {
		
		model.addAttribute("message", "두 번째 메뉴 결과 등장!");
	}
}
