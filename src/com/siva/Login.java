package com.siva;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.siva.util.*;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		
//		Changing the password to the encoded value so that it can be compared with the encrypted value in database
		pass = SecureUtil.encode(pass);
		
		
//		Verifying the username and password and initializing a session
		
		if (Logindao.validate(uname, pass)) {
			
			
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			
			
			response.sendRedirect("welcome.jsp");
			
			
		} else {
			request.setAttribute("errorMessage", "Invalid user or password");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		
	}


}
