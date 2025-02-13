package Java.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

	@GetMapping("admin")
	public String m1() {
		
		return "user";
		
		
	}
	

	@GetMapping("user")
	public String m2() {
		
		return "user";
		
		
	}
	
	
	
	
}
