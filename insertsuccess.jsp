<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String id=(String)session.getAttribute("id");
String fname=(String)session.getAttribute("fname");
String lname=(String)session.getAttribute("lname");
%>

<h2>Hey !!!!  <%=fname %>   <%=lname %> your ID is<%=id %></h2>

</body>
</html>