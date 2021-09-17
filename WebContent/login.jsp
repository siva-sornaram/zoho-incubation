<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="login.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Please Login</title>
</head>
<body>

	<form action = "Login" method = "post" id = "form1">
		Enter UserName : <input type = "text" name = "uname"><br><br>
		Enter Password : <input type = "password" name = "pass"><br><br>
		<input type = "submit" value = "Login" id = "button"><br><br>
		<a href = "Register.jsp">Click Here to Register Yourself</a>
		<div style="color:red">${errorMessage}</div>
	</form>
	
	

</body>
</html>