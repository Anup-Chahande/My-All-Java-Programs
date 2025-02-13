package Super20Spring.Super20Spring.quw2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controler {
	@Autowired
	Servicee sc;
	
@GetMapping("getproduct/{id}")
	String getproduct(@PathVariable int id) {
	System.out.println(1);
	return sc.getproduct(id);
	
}
//que3

@GetMapping("getproducts")
 public TreeSet<Integer> getproductassending() {
	
	
	return sc.getproductassending();
}
//que4

@GetMapping("maxprice")
public  ArrayList<Product> maxpricee() {
	
	return sc.maxpricee();
}

//5th
@GetMapping("searchname/{name}")
public ArrayList<Product> searchbyname(@ PathVariable String name) {
	
	return sc.searchbyname(name);
	
	
}
//6th
@GetMapping("minprice/{minprice}")
 public ArrayList<Product> minprice(@PathVariable int minprice) {
	
	return sc.minprice(minprice);
}
//7th
@GetMapping("totalstock")
public String totalquentity() {
	
	return sc.totalquentity();
}

	
}
