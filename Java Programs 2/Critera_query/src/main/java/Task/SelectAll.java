package Task;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class SelectAll {
public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
	 Criteria c =   s.createCriteria(Student.class);
	     Projection p1 =  Projections.property("name");	     
	     Projection p2 =  Projections.property("id");	     
	  ProjectionList p =  Projections.projectionList();
	  p.add(p1);
	  p.add(p2);
	     c.setProjection(p);
	   List <Object[]> ks = c.list();
	    for(Object[] ss:ks) {
	    	for(Object sp:ss) {
	    		System.out.println(sp);
	    		
	    	}
	    	
	    }
	   
	
	}
}

