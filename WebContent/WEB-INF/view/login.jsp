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
 <form:form action="userCenterController" modelAttribute="appUser" method="post">
 	user name: <form:input path="userName" />
 	<br>
 	password: <form:input path="password" />
 	<br>
 	<input type="submit" value="Go!" />
 	
 </form:form>
</body>
</html>