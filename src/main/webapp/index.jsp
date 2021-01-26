<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action= "MyForm" method='POST'>
	<label> Enter Robot name:  <input type='text' name='robot-name' required></input></label>
	<label> Enter Robot weight: <input type='text' name='robot-weight' required></input></label>
	<label> Robot On Or Off: <input type='text' name='robot-power' required></input></label>
	<input type='submit' name='submit'>Get Details
    </form>
   
</body>
</html>