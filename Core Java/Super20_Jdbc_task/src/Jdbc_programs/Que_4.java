package Jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Que_4 {
void authors(int id) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","HareKrishna@!");
		
System.out.println("check1");
		PreparedStatement st = con.prepareStatement("delete from authors where id =?");
	    st.setInt(1, id);


	    
	    int a = st.executeUpdate();
	    System.out.println(a);
	    
    		
	    
	}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Que_4 q4 = new Que_4();
	q4.authors(6);
}
}
