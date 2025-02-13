package Jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Que_2 {
	void authors(String email) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","HareKrishna@!");
		

		PreparedStatement st = con.prepareStatement("select * from authors  where email =?");
	    
	    st.setString(1, email);
	    ResultSet a = st.executeQuery();
	    
	    while(a.next()) {
		    System.out.println(a.getInt(1) + a.getString(2) + a.getString(3) + a.getString(3) + a.getString(4) + a.getString(5));
    		
    		}
	    
	}
	    

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Que_2 qs = new Que_2();
		qs.authors("amit.sharma@example.com");
		
	}

}
