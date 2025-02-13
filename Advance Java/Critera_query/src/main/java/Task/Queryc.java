package Task;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Queryc {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
                 Query q =  s.createQuery("select name from Student");
                 List<String>  st =  q.list();
                    for(String ss:st) {
	    	  
	    	  System.out.println(ss);
	      }
	
	
	}
}
