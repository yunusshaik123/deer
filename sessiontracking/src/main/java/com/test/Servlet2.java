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

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("user");
		String pass=request.getParameter("pwd");
		Cookie[] ck=request.getCookies();
		pw.println("from Servlet2:"+ck[0].getValue());
		//HttpSession session=request.getSession();
		//String user=(String)session.getAttribute("info");
		pw.println("from Servlet2 :" +pass);
		
		
		
		
			}

}
