package _1.jpaproject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

	@Autowired
	Service s;

	@GetMapping("check")
	public List<User> getalluser() {

		return s.getalluser();

	}

	@PostMapping("check")
	public void adduser(@RequestBody User user) {

		s.adduser(user);
	}

	@PutMapping("check")

	public void updateuser(@RequestBody User user) {

		s.updateuser(user);
	}
	
	@GetMapping("check/{id}")

	Optional<User> getbyid(@PathVariable int id) {
		return s.getbyid(id);
		
	}
	
	@DeleteMapping("check/{id}")
	 void deletebyid(@PathVariable int id) {
		
		s.deletebyid(id);
		
		
	}
	
	

}
