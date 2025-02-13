package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class CheckComparable {
	public static void main(String[] args) {

		Product p1 = new Product(1, "ac", 500000);
		Product p3 = new Product(3, "ztop", 100000);
		Product p4 = new Product(4, "piano", 1000);

		ArrayList<Product> al = new ArrayList<>();
		al.add(p1); // way 1
		al.add(new Product(2, "frige", 6545226)); // way 2
		al.add(p3);
		al.add(p4);
 
		Collections.sort(al);
		
		
		for (Product product : al) {

			System.out.println(product);
		}
	}
}
