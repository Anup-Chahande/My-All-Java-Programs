package AllMaping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	int employeeid;
	String name;

	@OneToMany(cascade = CascadeType.ALL)
	List<Address> aid;

	public Employee() {
		super();
	}

	public Employee(int employeeid, String name) {
		super();
		this.employeeid = employeeid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", aid=" + aid + "]";
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAid() {
		return aid;
	}

	public void setAid(List<Address> aid) {
		this.aid = aid;
	}
}
