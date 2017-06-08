package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


import model.*;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String username=request.getParameter("uname");
		String password=request.getParameter("passwd");
		
		Login loginobj=new Login();
		loginobj.setLogin(username);
		loginobj.setPassword(password);
		
		try
		{
		
		
			
			
		if(loginobj.isValiduser())
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("success.jsp");
			dispatch.forward(request,response);
		}
		else
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("failure.jsp");
			dispatch.forward(request,response);
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}