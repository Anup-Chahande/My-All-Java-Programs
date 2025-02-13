import java.util.Comparator;

public class Employeee1 implements Comparable<Employeee1>{
int eid;
String ename;
int salary;
@Override
public String toString() {
	return "Employeee1 [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
}
public Employeee1() {
	super();
}
public Employeee1(int eid, String ename, int salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public int compareTo(Employeee1 o) {
	if(this.salary>o.salary ) {
		   return 1;
		   
	   }
	   else if(this.salary<o.salary) {
		   return -1;
		   
		   
	   }
	   else {
		   return 0;
	   }	}
}


