<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome page</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
response.setHeader("Pragma","no-cache");
response.setHeader("Expires","0");
if(session.getAttribute("uname")==null)
{
	response.sendRedirect("login.jsp");
}
%>
Welcome ${uname}
<a href="videos.jsp" >Videos</a>
<form action="logout">
	<input type="submit" value="logout"/>
</form>
</body>
</html>