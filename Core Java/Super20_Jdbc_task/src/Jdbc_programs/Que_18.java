package Jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Que_18 {
	
	
void authors(int id,int author_id,String title,String discription,String content,String date) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","HareKrishna@!");
		

		PreparedStatement st = con.prepareStatement("insert into posts (id,author_id,title,description,content,date) Values (?,?,?,?,?,?)");
	    
	    st.setInt(1, id);
	    st.setInt(2, author_id);

	    st.setString(3, title);
	    st.setString(4, discription);
	    st.setString(5, content);
	    st.setString(6, date);
	    int a = st.executeUpdate();
	    System.out.println(a);

	    
	}
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Que_18 a1 = new Que_18();
	Que_18 a2 = new Que_18();
	Que_18 a3 = new Que_18();

	a1.authors(5, 3,"My first post", "This is discription of my post", "this is contentas", "2024-06-11");
	a2.authors(6, 3,"My second post", "This is discription of my Second post", "this is contentas 2", "2024-06-11");
	a3.authors(7, 3,"My Third post", "This is discription of my Third post", "this is contentas 3", "2024-07-11");


}

}