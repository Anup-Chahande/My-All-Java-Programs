package Project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class emp {
@Id
	int id;
public emp(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
public emp() {
	super();
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
String name;
int age;
}
