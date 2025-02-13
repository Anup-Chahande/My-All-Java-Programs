package emezon;

import java.util.ArrayList;

public class Vaishali {
void m5(){
	Final p1= new Final();
	ArrayList<Product> get =p1.m6();
	for(Product vl:get) {
		if(vl.getCompany().startsWith("a")) {
    if (vl.getPname()=="tie") {
System.out.println( vl.getPname() + "  "+ vl.getPrice() +"  50 % discount = "  + (vl.getPrice()-1000)   );
}			
	else {System.out.println(vl.getPname() + " " + vl.getPrice());}

		}
		
	}
	}
	

	
public static void main(String[] args) {
	Vaishali v = new Vaishali();
	v.m5();
}
}
