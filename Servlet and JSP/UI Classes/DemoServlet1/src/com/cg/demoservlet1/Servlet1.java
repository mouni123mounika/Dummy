package com.cg.demoservlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
 /**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PrintWriter out = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		out = response.getWriter();
		String n = request.getParameter("name").trim();
		String uname = request.getParameter("username").trim();
		String mob = request.getParameter("mobile").trim();// long mob=long.parseLong(mobile);
		String em = request.getParameter("email").trim();
		String gen = request.getParameter("rdgender");
		@SuppressWarnings("unused")
		String courseList[] = request.getParameterValues("course");

		request.setAttribute("name", n);
		request.setAttribute("username", uname);
		request.setAttribute("mobile", mob);
		request.setAttribute("email", em);
		request.setAttribute("rdgender", gen);

		RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
		rd.forward(request, response);
		/*
		 * out.println("<h1> Name :" +n+ "</h1>"); out.println("<h1> UserName :" +uname+
		 * "</h1>"); out.println("<h1> Email :" +em+ "</h1>");
		 * out.println("<h1> Mobile :" +mob+ "</h1>"); out.println("<h1> Gender :" +gen+
		 * "</h1>");
		 * 
		 * for(String string :courseList) { out.print(string+" , "); }
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
