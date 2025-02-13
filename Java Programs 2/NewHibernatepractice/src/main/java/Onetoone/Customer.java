package Onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
  @Id
	int cusid;
	String name;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name) {
		super();
		this.cusid = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + cusid + ", name=" + name + "]";
	}
	public int getId() {
		return cusid;
	}
	public void setId(int id) {
		this.cusid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
