<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>Login: </h2>
<form action="searchDriveController" method="GET">
	<p>Select your destination:</p>
	<p><select name="endPlaceForm">
  <option value="Gra">Grainger Library</option>
  <option value="ArmoE">308 E Armory</option>
  <option value="Union">Illi Union</option>
  <option value="BookS" > Bookstore</option>
  <option value="CC">Campus Circle</option>
  <option value="ECEB" > ECE Building</option>
	</select>
	</p>
	
	<p>Select your current position:</p>
	<p><select name="startPlaceForm">
  <option value="Gra">Grainger Library</option>
  <option value="ArmoE">308 E Armory</option>
  <option value="Union">Illi Union</option>
  <option value="BookS" > Bookstore</option>
  <option value="CC">Campus Circle</option>
  <option value="ECEB" > ECE Building</option>
	</select>
	</p>
	
	 <p>Do you want the drive to be:
	<select name="timeLimitForm">
  <option value="0">Whenever</option>
  <option value="1">Before</option>
  <option value="2">After</option>
	</select>
	</p>
	 <p><input type="datetime-local" placeholder="Start time" required name="startTimeForm" value="2017-11-30T20:00"></p>
     
	<p><button type="submit">Search Drive</button></p>
</form>
</body>
</html>