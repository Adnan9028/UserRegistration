<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String fNAme=(String) request.getAttribute("fName");
	out.println("Page belongs to user :"+fNAme+"<br>");
	
	String msg=(String) request.getAttribute("msg");
	out.println(msg);	
	%>
	<a href="view">ViewProfile</a><br>
	<a href="edit">Edit profile</a><br>
	<a href="logout">Logout</a>
	
</body>
</html>