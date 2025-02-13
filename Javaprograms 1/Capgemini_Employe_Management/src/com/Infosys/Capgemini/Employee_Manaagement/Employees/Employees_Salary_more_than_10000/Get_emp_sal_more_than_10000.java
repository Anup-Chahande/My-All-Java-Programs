package com.Infosys.Capgemini.Employee_Manaagement.Employees.Employees_Salary_more_than_10000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import com.Infosys.Capgemini.Employee_Manaagement.Constants.Constants;
import com.Infosys.Capgemini.Employee_Manaagement.Employees.Employees_Salary_less_than_10000.Get_emp_less_10000_sal;

public class Get_emp_sal_more_than_10000 {
void get_more_10000_salary_emp() {
		
		try { Class.forName(Constants.DRIVER);}
		catch(ClassNotFoundException s) {
			System.out.println(Constants.CLASSNOTFOUND);
		}
		
		try {
	    Connection con =  DriverManager.getConnection(Constants.URL,Constants.ID,Constants.PASSWORD);
	   
	    PreparedStatement st = con.prepareStatement("INSERT INTO salary_more_than_10000 (ID,employee_id,Name,Profile ,Salary)SELECT * FROM  employee WHERE  Salary > 10000 ");                	 
	           int insrecord =st.executeUpdate();
		}
		catch(SQLSyntaxErrorException exp) {
			System.out.println(Constants.DBNOTFOUND);}
		catch(SQLException ex) {
			System.out.println(Constants.UNAMEPWDEXP);
		}
	 }             
		public static void main(String[] args) throws Exception {
			Get_emp_sal_more_than_10000 ss = new Get_emp_sal_more_than_10000();
			ss.get_more_10000_salary_emp();
	}




}
