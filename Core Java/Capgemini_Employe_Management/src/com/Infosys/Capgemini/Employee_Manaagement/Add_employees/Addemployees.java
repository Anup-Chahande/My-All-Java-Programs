package com.Infosys.Capgemini.Employee_Manaagement.Add_employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import com.Infosys.Capgemini.Employee_Manaagement.Constants.Constants;

public class Addemployees {

 void addemployee(int id,int eid,String name,String profile,int salary) throws Exception{
	try { Class.forName(Constants.DRIVER);}
	catch(ClassNotFoundException s) {
		System.out.println(Constants.CLASSNOTFOUND);
	}
	
	try {
    Connection con =  DriverManager.getConnection(Constants.URL,Constants.ID,Constants.PASSWORD);
    PreparedStatement st = con.prepareStatement("INSERT INTO employee VALUES (?,?,?,?,?)");                	 
           st.setInt(1, id);
           st.setInt(2, eid);
           st.setString(3, name);
           st.setNString(4, profile);
           st.setInt(5, salary);

    int insrecord =st.executeUpdate();
	}
	catch(SQLSyntaxErrorException exp) {
		System.out.println(Constants.DBNOTFOUND);}
	catch(SQLException ex) {
		System.out.println(Constants.UNAMEPWDEXP);
	}
 }             
	public static void main(String[] args) throws Exception {
		Addemployees ss = new Addemployees();
		ss.addemployee(23,12341,"Rahul2 Hinge","Sup2port",52500);
	}
	
}
