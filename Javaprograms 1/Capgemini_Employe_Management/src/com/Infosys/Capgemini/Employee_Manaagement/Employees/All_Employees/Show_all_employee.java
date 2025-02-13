package com.Infosys.Capgemini.Employee_Manaagement.Employees.All_Employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import com.Infosys.Capgemini.Employee_Manaagement.Add_employees.TableStructure;
import com.Infosys.Capgemini.Employee_Manaagement.Constants.Constants;

public class Show_all_employee {
	void showemployee() {
		
		
		try { Class.forName(Constants.DRIVER);}
		catch(ClassNotFoundException s) {
			System.out.println(Constants.CLASSNOTFOUND);
		}
		
		try {
	    Connection con =  DriverManager.getConnection(Constants.URL,Constants.ID,Constants.PASSWORD);
	   
	    PreparedStatement st = con.prepareStatement("SELECT * FROM employee");                	 
	          ResultSet s =st.executeQuery();
	          System.out.println("ID |"+"EmployeeId |"+" name |"+"  Profile |" + "   Salary" );
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
			Show_all_employee ss = new Show_all_employee();
			ss.showemployee();
	}
}
