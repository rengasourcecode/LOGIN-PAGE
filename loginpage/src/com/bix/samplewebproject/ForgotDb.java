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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ForgotDb
 */
@WebServlet("/ForgotDb")
public class ForgotDb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	Connection con;
    public ForgotDb() {
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
			
		    try {
		    	
		    	getConnection();
				
				String mailid=request.getParameter("fmail");
				long number=Long.parseLong(request.getParameter("fmob"));
				
				PreparedStatement st=con.prepareStatement("select password from gmail where maild=? and phonenumber=?");
				st.setString(1,mailid);
				st.setLong(2,number);
				ResultSet rs =st.executeQuery();
				String s=null;
				if(rs.next())
				{
				s=rs.getString(1);
				HttpSession session = request.getSession();
				session.setAttribute("PW",s);
				response.sendRedirect("pw.jsp");
				}
				else 
				{
					response.sendRedirect("InvalidLogin.jsp");

				}

			}
			 
		    
		    catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			
			
			
			
		} 
		

		
	}

