package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Advice {

	@Before("execution (* com.aop.TargetClass.m1())")
	
	void runbeforeTarget() {
		System.err.println("Addion of Program is");
		
	}
	
	
}
