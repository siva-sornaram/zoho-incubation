package com.siva;

import java.io.IOException;
import jakarta.servlet.*;
// import javax.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import com.siva.util.SecureUtil;


// @WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	
	private UserRegistrationdao userRegistrationDao = new UserRegistrationdao();   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String epass = request.getParameter("epass");
		String cpass = request.getParameter("cpass");
		
		User user = new User();
		
		if (epass.equals(cpass)) {
			user.setUsername(uname);
			user.setPassword(SecureUtil.encode(epass));
			
			userRegistrationDao.registerUser(user);
			
			request.setAttribute("Message", "User Has Been Registered Successfully");
			request.getRequestDispatcher("/Register.jsp").forward(request, response);
			
		} else {
			request.setAttribute("errorMessage", "Password Mismatch : Please re-enter the same passwords on both fields");
			request.getRequestDispatcher("/Register.jsp").forward(request, response);
		}
		
	}

}
