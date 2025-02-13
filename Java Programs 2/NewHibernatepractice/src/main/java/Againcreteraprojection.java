import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class Againcreteraprojection {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Products.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		org.hibernate.Criteria c = s.createCriteria(Products.class);
//	                List<Products> ls = c.list();
//	                System.out.println(ls); :- for single critera

//		Projection p = Projections.property("id");
//		c.setProjection(p);
//		List<Integer> id = c.list();
//		for (Integer allid : id) {
//			System.out.println(allid);         :- for single projection column
//		} 

		Projection p1 = Projections.property("id");
		Projection p2 = Projections.property("name");
		ProjectionList pl = Projections.projectionList();

		pl.add(p1);
		pl.add(p2);

		c.setProjection(pl);
		
		
		List<Object[]> ol = c.list();
		for (Object[] itrateobjectsarray : ol) {
			for (Object S : itrateobjectsarray) {
				System.out.println(S);
			}
			
		}

	}
}
