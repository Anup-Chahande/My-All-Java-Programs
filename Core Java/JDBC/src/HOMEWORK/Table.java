package HOMEWORK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Table {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capegemini","root","HareKrishna@!");
	
	String query = "create table employee (id INT,name varchar(20),profile varchar(20),email varchar(20),salary INT,age INT, experience INT)";
	Statement st = con.createStatement();
	             int a = st.executeUpdate(query);
	System.out.println(a);
	}
}
