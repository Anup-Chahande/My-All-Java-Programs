package Project1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "students")
public class Car {
   @Id
	@Column (name = "sr")
   int cid;
public Car(int cid, String cname, String ccompany) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.ccompany = ccompany;
}
public Car() {
	super();
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
@Column (name = "name")

String cname;

@Column (name = "age")
String ccompany;
}
