package HOMEWORK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTable {
public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capegemini","root","HareKrishna@!");
	
	String query = "insert into employee (id,name,profile,email,salary,age, experience) Values(1,'rani','dev','rani@gmail.com',11000,43,27),(2,'raj','test','raj@gmail.com',21000,33,17),(3,'radha','test','radha@gmail.com',26000,38,21),(4,'raj','dev','raj12@gmail.com',51000,32,12),(5,'john','dev','john@gmail.com',51000,39,27)";
	Statement st = con.createStatement();
	             int a = st.executeUpdate(query);
	System.out.println(a);
	
}

}
