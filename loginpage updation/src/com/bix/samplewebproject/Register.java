package com.bix.samplewebproject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	Connection con;
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void getConnection()
   	{
   		try {
   			Class.forName("oracle.jdbc.driver.OracleDriver");
   			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","rengaoracle","db1989");

   		} catch (Exception e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   		
   		
   	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		
		    
		     String user= request.getParameter("regusername").toLowerCase();
		     String pw= request.getParameter("regpassword");
		     String mob=request.getParameter("mobnumber");
		     getConnection();
		     PreparedStatement state = con.prepareStatement("select * from gmail where maild=?");
		     state.setString(1,user);
		     ResultSet rs=state.executeQuery();
		     if(rs.next())
		     {
		    	 response.sendRedirect("alreadyexist.jsp");
		     }
		     
		     else
		     {
		     
		     PreparedStatement state1 = con.prepareStatement("insert into gmail values (?,?,?)");
		 	 state1.setString(1, user);
			 state1.setString(2, pw);
			 state1.setString(3,mob);
			 state1.executeUpdate();
			 response.sendRedirect("dbupdate.jsp");
        	} 
		}
		   catch (Exception e)
		{
			
			e.printStackTrace();
		}   

	}

}
