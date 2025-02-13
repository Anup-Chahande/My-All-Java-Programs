package Super20Spring.Super20Spring.quw2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class Dao {
@Autowired
SessionFactory sf;

public String getproduct(int id) {
	String msg = null;
	
	Session s = sf.openSession();

	ArrayList<Product> al = new ArrayList<>();
	Criteria c = s.createCriteria(Product.class);

	List<Product> alldata = c.list();
	for (Product p : alldata) {

		if (p.getProductid() == id) {

			al.add(p);
		}
		else if(p.getProductid() != id) {
                 msg="id not found";

		}


	}
	return  msg + al;


}

public TreeSet<Integer> getproductassending() {
	
	Session ss = sf.openSession();
	Criteria c = ss.createCriteria(Product.class);
	TreeSet <Integer>price = new TreeSet<>();
	List<Product> allproduct = c.list();
	System.out.println(allproduct);
	
	for (Product product : allproduct) {

		price.add(product.price);
	}
	
	return price;
	
	
	
}

public ArrayList<Product> maxpricee() {
	Session ss = sf.openSession();
	Criteria c = ss.createCriteria(Product.class);
	TreeSet <Integer>price = new TreeSet<>();
	List<Product> allproduct = c.list();
	ArrayList<Product> products = new ArrayList<Product>();
	for (Product product1 : allproduct) {
	
		if(product1.price>400000) {
			
			products.add(product1);
			
			
		}

				
			}
		
		

	return products;
}

public ArrayList<Product> searchbyname(String name) {
	System.err.println(name);
	Session s = sf.openSession();

	ArrayList<Product> al = new ArrayList<>();
	Criteria c = s.createCriteria(Product.class);

	List<Product> alldata = c.list();
	for (Product p : alldata) {

		if (name.equals(p.pname)) {

			al.add(p);
		}
	
	
}
	return al;






}

public ArrayList<Product> minprice(int minprice) {
	
	Session s = sf.openSession();

	ArrayList<Product> al = new ArrayList<>();
	Criteria c = s.createCriteria(Product.class);

	List<Product> alldata = c.list();
	for (Product p : alldata) {
	if(p.price<minprice) {
		
		
		al.add(p);
	}
	
	
	
	
}
	
	return al;
}

public String totalquentity() {
	Session s = sf.openSession();

	ArrayList<Product> al = new ArrayList<>();
	Criteria c = s.createCriteria(Product.class);

	List<Product> alldata = c.list();
	for (Product p : alldata) {
	al.add(p);
	
}
	
	return "Total no of stock is = "+al.size();
}
}