<%@page import="test.UserBean"%>
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
String fName=(String) request.getAttribute("fName");
out.println("Welcome User :" +fName+"<br>");
UserBean ub=(UserBean)	application.getAttribute("uBean");
out.println(ub.getUserName()+"&nbsp&nbsp&nbsp"+
		ub.getPassword()+"&nbsp&nbsp&nbsp"+
		ub.getFname()+"&nbsp&nbsp&nbsp"+
		ub.getLname()+"&nbsp&nbsp&nbsp"+
		ub.getAddress()+"&nbsp&nbsp&nbsp"+
		ub.getMailId()+"&nbsp&nbsp&nbsp"+
		ub.getPhNo()+"<br>"		
		);
%>
<a href="edit">Edit Profile</a><br>
<a href="logout">Logout</a>

</body>
</html>