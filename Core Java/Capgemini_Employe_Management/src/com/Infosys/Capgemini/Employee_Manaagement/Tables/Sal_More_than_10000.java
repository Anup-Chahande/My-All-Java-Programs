package com.Infosys.Capgemini.Employee_Manaagement.Tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import com.Infosys.Capgemini.Employee_Manaagement.Constants.Constants;

public class Sal_More_than_10000 {
void createtablestructre() {
		
		
		try { Class.forName(Constants.DRIVER);}
		catch(ClassNotFoundException s) {
			System.out.println(Constants.CLASSNOTFOUND);
		}
		
		try {
	    Connection con =  DriverManager.getConnection(Constants.URL,Constants.ID,Constants.PASSWORD);
	   
	    PreparedStatement st = con.prepareStatement("Create TABLE Salary_more_than_10000 (ID INT PRIMARY KEY,employee_id INT UNIQUE KEY,Name varchar(20),Profile varchar(20),Salary INT)");                	 
	           int insrecord =st.executeUpdate();
		}
		catch(SQLSyntaxErrorException exp) {
			System.out.println(Constants.DBNOTFOUND);}
		catch(SQLException ex) {
			System.out.println(Constants.UNAMEPWDEXP);
		}
	 }             
		public static void main(String[] args) throws Exception {
			Sal_More_than_10000 ss = new Sal_More_than_10000();
			ss.createtablestructre();
	}}


