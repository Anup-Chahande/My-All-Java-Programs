package Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class update {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(emp.class);
      SessionFactory sf =cfg.buildSessionFactory();
    Session s =  sf.openSession();
    Transaction c =s.beginTransaction();
    emp e = new emp(1,"anup",22);
    s.update(e);
    c.commit();
    
}
}
