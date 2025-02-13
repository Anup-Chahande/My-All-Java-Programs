package Delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Clint {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Classrooms.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Classrooms st = new Classrooms(2,"2000");       
		Transaction ts = s.beginTransaction();
		s.save(st);
		ts.commit();
	}
}
