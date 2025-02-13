package com.tka.Employee;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Controller {
	
	public static void main(String[] args) {
		
	
	
	Configuration cfg = new Configuration(); 
	cfg.configure();
	cfg.addAnnotatedClass(Employee_entity.class);
	cfg.addAnnotatedClass(Department_Entity.class);

	SessionFactory sf = cfg.buildSessionFactory();
        Session s  = sf.openSession();
        Employee_entity e1 = new Employee_entity("Anup","Chahande","anucpahande@gmail.com",20000);
	}       
}
