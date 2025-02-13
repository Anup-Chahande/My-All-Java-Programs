package com.Infosys.Capgemini.Employee_Manaagement.Employees.Employees_Profile_Developer.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import com.Infosys.Capgemini.Employee_Manaagement.Constants.Constants;
import com.Infosys.Capgemini.Employee_Manaagement.Tables.Employee_Table;

public class Get_Developers {
	void getdev() {
		
		
		try { Class.forName(Constants.DRIVER);}
		catch(ClassNotFoundException s) {
			System.out.println(Constants.CLASSNOTFOUND);
		}
		
		try {
	    Connection con =  DriverManager.getConnection(Constants.URL,Constants.ID,Constants.PASSWORD);
	   
	    PreparedStatement st = con.prepareStatement("INSERT INTO profile_developer (ID,employee_id,Name,Profile ,Salary)SELECT * FROM  employee WHERE PROFILE = 'Devloper' ");                	 
	           int insrecord =st.executeUpdate();
		}
		catch(SQLSyntaxErrorException exp) {
			System.out.println(Constants.DBNOTFOUND);}
		catch(SQLException ex) {
			System.out.println(Constants.UNAMEPWDEXP);
		}
	 }             
		public static void main(String[] args) throws Exception {
			Get_Developers ss = new Get_Developers();
			ss.getdev();
	}

}
