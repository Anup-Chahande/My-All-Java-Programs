package com.Infosys.Capgemini.Employee_Manaagement.Employees.Employees_Profile_Developer.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import com.Infosys.Capgemini.Employee_Manaagement.Constants.Constants;
import com.Infosys.Capgemini.Employee_Manaagement.Employees.All_Employees.Show_all_employee;

public class View_developers {
void showdev() {
		
		
		try { Class.forName(Constants.DRIVER);}
		catch(ClassNotFoundException s) {
			System.out.println(Constants.CLASSNOTFOUND);
		}
		
		try {
	    Connection con =  DriverManager.getConnection(Constants.URL,Constants.ID,Constants.PASSWORD);
	   
	    PreparedStatement st = con.prepareStatement("SELECT * FROM profile_developer");                	 
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
			View_developers ss = new View_developers();
			ss.showdev();
	}
}

