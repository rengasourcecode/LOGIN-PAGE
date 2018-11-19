package com.bix.samplewebproject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Updatepw
 */
@WebServlet("/Updatepw")
public class Updatepw extends HttpServlet {
	Connection con;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updatepw() {
        super();
    }
    public void getconnection()
    {
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","rengaoracle","db1989");

		} catch (Exception e) {
			e.printStackTrace();
		}

    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
	{
		String id=request.getParameter("pmail");
		String pw1=request.getParameter("p1");
		String pw2=request.getParameter("p2");
		if(pw1.equals(pw2))
		{
			getconnection();
			PreparedStatement st;
			try {
				st = con.prepareStatement("update gmail set password=? where maild=?");
				st.setString(1,pw1);
				st.setString(2,id);
				st.executeUpdate();
				response.sendRedirect("pwupdated.jsp");


				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			response.sendRedirect("pwincorrect.jsp");

		}
		
	}

}
