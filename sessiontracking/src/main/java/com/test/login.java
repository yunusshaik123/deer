package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("user");
		String pass=request.getParameter("pwd");
		Cookie ck=new Cookie("info",name);
		response.addCookie(ck);
		//HttpSession session=request.getSession();
		//session.setAttribute("info",name);
		pw.println("from Servlet 1:"+name);
		pw.println("<a href ='Servlet2>Next page</a>");

		
	}

}
