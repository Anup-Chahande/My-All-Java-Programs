package com.Infosys.Capgemini.Employee_Manaagement.Employees.Employees_Profile_Support;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import com.Infosys.Capgemini.Employee_Manaagement.Constants.Constants;
import com.Infosys.Capgemini.Employee_Manaagement.Employees.Employees_Profile_Developer.copy.Get_Developers;

public class Get_Support {

void getsupport() {
			
		try { Class.forName(Constants.DRIVER);}
		catch(ClassNotFoundException s) {
			System.out.println(Constants.CLASSNOTFOUND);
		}
		
		try {
	    Connection con =  DriverManager.getConnection(Constants.URL,Constants.ID,Constants.PASSWORD);
	   
	    PreparedStatement st = con.prepareStatement("INSERT INTO profile_support (ID,employee_id,Name,Profile ,Salary)SELECT * FROM  employee WHERE PROFILE = 'Support' ");                	 
	           int insrecord =st.executeUpdate();
		}
		catch(SQLSyntaxErrorException exp) {
			System.out.println(Constants.DBNOTFOUND);}
		catch(SQLException ex) {
			System.out.println(Constants.UNAMEPWDEXP);
		}
	 }             
		public static void main(String[] args) throws Exception {
			Get_Support ss = new Get_Support();
			ss.getsupport();
	}


}
