package HOMEWORK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Que1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capegemini","root","HareKrishna@!");
	String query = "ALTER TABLE employee ADD COLUMN branch_location varchar(20)";
	Statement st = con.createStatement();
	             int a = st.executeUpdate(query);


}}
