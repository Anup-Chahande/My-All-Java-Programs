import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Restrictionhib {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Products.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		org.hibernate.Criteria c = s.createCriteria(Products.class);

		Projection p2 = Projections.property("id");
		c.setProjection(p2);

		c.add(Restrictions.eq("name", "car"));
		List<Products> p = c.list();
		System.out.println(p);

	}
}
