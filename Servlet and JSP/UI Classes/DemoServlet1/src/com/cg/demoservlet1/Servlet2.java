package com.cg.demoservlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	 
	private static final long serialVersionUID = 1L;
	 PrintWriter out=null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out=response.getWriter();
		String n=request.getParameter("name").trim();
		String uname=request.getParameter("username").trim();
		String mob=request.getParameter("mobile").trim();//long mob=long.parseLong(mobile);
		String em=request.getParameter("email").trim();
		String gen=request.getParameter("rdgender");
		String courseList[]=request.getParameterValues("course");
		
		out.println("<h1> Name :" +n+ "</h1>");
		out.println("<h1> UserName :" +uname+ "</h1>");
		out.println("<h1> Email :" +em+ "</h1>");
		out.println("<h1> Mobile :" +mob+ "</h1>");
		out.println("<h1> Gender :" +gen+ "</h1>");
		
		for(String string :courseList) {
			out.print(string+" , ");
		}
		response.getWriter().append("Served at :").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
