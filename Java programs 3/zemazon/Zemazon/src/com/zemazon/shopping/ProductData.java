package com.zemazon.shopping;

import java.util.ArrayList;

public class ProductData {

	ArrayList<Product> m1() {
		Product p1 = new Product(1, 1000, "tshirt", "arrow", "White");
		Product p2 = new Product(2, 1000, "pant", "zara", "Black");
		Product p3 = new Product(3, 4000, "cap", "hnl", "Black");
		Product p4 = new Product(4, 6000, "tie", "amu", "White");
		Product p5 = new Product(5, 8000, "shocks", "zemazon", "Blue");
		
		ArrayList<Product> pal = new ArrayList<>();
		pal.add(p1);
		pal.add(p2);
		pal.add(p3);
		pal.add(p4);
		pal.add(p5);
		
		ArrayList<Product> temp = new ArrayList<>();
		for (Product product : pal) {
			if(product.getPrice() > 5000) {
				temp.add(product);
			}
		}
		return temp;
	}
	
}
