package Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(emp.class);
		SessionFactory s =cfg.buildSessionFactory();
		Session ss =s.openSession();
	   Transaction c = ss.beginTransaction();
	   emp e = new emp(3,"sagar",30); 
	   ss.delete(e);
	   c.commit();}
	
}
