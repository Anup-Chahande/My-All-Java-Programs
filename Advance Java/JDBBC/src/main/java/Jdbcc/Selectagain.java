package Jdbcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Selectagain {

	void preparedst(int id, String name) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ newjdbc", "root", "HareKrishna@!");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String n = sc.next();
		PreparedStatement ps = con.prepareStatement("insert into authores Values (?,?);");
		ps.setInt(1, id);
		ps.setString(2, name);
		int s = ps.executeUpdate();

		System.out.println(s);

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Selectagain a = new Selectagain();
		a.preparedst(2, "Anonoyms");
	}
}