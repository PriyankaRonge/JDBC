package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		  String password=request.getParameter("password");
		  System.out.println("name==" +uname);
		  System.out.println("name==" +password);
		   if(uname.equals("priya") && password.equals("priya")){
			   HttpSession session= request.getSession();
			   session.setAttribute("username", uname);
			   
			   response.sendRedirect("welcome.jsp");
			   System.out.println("name==" +uname);
			  
			   
		   }
		   else{
			   
			   response.sendRedirect("login.jsp");
		   }
			}
	}


