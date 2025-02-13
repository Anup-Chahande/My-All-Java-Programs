package com.tka.Employee.Answers;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;

import com.mysql.cj.x.protobuf.MysqlxCrud.Projection;
import com.tka.Employee.Department_Entity;
import com.tka.Employee.Employee_entity;


public class Que_5 {
	public static void main(String[] args) {
		Configuration cg = new Configuration();
	    cg.configure();   
		cg.addAnnotatedClass(Employee_entity.class);
		cg.addAnnotatedClass(Department_Entity.class);
		cg.addAnnotatedClass(Department_Entity.class);

	        SessionFactory cf = cg.buildSessionFactory();

	        Session s =  cf.openSession();
	     Criteria c =  s.createCriteria(Employee_entity.class);
	     ProjectionList p =  Projections.projectionList();

	     PropertyProjection p1 =  Projections.property("firstname");	     
  PropertyProjection p2 =  Projections.property("lastname");	     
p.add(p1);
p.add(p2);
	     List<Employee_entity> ls = c.list();
		
		for (Employee_entity employee_entity : ls) {
			System.out.println(employee_entity);
		}
		
		   c.setProjection(p);
		   List <Object[]> ks = c.list();
		    for(Object[] ss:ks) {
		    	for(Object sp:ss) {
		    		System.out.println(sp);
		    		
		    	}
		    	
		    }
		   
		
		
		
		
	}	
		
}
