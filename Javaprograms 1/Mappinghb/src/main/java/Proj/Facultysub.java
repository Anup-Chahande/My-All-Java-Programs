package Proj;

public class Facultysub {
	int subID;
	String subname;
	public Facultysub() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Facultysub [subID=" + subID + ", subname=" + subname + "]";
	}
	public Facultysub(int subID, String subname) {
		super();
		this.subID = subID;
		this.subname = subname;
	}
	public int getSubID() {
		return subID;
	}
	public void setSubID(int subID) {
		this.subID = subID;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	
	

}
