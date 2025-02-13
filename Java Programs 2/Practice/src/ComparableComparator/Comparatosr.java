package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparatosr implements Comparator<Product> {
	public static void main(String[] args) {
		Product p1 = new Product(1, "ac", 500);
		Product p3 = new Product(3, "Laptop", 100000);
		Product p4 = new Product(2, "piano", 1000);
		ArrayList<Product> al = new ArrayList<>();
		al.add(p1);
		al.add(p3);
		al.add(p4);

		Collections.sort(al);

		for (Product product : al) {
			System.out.println(product);
		}

	}

	@Override
	public int compare(Product o1, Product o2) {
		if (o1.price < o2.price) {
			return -1;
		}

		else if (o1.price > o2.price) {
			return 1;
		} else {
			return 0;
		}

	}
}
