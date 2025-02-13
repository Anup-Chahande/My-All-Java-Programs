package com.tka.Employee.Answers;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;

import com.tka.Employee.Department_Entity;
import com.tka.Employee.Employee_entity;

public class Quw_6 {
	
	
	public static void main(String[] args) {
		Configuration cg = new Configuration();
	    cg.configure();   
		cg.addAnnotatedClass(Employee_entity.class);
		cg.addAnnotatedClass(Department_Entity.class);
		cg.addAnnotatedClass(Department_Entity.class);

	        SessionFactory cf = cg.buildSessionFactory();

	        Session s =  cf.openSession();
	     Criteria c =  s.createCriteria(Employee_entity.class);
                    c.setProjection(Projections.rowCount());
                    Long count =(Long) c.uniqueResult();
                    
	     System.out.println(count);
	     
	    
	   
		    	
		    }}


