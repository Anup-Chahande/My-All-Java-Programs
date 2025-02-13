import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Clint {
	public static void main(String[] args) {

		Configuration cf = new Configuration();
		
		cf.configure();
		cf.addAnnotatedClass(Products.class);
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();
		Products p1 = new Products(3,"Car",500000);
		s.save(p1);
		Transaction t = s.beginTransaction(); 

		t.commit();
	}
}
