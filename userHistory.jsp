<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@page import="java.sql.*"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.net.ConnectException"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%
String id=(String)session.getAttribute("acid");
String password=(String)session.getAttribute("pass");
%>
<h1><span class="blue"></span><font color="yellow">Transaction history for <%= id%></font><span class="blue"></span>
</h1>
<head>
<link href="css/style2.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/circlebutton.css"/>

</head>
<body bgcolor="silver">
<table class="container">
<tr>
<th></th>
<th><h1>date</h1></th>
<th><h1>Status</h1></th>
<th><h1>Amount</h1></th>
<th><h1>Other Account Id</h1></th>
<th><h1>Check</h1></th>
</tr>

<%
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;

try{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
	stmt=(Statement) con.createStatement();
	rs=stmt.executeQuery("select * from history where acid='"+id+"'");
	int i=1;
	%>
	
	
	<%
	while(rs.next()){
		Timestamp ts=rs.getTimestamp(1);
		String accId=rs.getString(2);
		String stat=rs.getString(3);
		double amt=rs.getDouble(4);
		String othId=rs.getString(5);
		boolean flag=rs.getBoolean(7);
		String check=null;
		if(stat.equals("withdraw")){
			if(flag==true){
				check="whithdrawed";
			}
			else{
				check="not yet";
			}
		}
		else{
			check="";
		}
		%>
		
		<tr>
		<td><%= i %></td>
		<td><%= ts %></td>
		<td><%= stat %></td>
		<td><%= amt %></td>
		<td><%= othId %></td>
		<td><%= check%></td>
		</tr>
		
	<% i=i+1; }%>
	</table>
	<% 
	
}
catch(Exception e){
		System.out.print(e);
		
		}
		%>

</body>

<div id="ballMenuContainer">


<div id="menuBall4" class="menuBall">
	<a href="home.jsp" class="ball yellowball">
    <div class="menuText">
        HOME
    </div>
  </a>
</div>

</div>
</html>