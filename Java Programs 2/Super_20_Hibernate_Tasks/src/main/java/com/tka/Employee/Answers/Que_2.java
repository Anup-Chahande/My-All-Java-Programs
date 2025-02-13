package com.tka.Employee.Answers;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.tka.Employee.Department_Entity;
import com.tka.Employee.Employee_entity;


public class Que_2 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee_entity.class);
		cfg.addAnnotatedClass(Department_Entity.class);
		cfg.addAnnotatedClass(Department_Entity.class);		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
	 Criteria c =   s.createCriteria(Employee_entity.class);
	     c.add(Restrictions.gt("salary",10000));
	     List<String> sst =    c.list();       // with where and column
	     for (String st :sst) {
	    	 
	    	 System.out.println("name = " + st);
	     }
	  List<Employee_entity>  ls = c.list();
	     
	for (Employee_entity ss : ls) {
		
		System.out.println(ss);  
		
	}
	}
	
}
