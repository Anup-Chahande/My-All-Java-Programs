package com.NewSpringMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class Controler2 {
	@GetMapping("Page4")
	public String sendpage() {

		return "Entity.jsp";

	}

	@GetMapping("check1")
	public String sendpage2(@ModelAttribute Entity es) {

		System.out.println(es);
		
				return "Entity.jsp";

	}
}
