package _3.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controler {
	
	
	@GetMapping("/")
	public String openlogin() {

		return "login";
	}
	
	
	@GetMapping("senddatainform")
	public String getData(@RequestParam String username) {
		
		System.out.println(username);
		return "check";		
		
	}
}
