package HOMEWORK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QUE14 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capegemini","root","HareKrishna@!");
	String query = ("select name from employee where experience = (select MIN(age) AND MAX(salary) from employee)");
	Statement st = con.createStatement();
	             ResultSet rs = st.executeQuery(query);
	             while(rs.next()) {
	            		System.out.println(rs.getInt(1));
	             
	             
	             }
	}
}
