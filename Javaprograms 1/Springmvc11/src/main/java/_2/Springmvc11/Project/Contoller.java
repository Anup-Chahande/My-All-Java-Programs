package _2.Springmvc11.Project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Contoller {
	@Autowired
	Arraylistretu obj;
	@Autowired
	Logindao ls;

	@GetMapping("hi")
	public String m1() {
// not work
		return "Hari";

	}

	@GetMapping("check")
	public String m2() {

		System.err.println("logins");
		return "login";
//without prifix/suffix	: =  return "anup/login.html";

	}

	@GetMapping("list")
	public ArrayList<String> m3() {
		System.err.println("i am here");
		ArrayList<String> data = obj.listofnames();
		return data;

	}

	@GetMapping("check2")
	public String m4() {
		return "anup";
	}

	@GetMapping("check3")
	public String m5(@RequestParam String username, @RequestParam String password) {
		System.out.println(username + password);
        ls.insertdata(username,password);
		return "anup";

	}
}