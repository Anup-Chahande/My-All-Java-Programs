package Project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mainclint2 {
public static void main(String[] args) {
	Configuration cfg =new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Car.class);
	SessionFactory fs = cfg.buildSessionFactory();
	Session s = fs.openSession();
          Car c = s.load(Car.class,4);

System.out.println(c);
}
}
