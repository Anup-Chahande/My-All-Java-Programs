package com.Infosys.Capgemini.Employee_Manaagement.Employees.Employees_Salary_less_than_10000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import com.Infosys.Capgemini.Employee_Manaagement.Constants.Constants;
import com.Infosys.Capgemini.Employee_Manaagement.Employees.Employees_Profile_Tester.Get_tester;

public class Get_emp_less_10000_sal {
void get_less_10000_salary_emp() {
		
		try { Class.forName(Constants.DRIVER);}
		catch(ClassNotFoundException s) {
			System.out.println(Constants.CLASSNOTFOUND);
		}
		
		try {
	    Connection con =  DriverManager.getConnection(Constants.URL,Constants.ID,Constants.PASSWORD);
	   
	    PreparedStatement st = con.prepareStatement("INSERT INTO salary_less_than_10000 (ID,employee_id,Name,Profile ,Salary)SELECT * FROM  employee WHERE  Salary < 10000 ");                	 
	           int insrecord =st.executeUpdate();
		}
		catch(SQLSyntaxErrorException exp) {
			System.out.println(Constants.DBNOTFOUND);}
		catch(SQLException ex) {
			System.out.println(Constants.UNAMEPWDEXP);
		}
	 }             
		public static void main(String[] args) throws Exception {
			Get_emp_less_10000_sal ss = new Get_emp_less_10000_sal();
			ss.get_less_10000_salary_emp();
	}



}
