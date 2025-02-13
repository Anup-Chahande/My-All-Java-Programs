package com.java;

import javax.persistence.Id;

public class Accident {
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
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + ", ownername=" + ownername + "]";
	}
	public Accident(int cid, String cname, String ownername) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ownername = ownername;
	}
	public Accident() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
	}

