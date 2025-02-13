import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Query {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Products.class);
		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();
		org.hibernate.Query q = s.createQuery("Select id,name From Products");

		List<Object[]> ls = q.list();
		for (Object[] products : ls) {
			for (Object objects : products) {
				System.out.println(objects);

			}
		}

	}

}
