package ArrayListobj;

public class Students {
	String name;
	int age;
	String Branch;

	public Students() {
		super();
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + ", Branch=" + Branch + "]";
	}

	public Students(String name, int age, String branch) {
		super();
		this.name = name;
		this.age = age;
		Branch = branch;
	}

}
