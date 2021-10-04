package com.siva;

import java.io.IOException;

import jakarta.servlet.*;
// import javax.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


// @WebServlet("/Logout")
public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		Invalidating the session so that the user can be logged out
		
		HttpSession session = request.getSession();
		session.removeAttribute("uname");
		session.invalidate();
		response.sendRedirect("logout.jsp");
	}

}
