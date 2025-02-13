package com.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

	@Autowired
	TargetClass t;
	@GetMapping("call")
	void calltarget() {
		t.m1();
	}
}
