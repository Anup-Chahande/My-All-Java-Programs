package Update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Pojo.Student;

public class Update {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Student st = new Student(10,"kiran",35,23);       
		Transaction ts = s.beginTransaction();
		s.delete(st);
		ts.commit();
		        
		
	}
	
}
