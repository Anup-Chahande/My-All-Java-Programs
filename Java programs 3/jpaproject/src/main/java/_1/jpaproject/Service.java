package _1.jpaproject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


@org.springframework.stereotype.Service
public class Service {

	@Autowired
	CustomRepository cs;

	public List<User> getalluser() {
		return cs.findAll();
	}

	public void adduser(User user) {

		
		cs.save(user);
	}

	public void updateuser(User user) {

		cs.save(user);
	}

	public Optional<User> getbyid(int id) {

	
		return cs.findById(id);
	}

	public void deletebyid(int id) {
	User u =	cs.getById(id);
	cs.delete(u);
	}
	

}
