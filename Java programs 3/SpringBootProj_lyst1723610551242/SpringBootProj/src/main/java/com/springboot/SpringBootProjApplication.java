package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.aopservices.PaymentService;
import com.springboot.aopservices.PaymentServiceImpl;

@SpringBootApplication
public class SpringBootProjApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjApplication.class, args);
	   System.out.println("hello student");
	}

}
