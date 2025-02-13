package Jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Que3 {
void authors(int id,String email) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","HareKrishna@!");
		
System.out.println("check1");
		PreparedStatement st = con.prepareStatement("update authors set email=? where id =?");
	    st.setString(1, email);
		st.setInt(2, id);


	    
	    int a = st.executeUpdate();
	    System.out.println(a);
	    
    		
	    
	}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Que3 qs = new Que3();
	qs.authors(5,"PeterParker@gmail.com");
}

}
