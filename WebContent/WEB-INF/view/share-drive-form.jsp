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
<h2>Share Drive:</h2>
 <form:form action="shareDriveController" modelAttribute="drive" method="GET">
 	<div>Select your start place:
 	<form:select path="startPlace">
 		 <form:option value="Gra" label="Grainger Library" />
 		 <form:option value="ArmoE" label="308 E Armory" />
 		 <form:option value="Union" label="Illi Union" />
 		 <form:option value="BookS" label="Bookstore" />
 		 <form:option value="CC" label="Campus Circle" />
 		 <form:option value="ECEB" label="ECE Building" />
 	</form:select>
 	</div>
 	
 	<div>Select your destination:
 	<form:select path="endPlace">
 		 <form:option value="Gra" label="Grainger Library" />
 		 <form:option value="ArmoE" label="308 E Armory" />
 		 <form:option value="Union" label="Illi Union" />
 		 <form:option value="BookS" label="Bookstore" />
 		 <form:option value="CC" label="Campus Circle" />
 		 <form:option value="ECEB" label="ECE Building" />
 	</form:select>
 	</div>
 	
 	Max number of passenger: <form:input type="number" path="passengerNumber" />
 	Start time: <form:input type="datetime-local" path="startTime" value="2017-11-30T20:00" />
 	Message to passengers: <form:input path="briefInfo" />
 	<input type="submit" value="Share Drive" />
 	
 </form:form>
</body>
</html>