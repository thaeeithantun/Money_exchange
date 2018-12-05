<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.*"%>
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
System.out.print("pass Change arrive");
System.out.print(id);
 String npass=(String)session.getAttribute("npass");
	System.out.print(npass);

 try{
 	
 	Connection con =null;
 	ResultSet rs=null;
 	Class.forName("com.mysql.jdbc.Driver");
 	con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","root");


     String query="update admin set password='"+npass+"' where aid ='"+ id +"' ";
 PreparedStatement s=(PreparedStatement)con.prepareStatement(query);

  s.executeUpdate();
  JOptionPane.showMessageDialog(null, "Password Changed Successfully");
  response.sendRedirect("admintable.jsp");


 	
 }	
 
 catch (Exception e) {
 		e.printStackTrace();
 	}

%>
</body>
</html>