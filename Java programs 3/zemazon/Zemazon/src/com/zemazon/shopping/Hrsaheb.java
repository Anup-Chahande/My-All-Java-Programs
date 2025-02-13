package com.zemazon.shopping;

import java.util.ArrayList;

public class Hrsaheb {

	void m3() {
		Jyoti j = new Jyoti();
		ArrayList<Product> data = 	j.m2();
		
		for (Product product : data) {
			System.out.println(product);
		}
	}
	
	public static void main(String[] args) {
		Hrsaheb hr = new Hrsaheb();
		hr.m3();
	}
}
