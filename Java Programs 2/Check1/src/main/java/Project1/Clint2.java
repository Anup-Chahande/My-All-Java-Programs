package Project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Clint2 {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Car.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	Car c = s.load(Car.class, 1);
	System.out.println(c);
}
}
