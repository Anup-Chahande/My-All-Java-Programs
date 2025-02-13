package com.NewSpringMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controler {

	@GetMapping("Page1")
	public String sendpage() {

		return "my.html";

	}

	@GetMapping("Page2")
	public String sendpage2() {

		return "my2.jsp";

	}
	
	
	@GetMapping("Page3")
	public String sendpage3() {


		return "Pagemain3.jsp";

		
	}
	
	@GetMapping("ss")
	public String sendpage4(@RequestParam String game, @RequestParam String gane) {

	System.out.println(game);
	System.out.println(gane);

		return "Pagemain3.jsp";

		
	}
	
	
	
	

}
