package com.zemazon.shopping;

import java.util.ArrayList;

public class Vaishali {

	void m4() {
		SampleProduct pd = new SampleProduct();
		ArrayList<Product> data =	pd.m();
		
		for (Product product : data) {
		if((product.getCompany()).startsWith("a")) {
			System.out.println(product.getpName());
		}
		}
	}
public static void main(String[] args) {
	Vaishali v = new Vaishali();
	v.m4();
}
}
