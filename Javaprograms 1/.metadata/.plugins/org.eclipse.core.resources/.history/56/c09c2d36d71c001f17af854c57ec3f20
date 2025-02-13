package Project;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClintCriteria {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(emp.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria c = session.createCriteria(emp.class);
		List<emp> ls = c.list();
		for (Object data : ls) {
			System.out.println(data);
		}
	}
}
