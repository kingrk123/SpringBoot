<%@page isELIgnored="false" %>
<html>
<head>
<body>
<H3>Welcome to Emp Data Page</H3>
${eid }, ${ename },${esal }
<hr/>
<%
	Object ob=request.getAttribute("eid");
	out.println(ob); //DP
	int id=(Integer)ob;
	out.println(id+1); //DC + AU
%>
</body>
</html>