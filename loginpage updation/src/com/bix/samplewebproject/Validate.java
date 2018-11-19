package com.bix.samplewebproject;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	String passwordcheck;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		String uname= request.getParameter("username").toLowerCase();
		String pword= request.getParameter("password");
		//String unamelower=uname.toLowerCase();
		//String pwordlower=pword.toLowerCase();
		
		DbAccess db=new DbAccess();
	
		try {
			if(db.checkDetails(uname,pword))

			{
				HttpSession session = request.getSession();
				session.setAttribute("username",uname);
				response.sendRedirect("Welcome.jsp");
			}
			else 
			{
				response.sendRedirect("InvalidLogin.jsp");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		/*if(uname.equals("rengaofficial@gmail.com") && pword.equals("123renga"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username",uname);
			response.sendRedirect("Welcome.jsp");
		}
		else 
		{
			response.sendRedirect("InvalidLogin.jsp");

		}*/
	}

}
