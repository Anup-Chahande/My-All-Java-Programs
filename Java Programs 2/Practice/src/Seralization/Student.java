package Seralization;

import java.io.Serializable;

public class Student implements Serializable{

	int id;
	String name;
	int age;

	public Student() {
		super();
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
