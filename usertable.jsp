<html>
<%@page import="java.sql.*"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.net.ConnectException"%>

<head><link href="css/greentabletrue.css" rel="stylesheet" type="text/css" />
  <link rel="stylesheet" href="css/admincirclebutton.css"/>
</head>
<section> <!--for demo wrap-->
<h1>USER INFORMATION</h1>  
<div  class="tbl-header">
<table cellpadding="0" cellspacing="0" border="0">
  <thead>
    <tr>
<th>Account ID</th>
<th>First Name</th>
<th>Last Name</th>
<th>Phone number</th>
<th>Gender</th>
<th>Balance</th>
<th>Start Date</th>
<th>Address</th>
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
	rs=stmt.executeQuery("select * from user");
	System.out.print(" execute query");
	
	%>
	
	
	<%
	while(rs.next()){
		String aid=rs.getString(1);
		String fname=rs.getString(3);
		String lname=rs.getString(4);
		String phno=rs.getString(5);
		String gender=rs.getString(6);
		double balance=Double.parseDouble(rs.getString(7));
		String startdate=rs.getString(8);
		String address=rs.getString(9);
		%>
		
		<tr>
		<td><%=aid %></td>
	    <td><%=fname %></td>
		<td><%=lname %></td>
		<td><%=phno %></td>
		<td><%=gender %></td>
		<td><%=balance%></td>
		<td><%=startdate %></td>
		<td><%=address%></td>
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


<div id="menuBall4" class="menuBall">
	<a href="delete.jsp" class="ball yellowball">
    <div class="menuText">
        DELETE
    </div>
  </a>
</div>



<div id="menuBall3" class="menuBall">
	<a href="admin1.jsp" class="ball greenball">
    <div class="menuText">
       ADD
    </div>
  </a>
</div>



</div>

</html>