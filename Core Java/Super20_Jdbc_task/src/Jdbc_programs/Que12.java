package Jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Que12 {
	
void authors() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","HareKrishna@!");
		

		PreparedStatement st = con.prepareStatement(" select * from authors Order by last_name");
				
	    

	  
	    
	    ResultSet a = st.executeQuery();
  while (a.next()) {
	  
	    System.out.println(a.getInt(1) + a.getString(2) + a.getString(3) + a.getString(3) + a.getString(4) + a.getString(5));

	  
  }
}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Que12 q12 = new Que12();
	q12.authors();
}

}
