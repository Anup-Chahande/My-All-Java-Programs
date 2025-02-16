import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {

	@Id
	int id;
	String name;
	int price;

	public Products() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Products(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}
