package Jdbcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ mavenjdbc","root","HareKrishna@!");
                       Statement st =   con.createStatement();
                       String Query = "Select age,name from emp where id = 1";
                   ResultSet rs =    st.executeQuery(Query);
                   
                   while(rs.next()) {
                	   System.out.println(rs.getString(1) +rs.getString(2));
                	   
                   }
	
	}
}
