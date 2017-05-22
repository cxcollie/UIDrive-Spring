<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to login!</h1>
 <h2>Register: </h2>
 <form:form action="registerController" modelAttribute="appUser" method="post">
 	user name: <form:input path="userName" />
 	<br>
 	password: <form:input path="password" />
 	<br>
 	email: <form:input path="email" />
 	<br>
 	<input type="submit" value="Register" />
 	
 </form:form>
 
<br>
<hr>
<br>

 <h2>Login: </h2>
<form action="loginController" method="POST">
	<input type="text" name="loginUserName"
		placeholder="what's your name?" />
	<br>
	<input type="text" name="loginPassword"
		placeholder="what's your password?" />
	<br>
	<input type="submit" value="Login" />
</form>

</body>
</html>