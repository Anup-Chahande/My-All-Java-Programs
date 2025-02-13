package Project1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
   @Id
	int cid;
public Car(int cid, String cname, String ccompany) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.ccompany = ccompany;
}
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "pojo_car [cid=" + cid + ", cname=" + cname + ", ccompany=" + ccompany + "]";
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCcompany() {
	return ccompany;
}
public void setCcompany(String ccompany) {
	this.ccompany = ccompany;
}
String cname;
String ccompany;
}
