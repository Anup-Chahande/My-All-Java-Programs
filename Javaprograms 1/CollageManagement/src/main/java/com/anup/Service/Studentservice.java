package com.anup.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anup.Dao.Studentdao;
import com.anup.Entity.Students;

@Service
public class Studentservice {
	@Autowired
	Studentdao st;

	public ArrayList<Students> allstudents() {

		List<Students> allstu = st.allclassstudents();
		ArrayList<Students> allstudentsinfo = new ArrayList<>();
		for (Students allstudents : allstu) {

			allstudentsinfo.add(allstudents);

		}

		return allstudentsinfo;

	}
}
