<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Students Data Page</h3>
<table border="1">
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>GENDER</th>
		<th>PASSWORD</th>
		<th>COURSE</th>
		<th>ADDRESS</th>
		<th>LANGUAGES</th>
		<th>OPERATIONS</th>
	</tr>
	<c:forEach items="${list}" var="ob">
		<tr>
			<td>${ob.stdId} </td>
			<td>${ob.stdName} </td>
			<td>${ob.stdGen} </td>
			<td>${ob.stdPwd} </td>
			<td>${ob.stdCourse} </td>
			<td>${ob.stdAddr} </td>
			<td>${ob.stdLangs} </td>
			<td>
				<a href="delete?id=${ob.stdId}">DELETE</a> |
				<a href="edit?id=${ob.stdId}">EDIT</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
