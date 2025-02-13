package Project;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;

public class Projectionss {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(emp.class);
		SessionFactory sf =cfg.buildSessionFactory();
		Session session = sf.openSession();
         Criteria c =session.createCriteria(emp.class) ;
              
        Projection p1 = Projections.property("name");
        Projection p2 = Projections.property("id");
        ProjectionList prj = Projections.projectionList();
        prj.add(p1);
        prj.add(p2);
        c.setProjection(prj);
        List<Object[]> ls =c.list();
              
         for(Object[] data:ls) {
        	 for(Object obj : data) {
           	  System.out.println(obj.toString());

        	 }
              }
	
}
}
