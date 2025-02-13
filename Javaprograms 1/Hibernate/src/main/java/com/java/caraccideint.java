package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class caraccideint {
	 public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Accident.class);
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			
		}
}
