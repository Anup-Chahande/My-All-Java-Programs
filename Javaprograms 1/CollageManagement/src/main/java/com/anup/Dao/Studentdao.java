package com.anup.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anup.Entity.Students;

@Repository
public class Studentdao {
	@Autowired
	SessionFactory sf;

	public List<Students> allclassstudents() {
		Session session = sf.openSession();
		Criteria c = session.createCriteria(Students.class);

		List<Students> allstudents = c.list();

		return allstudents;
	}

}
