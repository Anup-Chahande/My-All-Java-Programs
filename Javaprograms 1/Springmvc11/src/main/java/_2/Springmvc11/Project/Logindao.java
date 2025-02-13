package _2.Springmvc11.Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Transaction;


@Repository
public class Logindao {
	@Autowired
	SessionFactory sf;

	public void insertdata(String username,String password) {

		Session s = sf.openSession();
Login_data login = new Login_data(username,password);
		Transaction ts = s.beginTransaction();
		s.save(login);
		ts.commit();
		
		

	}
}
