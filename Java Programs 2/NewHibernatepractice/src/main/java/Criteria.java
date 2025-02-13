import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class Criteria {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Products.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		org.hibernate.Criteria c = s.createCriteria(Products.class);

		Projection p = Projections.property("price");
		Projection p2 = Projections.property("name");
		ProjectionList pl = Projections.projectionList();
		pl.add(p);
		pl.add(p2);

		c.setProjection(pl);
		List<Object[]> ls = c.list();
		for (Object[] ints : ls) {

		for (Object objects : ints) {
			System.out.println(objects);
		}
		}

	}

}
