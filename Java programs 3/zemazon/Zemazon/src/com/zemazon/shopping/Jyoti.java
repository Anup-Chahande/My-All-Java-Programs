package com.zemazon.shopping;

import java.util.ArrayList;

public class Jyoti {

	ArrayList<Product> m2() {
		ProductData pd = new ProductData();
		ArrayList<Product> data =	pd.m1();
		
		ArrayList<Product> pp = new ArrayList<>();
		for (Product product : data) {
		if(product.getCompany() == "zemazon") {
			pp.add(product);
		}
		}
		return pp;
	}
	
	public static void main(String[] args) {
		Jyoti jj = new Jyoti();
		jj.m2();
	}
}
