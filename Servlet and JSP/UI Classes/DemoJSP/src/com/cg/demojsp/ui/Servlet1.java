package com.cg.demojsp.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/Servlet1", "/page1.aspx" })
public class Servlet1 extends HttpServlet {

	PrintWriter out = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		out = response.getWriter();

		String serverName = request.getServerName();
		int portNum = request.getServerPort();
		String path = request.getServletPath();

		out.println("<html><head></head><body>");
		out.println("in get in Server1");
		out.println("server used:" + serverName);
		out.println("port Number is:" + portNum);
		out.println("path is:" + path);
		out.println("</body></html>");

		System.out.println("in sysout- in do get");
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
