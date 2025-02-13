package com.thekiranacademy.alpha;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		Session session = cfg.configure().addAnnotatedClass(Student.class).buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Student s = new Student();
		s.setName("anup");
		s.setMob(1234516);
		session.save(s);
		transaction.commit();
		session.close();
	}
}
