import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UseronetomanyProducts {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Products.class);
	cfg.addAnnotatedClass(Users.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	Users u = new Users(1,"Anup",23);
	Products p1 = new Products(1,"Pc",50000);
	Products p2 = new Products(2,"Laptop",50000);
	ArrayList<Products> al = new ArrayList<Products>();
	
	al.add(p1);
	al.add(p2);
	u.setLp(al);
	s.save(u);
	Transaction t = s.beginTransaction();
	t.commit();
	

	
	
}
}
