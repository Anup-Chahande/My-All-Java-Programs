package com.anup.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Students {
	@Id
	int rollno;
	String name;
	int age;
	char Section;

	public Students() {

	}

	public Students(int rollno, String name, int age, char section) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		Section = section;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSection() {
		return Section;
	}

	public void setSection(char section) {
		Section = section;
	}

	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", age=" + age + ", Section=" + Section + "]";
	}
	

}
