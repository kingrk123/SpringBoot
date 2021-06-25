<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Jsp App</title>
</head>
<body>
<h1 align="center">Welcome To SpringBoot JSP App</h1>
<%
	out.println(new Date());
	response.addHeader("Refresh", "1");
%>
</body>
</html>