<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Center</title>
</head>
<body>
<h1>User Info</h1>
The user: ${appUser.userName} ${appUser.password}
<br>
id: ${appUser.id} email: ${appUser.email}
<br>
driveID: ${appUser.driveID} at ${appUser.eventTime}
<br>
<hr>
<br>

<c:if test="${!empty appUser.lockedAs && appUser.lockedAs != 0}">
	<h1>Drive Info</h1>
	Drive ID: ${drive.driveID} at ${drive.startTime}
	<br>
	veri: ${drive.verificationCode} and: ${drive.briefInfo}
	<br>
	from: ${drive.startPlace} to ${drive.endPlace}
	<br>
</c:if>

<a href="shareDriveController">Share a drive</a>
<a href="searchDriveController">Search a drive</a>

</body>
</html>