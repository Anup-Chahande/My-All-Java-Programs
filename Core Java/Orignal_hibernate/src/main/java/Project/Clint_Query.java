package Project;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Clint_Query {
	
	public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(emp.class);
			SessionFactory sf =cfg.buildSessionFactory();
			Session session = sf.openSession();
           Query que = session.createQuery("select nameR from emp");	
           List<Object[]> ls =que.list();

           for(Object obj:ls) {
        	   
        	   System.out.println(obj);
        	   
           }
	}
}
