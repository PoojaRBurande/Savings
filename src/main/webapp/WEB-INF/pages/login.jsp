<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<div color=red>
	${invalid}
</div>
<form action="validateLogin" method="post">
Enter Name<input type="text" name="inputName" id="inputName">
Enter Password<input type="password" name="password" id="password">
<input type="submit">
</form>
</body>
</html>