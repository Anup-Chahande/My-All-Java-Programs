package _2.spring1st;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	@GetMapping("firstapi")

	public String m1() {
		return "Anup";
	}

	@GetMapping("Secondapi")
	ArrayList<String> m2() {
		ArrayList<String> al = new ArrayList<>();

		al.add("anup");
		al.add("kiran");
		al.add("sagar");
		return al;
	}
}
