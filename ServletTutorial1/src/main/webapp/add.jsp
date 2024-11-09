<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result page</title>
</head>
<body bgcolor="cyan">
<%
	int i = Integer.parseInt(request.getParameter("first_num"));
	int j = Integer.parseInt(request.getParameter("second_num"));
	int sum = i+j;
	out.println(sum);
%>
</body>
</html>