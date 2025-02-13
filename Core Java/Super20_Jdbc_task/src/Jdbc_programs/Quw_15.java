package Jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Quw_15 {

void authors(String firstdate,String Seconddate) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","HareKrishna@!");
		

		PreparedStatement st = con.prepareStatement(" SELECT * FROM posts WHERE date BETWEEN ? AND ? ");
				
	    
	    st.setString(1, firstdate);
	    st.setString(2, Seconddate);

	  
	    
	    ResultSet a = st.executeQuery();
  while (a.next()) {
	  
  	System.out.println(a.getInt(1) + a.getInt(2) + a.getString(3) +a.getString(4) + a.getString(5) + a.getString(6));

	  
  }
  }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Quw_15 q5 = new Quw_15();
		q5.authors("2023-01-15"," 2023-03-10");
		
	}
	
}
