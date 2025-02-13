package com.anup;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

@WebServlet("/login")
public class LoginServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("im in init");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("iaminget");
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));

		String name = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/serverlet","root","HareKrishna@!");
			String Query = "Select username,password from login where username ='" + name + "' and password= '"+ password + "'";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(Query);
			System.err.println(Query);

			if (rs.next()) {

				ArrayList<String> al = new ArrayList<>();
				al.add("ram");
				al.add("kiran");
				RequestDispatcher rq = request.getRequestDispatcher("thankyou.jsp");
				request.setAttribute("data", al);
				rq.forward(request, response);

			}
			
			else

			{

				request.setAttribute("data", "invalid password");
				RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
				rq.forward(request, response);
			}

		} catch (Exception e) {

		}
		;

	}

	

	protected void dopost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("iaminpost");
	}

}
