package Autotable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	public Employee(int id, String name, int age, String dep) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.dep = dep;
	}

	@Id
	int Id;
	String name;
	int age;
	String dep;

}
