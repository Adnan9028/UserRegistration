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
out.println("Page belong to the uder :"+fName+"<br>");

UserBean ub=(UserBean)	application.getAttribute("uBean");
%>

<form action="update" method="post">
	UseArddress :<input type="text" name="add" value="<%=ub.getAddress() %>"><br>
	UserMailId :<input type="text" name="mid"  value="<%=ub.getMailId() %>"><br>
	UserPhNo :<input type="number" name="phno" value="<%=ub.getPhNo()%>"><br>
	<input type="submit" value="UpdateProfile">
</form>
</body>
</html>