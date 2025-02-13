package Accident;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class save {
	 public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(accident.class);
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			Transaction t =session.beginTransaction();
			accident c = new accident(1,"farari","hwak","24-5-1997","12.10 pm");
			session.save(c);
			t.commit();
		}
}
