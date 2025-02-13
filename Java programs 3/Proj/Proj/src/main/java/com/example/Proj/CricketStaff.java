package com.example.Proj;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class CricketStaff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int staffId;
String staffName;
String StaffDept;
String StaffAge;
String StaffNoOfYearToBCCI;
public CricketStaff(String staffName, String staffDept, String staffAge, String staffNoOfYearToBCCI) {
	super();
	this.staffName = staffName;
	StaffDept = staffDept;
	StaffAge = staffAge;
	StaffNoOfYearToBCCI = staffNoOfYearToBCCI;
}
public CricketStaff(int staffId, String staffName, String staffDept, String staffAge, String staffNoOfYearToBCCI) {
	super();
	this.staffId = staffId;
	this.staffName = staffName;
	StaffDept = staffDept;
	StaffAge = staffAge;
	StaffNoOfYearToBCCI = staffNoOfYearToBCCI;
}
@Override
public String toString() {
	return "CricketStaff [staffIf=" + staffId + ", staffName=" + staffName + ", StaffDept=" + StaffDept + ", StaffAge="
			+ StaffAge + ", StaffNoOfYearToBCCI=" + StaffNoOfYearToBCCI + "]";
}
public int getStaffIf() {
	return staffId;
}
public void setStaffIf(int staffIf) {
	this.staffId = staffIf;
}
public String getStaffName() {
	return staffName;
}
public void setStaffName(String staffName) {
	this.staffName = staffName;
}
public String getStaffDept() {
	return StaffDept;
}
public void setStaffDept(String staffDept) {
	StaffDept = staffDept;
}
public String getStaffAge() {
	return StaffAge;
}
public void setStaffAge(String staffAge) {
	StaffAge = staffAge;
}
public String getStaffNoOfYearToBCCI() {
	return StaffNoOfYearToBCCI;
}
public void setStaffNoOfYearToBCCI(String staffNoOfYearToBCCI) {
	StaffNoOfYearToBCCI = staffNoOfYearToBCCI;
}
public CricketStaff() {
	super();
}
	
}
