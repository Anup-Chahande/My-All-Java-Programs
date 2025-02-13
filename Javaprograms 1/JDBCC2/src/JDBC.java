import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","HareKrishna@!");
Statement s = con.createStatement(); 
  ResultSet ss= s.executeQuery("select * from emp");

while(ss.next()) {
	
	System.out.println(ss.getInt(1)+" | "+ss.getString("name"));
	
	
}
}
}
