package Super20Spring.Super20Spring.quw2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	int productid;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", pname=" + pname + ", price=" + price + "]";
	}
	public Product(int productid, String pname, int price) {
		super();
		this.productid = productid;
		this.pname = pname;
		this.price = price;
	}
	public Product() {
		super();
	}
	String pname;
	int price;
	
}
