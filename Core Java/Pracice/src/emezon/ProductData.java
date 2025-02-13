package emezon;
import java.util.ArrayList;
public class ProductData {
	ArrayList<Product> m2() {
		Product p1 = new Product(1,1000,"Tshirt","Denis","white");
		Product p2 = new Product(2,2000,"tie","adws","yellow");
		Product p3 = new Product(3,5000,"socks","adss","green");
		Product p4 = new Product(4,7000,"belt","kl","cream");
		Product p5 = new Product(5,8000,"jeans","zemezon","blue");

		ArrayList<Product> al = new ArrayList<>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		
		
		ArrayList<Product> temp = new ArrayList<>();

		for(Product pal:al) {
			if(pal.getPrice()>5000 ) {
				temp.add(pal);

	}
		}
		return temp;

	
	
}
}
