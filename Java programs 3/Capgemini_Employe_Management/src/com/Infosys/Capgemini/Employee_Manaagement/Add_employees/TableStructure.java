package com.Infosys.Capgemini.Employee_Manaagement.Add_employees;

import java.sql.Connection;
import com.Infosys.Capgemini.Employee_Manaagement.Constants.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

public class TableStructure {
	void createtablestructre() {
	
	
	try { Class.forName(Constants.DRIVER);}
	catch(ClassNotFoundException s) {
		System.out.println(Constants.CLASSNOTFOUND);
	}
	
	try {
    Connection con =  DriverManager.getConnection(Constants.URL,Constants.ID,Constants.PASSWORD);
   
    PreparedStatement st = con.prepareStatement("Create TABLE employee (ID INT PRIMARY KEY,employee_id INT UNIQUE KEY,Name varchar(20),Profile varchar(20),Salary INT)");                	 
           int insrecord =st.executeUpdate();
	}
	catch(SQLSyntaxErrorException exp) {
		System.out.println(Constants.DBNOTFOUND);}
	catch(SQLException ex) {
		System.out.println(Constants.UNAMEPWDEXP);
	}
 }             
	public static void main(String[] args) throws Exception {
		TableStructure ss = new TableStructure();
		ss.createtablestructre();
}}
