<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Register</title>
</head>
<body>
<%@include file="Menu.jsp" %>
<h3>Product Register Page</h3>
<form action="save" method="POST">
<pre>
 ID  : <input type="text" name="prodId"/>
NAME : <input type="text" name="prodCode"/>
COST : <input type="text" name="prodCost"/>
	   <input type="submit" value="Create"/>
</pre>
</form>
${info }
</body>
</html>