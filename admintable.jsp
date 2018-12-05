<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@page import="java.sql.*"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.net.ConnectException"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<h1><span class="yellow"> "ADMIN INFORMATION" </span>
</h1>
<h2>HERE YOU CAN FIND OTHER ADMIN INFORMATION</h2>
<head>
<link href="css/adminstyle2.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/admincirclebutton.css"/>

</head>
<body bgcolor="Aquamarine">
<table class="container">
<tr>
<th><h1>Admin Id</h1></th>
<th><h1>First Name</h1></th>
<th><h1>Last Name</h1></th>
<th><h1>Phno</h1></th>
<th><h1>Address</h1></th>
<th><h1>Gender</h1></th>
</tr>

<%
Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;

try{
Class.forName("com.mysql.jdbc.Driver");

	con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
	stmt=(Statement) con.createStatement();
	rs=stmt.executeQuery("select * from admin");
	System.out.print(" execute query");
	
	%>
	
	
	<%
	while(rs.next()){
		int aid=Integer.parseInt(rs.getString(1));
		String fname=rs.getString(3);
		String lname=rs.getString(4);
		String phno=rs.getString(5);
		String address=rs.getString(6);
		String gender=rs.getString(7);
		%>
		
		<tr>
		<td><%=aid %></td>
		<td><%=fname %></td>
		<td><%=lname %></td>
		<td><%=phno %></td>
		<td><%=address %></td>
		<td><%=gender %></td>
		</tr>
		
	<%}%>
	</table>
	<% 
	
}
catch(Exception e){
		System.out.print(e);
		
		}
		%>

</body>

<div id="ballMenuContainer">


<div id="menuBall3" class="menuBall">
	<a href="changepassword.jsp" class="ball greenball">
    <div class="menuText">
        Change Password
    </div>
  </a>
</div>

<div id="menuBall4" class="menuBall">
	<a href="menu.jsp" class="ball yellowball">
    <div class="menuText">
        SERVICES
    </div>
  </a>
</div>
</div>
</html>