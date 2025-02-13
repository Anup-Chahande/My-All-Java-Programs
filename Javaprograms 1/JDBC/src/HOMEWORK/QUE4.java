package HOMEWORK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QUE4 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capegemini","root","HareKrishna@!");
	String query = "Select AVG(experience)AS AVG_Experience FROM employee";
	Statement st = con.createStatement();
	             ResultSet rs = st.executeQuery(query);
	             while(rs.next()) {
	            		System.out.println(rs.getString("AVG_Experience"));
	            		
	            		}
	}
}
