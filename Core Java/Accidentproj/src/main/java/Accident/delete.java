package Accident;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class delete {
	 public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(accident.class);
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			Transaction t =session.beginTransaction();
			accident c = new accident(1,"farari","sagar","12-2-20240","12.10 pm");
			session.delete(c);
			t.commit();
		}

}
