package _4.Logintryusingmcv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controler {

	@GetMapping("page")
	public String getpage() {
		
		
		return "Login.jsp";
	}
	
	@PostMapping("recive")
	public String setdata(@ModelAttribute Login data) {
		
		Dao dao = new Dao();
		dao.adddata(data);
		
		return "Login.jsp";
	}
	
	
	
	
	
}
