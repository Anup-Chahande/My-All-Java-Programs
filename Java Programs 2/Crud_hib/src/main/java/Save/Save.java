package Save;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Pojo.Student;

public class Save {
public static void main(String[] args) {

	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Student.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	//Student st = new Student(3,"Kiraan",35,23);       
	//Transaction ts = s.beginTransaction();
	Student ss=s.get(Student.class,8);
	System.out.println(ss);
	//ts.commit();
	        
	
}
}
