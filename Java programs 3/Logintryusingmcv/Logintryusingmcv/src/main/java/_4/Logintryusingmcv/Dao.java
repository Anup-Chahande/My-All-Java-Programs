package _4.Logintryusingmcv;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {

	@Autowired
	SessionFactory sf;
	
	void adddata(Login data) {
		Configuration cfg = new Configuration();
		

		Session s = sf.openSession();
		s.save(data);

	}

}
