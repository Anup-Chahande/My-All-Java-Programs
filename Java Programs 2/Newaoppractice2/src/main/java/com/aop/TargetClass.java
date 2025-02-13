package com.aop;

import org.springframework.stereotype.Component;

@Component
public class TargetClass {

	void m1() {
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println(c);
		
	}
	

}
