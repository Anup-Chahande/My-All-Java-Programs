package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	 public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Car.class);
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			Transaction t =session.beginTransaction();
			Car c = new Car(2,"tata","ram");
			session.update(c);
			t.commit();
		}
}
