package com.anup.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anup.Entity.Students;
import com.anup.Service.Studentservice;

@RestController
public class Studentcontroller {
	@Autowired
	Studentservice ss;
	
	@GetMapping("allstudents")
	List<Students> allstudents() {
		
	return ss.allstudents();	
		
		
	}

}
