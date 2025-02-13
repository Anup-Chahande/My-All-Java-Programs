package Super20Spring.Super20Spring.quw2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Servicee{
@Autowired
	Dao d;
	public String getproduct(int id) {
		return d.getproduct(id);
	}
	
	
	public TreeSet<Integer> getproductassending() {
		return d.getproductassending();
	}


	public ArrayList<Product> maxpricee() {
		return d.maxpricee();
	}


	public ArrayList<Product> searchbyname(String name) {
		return d.searchbyname(name);
	}


	public ArrayList<Product> minprice(int minprice) {

		return d.minprice(minprice);
	}


	public String totalquentity() {
		return d.totalquentity();
	}

	
	
	
	
}
