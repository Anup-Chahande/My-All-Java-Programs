package Hi;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Pojo {
public static void main(String[] args) {
	
	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Emp.class);
	SessionFactory fac = cfg.buildSessionFactory();
	Session s = fac.openSession();
	Emp c = s.load(Emp.class,1);
	Emp c1 = s.load(Emp.class,2);

	System.out.println(c );
	System.out.println(c1);

}
}
