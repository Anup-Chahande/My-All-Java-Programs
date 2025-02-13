package IPL;

public class Player {
private String Name;
private int age;
private int jno;
private String Profession;

Player(String Name,int age,int jno,String Profession){
	
	this.Name=Name;
	this.age=age;
	this.jno=jno;
	this.Profession=Profession;
	
}




public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getJno() {
	return jno;
}
public void setJno(int jno) {
	this.jno = jno;
}
public String getProfession() {
	return Profession;
}
public void setProfession(String profession) {
	Profession = profession;
}
@Override
public String toString() {
	return "Players [Name=" + Name + ", age=" + age + ", jno=" + jno + ", Profession=" + Profession + "]";
}

	
	
	
}
