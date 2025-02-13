package com.Infosys.Capgemini.Employee_Manaagement.Employees.Employees_Salary_less_than_10000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import com.Infosys.Capgemini.Employee_Manaagement.Constants.Constants;
import com.Infosys.Capgemini.Employee_Manaagement.Employees.Employees_Profile_Tester.View_tester;

public class View_sal_less_10000_emp {
void viewemployee() {
		
		
		try { Class.forName(Constants.DRIVER);}
		catch(ClassNotFoundException s) {
			System.out.println(Constants.CLASSNOTFOUND);
		}
		
		try {
	    Connection con =  DriverManager.getConnection(Constants.URL,Constants.ID,Constants.PASSWORD);
	   
	    PreparedStatement st = con.prepareStatement("SELECT * FROM   salary_less_than_10000");                	 
	          ResultSet s =st.executeQuery();
	          System.out.println(Constants.COLOUMNS);
	          while(s.next()){
	        	  System.out.println(s.getString(1) +  " | "+ s.getString(2) + " | "+ s.getString(3)+" | "+ s.getString(4) + " | "+ s.getString(5));	  

	          }
	          
		}
		catch(SQLSyntaxErrorException exp) {
			System.out.println(Constants.DBNOTFOUND);}
		catch(SQLException ex) {
			System.out.println(Constants.UNAMEPWDEXP);
		}
	 }             
		public static void main(String[] args) throws Exception {
			View_sal_less_10000_emp ss = new View_sal_less_10000_emp();
			ss.viewemployee();
	}

}
