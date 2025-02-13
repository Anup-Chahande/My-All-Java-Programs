package Jdbc_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Que5 {

	void authors(int id,int author_id,String title,String discription,String content,String date) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_super20","root","HareKrishna@!");
		
		//String query = "insert into authors Values(5,'john','Doc','john.doc@gmail.com','1980-01-01')";

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
	Que5 q5 = new Que5();
	q5.authors(5, 3,"My first post", "This is discription of my post", "this is contentas", "2024-06-11");
}

}