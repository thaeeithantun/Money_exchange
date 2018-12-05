<html>
<%@page import="java.sql.*"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.net.ConnectException"%>

<head><link href="css/greentabletrue.css" rel="stylesheet" type="text/css" />
  <link rel="stylesheet" href="css/admincirclebutton.css"/>
</head>
<section> <!--for demo wrap-->
<h1>User History</h1>  
<div  class="tbl-header">
<table cellpadding="0" cellspacing="0" border="0">
  <thead>
    <tr>
<th>Date</th>
<th>Account Id</th>
<th>Status</th>
<th>Amount</th>
<th>Other Id</th>

</tr>
        </thead>
</table>
</div>
<div  class="tbl-content">
<table cellpadding="0" cellspacing="0" border="0">
  <tbody>
    <%
Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;

try{
Class.forName("com.mysql.jdbc.Driver");
	System.out.print("driver loaded ");
	con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");
	System.out.print("connection started ");
	stmt=(Statement) con.createStatement();
	System.out.print("statement created ");
	rs=stmt.executeQuery("select * from history");
	System.out.print(" execute query");
	
	%>
	
	
	<%
	while(rs.next()){
		String date=rs.getString(1);
		String account=rs.getString(2);
		String status=rs.getString(3);
		double amount=Double.parseDouble(rs.getString(4));
		String otherid=rs.getString(5);
		%>
		
		<tr>
		<td><%=date %></td>
	    <td><%=account%></td>
	
		<td><%=status %></td>
		<td><%=amount%></td>
		<td><%=otherid%></td>
		
		</tr>

		
	<%}%>
	
	<% 
	
}
catch(Exception e){
		System.out.print(e);
		
		}
		%>

  </tbody>
</table>
</div>
</section>

<div id="ballMenuContainer">


<div id="menuBall1" class="menuBall">
  <a href="menu.jsp" class="ball blueball">
    <div class="menuText">
      SERVICES
    </div>
  </a>
</div>



</div>

</html>