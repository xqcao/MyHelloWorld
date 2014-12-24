package com.mywebapp.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyApp
 */
public class MyApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		//out.print("this message from server,hello, server start");
		String  firstName = request.getParameter("firstname").toString();
		
		request.setAttribute("firstname", firstName);
		
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
	}

}
