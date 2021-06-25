<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Edit</title>
</head>
<body>
<%@include file="Menu.jsp" %>
<h3>Product Edit Page</h3>
<form action="update" method="POST">
<pre>
 ID  : <input type="text" name="prodId" value="${pob.prodId}" readonly="readonly"/>
NAME : <input type="text" name="prodCode" value="${pob.prodCode}"/>
COST : <input type="text" name="prodCost" value="${pob.prodCost}"/>
	   <input type="submit" value="Update"/>
</pre>
</form>
</body>
</html>
