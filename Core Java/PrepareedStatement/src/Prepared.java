import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Prepared {
	
	void SetValues(String v) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/preparedstatement","root","HareKrishna@!");
               PreparedStatement st = con.prepareStatement("Delete from hi where name = ? ");

               st.setString(1, v);

               
               int stt = st.executeUpdate();
	System.out.println(stt);
	
	}

	
	
	public static void main(String[] args) throws Exception {
		Prepared p = new Prepared();
		p.SetValues("hi");
	}
	
}