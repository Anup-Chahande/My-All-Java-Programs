package Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client_main {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(emp.class);
		SessionFactory sf =cfg.buildSessionFactory();
		Session session = sf.openSession();
		emp em =	session.load(emp.class, 1);
		System.out.println(em);
	}

}
