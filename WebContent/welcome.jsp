<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="welcome.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

	<!-- Decalaration  -->

	<%! String uname = null; %>

	<!-- Scriplet -->

	<%
	
	
	/* Prevent the flow while logged out and logging in after clicking the back button by disabling the cache in browser */

		response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
		
	/* Validating the session of the user */

		if (session.getAttribute("uname") == null) {
			response.sendRedirect("login.jsp");
		} else {
			uname = session.getAttribute("uname").toString();
		}
	
	%>


	<h1> Hey <%= uname %> You have successfully logged in here !</h1><br><br><br>
	<form action = "Logout">
		<input type = "submit" value = "logout" id = "button">
	</form>
</body>
</html>