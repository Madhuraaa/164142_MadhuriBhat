package com.madhuri.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username, password;
		PrintWriter out = response.getWriter();

		username = request.getParameter("username");
		password = request.getParameter("password");
		String userType = "Invalid";

		try {
			userType = getUserType(username, password);
			System.out.println(userType);
		} catch (InvalidUserException e) {
			out.print("<h1>Invalid User</h1>");
		}

		RequestDispatcher requestDispatcher = null;

		if (userType.equals("Admin")) {
			requestDispatcher = request.getRequestDispatcher("/admin");

		} else if (userType.equals("User")) {
			requestDispatcher = request.getRequestDispatcher("/user");
			out.print("<h1>Welcome User  " + username + "</h1>");
		} else {
			requestDispatcher = request.getRequestDispatcher("/invalid");
			out.print("<h1>Invalid User</h1>");
		}

		requestDispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private String getUserType(String username, String password) {
		IUserDAO dao=DAOUtility.getUserDAO();
		return dao.getUserType(username, password);
	}

}
