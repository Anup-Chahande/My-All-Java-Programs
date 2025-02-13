package Accident;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Clint_critera {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(accident.class);
		SessionFactory s = cfg.buildSessionFactory();
		Session session = s.openSession();
                Criteria c =  session.createCriteria(accident.class);
	                  List<accident>  ls = c.list();
	                  for(accident as:ls) {
	                	  System.out.println(as);
	                  }
	
	}
}
