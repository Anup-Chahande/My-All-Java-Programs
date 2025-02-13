package com.java;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
   @Id
   int cid;
   String cname;
   String ownername;
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
public String getOwnername() {
	return ownername;
}
public void setOwnername(String ownername) {
	this.ownername = ownername;
}

public Car(int cid, String cname, String ownername) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.ownername = ownername;
}
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
   
}
