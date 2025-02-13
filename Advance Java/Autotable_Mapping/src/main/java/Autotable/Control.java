package Autotable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Control {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Employee.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	Employee e = new Employee(1,"anup",22,"Dev");

	Transaction t =	s.beginTransaction();
	s.save(e);
	t.commit();
}
}
