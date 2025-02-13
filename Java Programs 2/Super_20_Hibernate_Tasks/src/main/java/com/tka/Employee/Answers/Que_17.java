package com.tka.Employee.Answers;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.Employee.Department_Entity;
import com.tka.Employee.Employee_entity;
import com.tka.Employee.Project_Entity;

public class Que_17 {

	public static void main(String[] args) {
		Configuration cg = new Configuration();
	    cg.configure();   
		cg.addAnnotatedClass(Employee_entity.class);
		cg.addAnnotatedClass(Department_Entity.class);
		cg.addAnnotatedClass(Project_Entity.class);
	        SessionFactory cf = cg.buildSessionFactory();

	        Session s =  cf.openSession();
	     Criteria c =  s.createCriteria(Department_Entity.class);
		   c.setFetchMode("employees", FetchMode.JOIN);

		List<Department_Entity> ls = c.list();
		for (Department_Entity jj : ls) {
			System.out.println(jj);
		}

		    	
}
}
