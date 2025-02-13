package Task;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Criteriaa {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
	 Criteria c =   s.createCriteria(Student.class);
	      List<Student> st =   c.list();
	      for(Student ss:st) {
	    	  
	    	  System.out.println(ss);
	      }
	
	
	}
}
