package Jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Que_10 {
void authors(String string) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","HareKrishna@!");
		

		PreparedStatement st = con.prepareStatement("select count(?) from posts");
				
	    
	    st.setString(1, string);
	  

	    ResultSet a = st.executeQuery();
while(a.next()) {
	
    System.out.println(a.getString(1));

	
}
	    
	}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Que_10 q10 = new Que_10();
	q10.authors("author_id");
}
}
