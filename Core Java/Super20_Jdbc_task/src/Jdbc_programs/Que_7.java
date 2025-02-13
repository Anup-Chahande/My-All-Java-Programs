package Jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Que_7 {

void authors(int id,String title,String discription) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","HareKrishna@!");
		

		PreparedStatement st = con.prepareStatement("update posts set title = ?,description= ? where id = ?");
	    
	    st.setInt(3, id);

	    st.setString(1, title);
	    st.setString(2, discription);
	    
	    int a = st.executeUpdate();
	    System.out.println(a);

	    
	}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Que_7 q7 = new Que_7();
	q7.authors(5, "Updated tile", "Updated Disciption");
}
	
}
