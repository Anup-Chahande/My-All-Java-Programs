package emezon;

import java.util.ArrayList;

public class Final {
	ArrayList<Product> m6() {
	
		Product p1 = new Product(1,1000,"Tshirt","Denis","white");
		Product p2 = new Product(2,2000,"tie","anup","yellow");
		Product p3 = new Product(3,5000,"socks","amila","green");
		Product p4 = new Product(4,7000,"belt","kl","cream");
		Product p5 = new Product(5,8000,"jeans","zemezon","blue");

		ArrayList<Product> al2 = new ArrayList<>();
		al2.add(p1);
		al2.add(p2);
		al2.add(p3);
		al2.add(p4);
		al2.add(p5);
		return al2;


}
}
