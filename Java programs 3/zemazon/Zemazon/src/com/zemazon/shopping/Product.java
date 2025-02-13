package com.zemazon.shopping;

public class Product {

	private int pid;
	private double price;
	private String pName;
	private String company;
	private String color;
	static private boolean isAvailable;

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

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", price=" + price + ", pName=" + pName + ", company=" + company + ", color="
				+ color + ", isAvailable=" + isAvailable + "]";
	}

	public Product(int pid, double price, String pName, String company, String color) {
		super();
		this.pid = pid;
		this.price = price;
		this.pName = pName;
		this.company = company;
		this.color = color;
		Product.isAvailable = true;
	}

}
