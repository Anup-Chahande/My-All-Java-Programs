package emezon;

public class Product {
  private int pid;
  private double price;
  private String Pname;
  private String Company;
  private String color;
  private boolean isavailable;

  Product(int pid,double price,String Pname,String Company, String color){
	  this.pid=pid;
	 this.price=price;
	 this.Pname=Pname;
	 this.Company=Company;
	 this.color=color;
	 this.isavailable=true;
	 
	  
	  
	  
  }
  
  
  
  @Override
public String toString() {
	return "Product [pid=" + pid + ", price=" + price + ", Pname=" + Pname + ", Company=" + Company + ", color=" + color
			+ "]";
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getPname() {
	return Pname;
}
public void setPname(String pname) {
	Pname = pname;
}
public String getCompany() {
	return Company;
}
public void setCompany(String company) {
	Company = company;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public boolean isIsavailable() {
	return isavailable;
}
public void setIsavailable(boolean isavailable) {
	this.isavailable = isavailable;
	
}
  
}
