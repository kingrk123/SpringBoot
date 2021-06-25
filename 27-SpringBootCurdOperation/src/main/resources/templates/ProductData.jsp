<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"
    %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products Data</title>
</head>
<body>
<%@include file="Menu.jsp" %>
<h3>PRODUCTS DATA PAGE</h3>
<table border="1">
	<tr>
		<th>ID</th>
		<th>CODE</th>
		<th>COST</th>
		<th>DISCOUNT</th>
		<th>GST</th>
		<th>OPERATION</th>
	</tr>
	<c:forEach items="${list}" var="ob">
		<tr>
			<td>${ob.prodId}</td>
			<td>${ob.prodCode}</td>
			<td>${ob.prodCost}</td>
			<td>${ob.prodDiscount}</td>
			<td>${ob.prodGst}</td>
			<td>
				<a href="delete?id=${ob.prodId}">DELETE</a> |
				<a href="edit?id=${ob.prodId}">EDIT</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>

