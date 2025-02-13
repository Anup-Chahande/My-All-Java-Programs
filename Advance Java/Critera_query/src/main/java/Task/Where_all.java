package Task;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Projection;

public class Where_all {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
	 Criteria c =   s.createCriteria(Student.class);
	     c.add(Restrictions.eq("name","anup"));
	   //  Projection p =  Projections.property("name");	     
	  //  c.setProjection(p);
//	     List<String> sst =    c.list();       // with where and column
//	     for (String st :sst) {
//	    	 
//	    	 System.out.println("name = " + st);
//	     }
	  List<Student>  ls = c.list();
	     
	for (Student ss : ls) {
		
		System.out.println(ss);  
		
	}
	}

}
