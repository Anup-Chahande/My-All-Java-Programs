package Onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Conroler {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Customer.class);
	cfg.addAnnotatedClass(Adharcard.class);

	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	Adharcard a = new Adharcard(12,"jun");
	Customer c = new Customer(1,"anup");
	a.setC(c);
	s.save(a);
	Transaction t = s.beginTransaction();
	t.commit();
	
}
}
