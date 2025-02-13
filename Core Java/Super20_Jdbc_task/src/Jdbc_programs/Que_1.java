package Jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Que_1 {
void authors(int id,String username,String lastname,String email,String date) throws ClassNotFoundException, SQLException
{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","HareKrishna@!");
	
	//String query = "insert into authors Values(5,'john','Doc','john.doc@gmail.com','1980-01-01')";

	PreparedStatement st = con.prepareStatement("insert into authors (id,first_name,last_name,email,birthdate) Values (?,?,?,?,?)");
    
    st.setInt(1, id);
    st.setString(2, username);
    st.setString(3, lastname);
    st.setString(4, email);
    st.setString(5, date);
    int a = st.executeUpdate();
    System.out.println(a);

    
}
    

public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Que_1 qc= new Que_1();
	qc.authors(6, "anup", "chahande", "anupchahande@gmail.com","2001-07-12");
	
	
	
}






}

	
	
	