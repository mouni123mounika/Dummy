package com.cg.multiserver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/Server1","*.do"})
public class Server1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	PrintWriter out = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		out = response.getWriter();
		String path = request.getServletPath();

		switch (path) {
		case "/add.do": {
			add();
		}
			break;
		case "/edit.do": {
			edit();
		}
			break;
		case "/delete.do":
			delete();
			break;
		case "/update.do":
			update();
			break;
		}
	}

	private void add() {
		
		out.println("in Add");
		
		System.out.println("Add");
	}

	private void edit() {
		out.println("<html><head></head><body>");
		out.println("in Edit");
		out.println("</body></html>");
		System.out.println("Edit");
	}

	private void delete() {
		out.println("<html><head></head><body>");
		out.println("in Delete");
		out.println("</body></html>");
		System.out.println("Delete");
	}

	private void update() {
		out.println("<html><head></head><body>");
		out.println("in Update");
		out.println("</body></html>");
		System.out.println("Update");
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
