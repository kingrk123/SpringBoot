<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<body>
<H3>Welcome to Emp Data Page</H3>
${list1}, ${map }
 <!-- for(String ob:list){ } -->
<c:forEach items="${list1}" var="ob">
	${ob} <br/>
</c:forEach>
<hr/>

<c:forEach items="${map}" var="ob">
	${ob.key} - ${ob.value } <br/>
</c:forEach>
</body>
</html>
