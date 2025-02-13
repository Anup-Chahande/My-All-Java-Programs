package emezon;

import java.util.ArrayList;

public class Jyoti {

	ArrayList<Product> m4(){
	ProductData d = new ProductData();
	ArrayList<Product> ans = d.m2();
	ArrayList<Product> temp= new ArrayList<>();
	
	for(Product zem:ans) {
    if(zem.getCompany()=="zemezon") {
	temp.add(zem);
	
	
}	
	}
	return temp;
}
}
