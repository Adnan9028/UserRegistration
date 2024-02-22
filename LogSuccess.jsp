<%@page import="test.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
UserBean ub=(UserBean) application.getAttribute("uBean");
out.println("Welcome User : "+ub.getFname()+"<br>");
%>
<a href="view">ViewProfile</a><br>
<a href="edit">Edit profile</a><br>
<a href="logout">Logout</a>
</body>
</html>