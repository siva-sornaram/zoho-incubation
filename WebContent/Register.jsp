<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Yourself</title>
</head>
<body>


	<form action = "UserRegistration" method = "post" id = "form1">
		Enter UserName : <input type = "text" name = "uname"><br><br>
		Enter Password : <input type = "password" name = "epass"><br><br>
		Confirm Password : <input type = "password" name = "cpass"><br><br>
		<input type = "submit" value = "Register" id = "button"><br><br>
		<div style="color:red">${errorMessage}</div><br><br>
		<div style="color:green">${Message}</div><br><br>
		<a href = "login.jsp">Click Here to get back to Login Page</a>
	</form>
	
	

</body>
</html>