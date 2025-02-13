package HOMEWORK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QUE9 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capegemini","root","HareKrishna@!");
	String query = ("update employee set profile = 'support' where name = 'radha'");
	Statement st = con.createStatement();
    int a = st.executeUpdate(query);

	            		}
	             
	
	}

