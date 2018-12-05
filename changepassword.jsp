<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
    <%@page import="java.sql.Timestamp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
  
  <title>Flat HTML5/CSS3 Login Form</title>
    
  <link rel="stylesheet" href="css/admincirclebutton.css"/>
      <link rel="stylesheet" href="css/greenlogin.css">

    
  </head>

  <body>
<form action="adminMyChange" method="post">
   
 <div class="login-page">
 
 <div class="form">
   

 
   <form class="login-form">
   
<input type="text" name="aid" placeholder="Admin ID" required="required"/>
<input type="text" name="cpass" placeholder="Current Password" required="required"/>

<input type="text" name="npass" placeholder="New Password" required="required"/>
<input type="text" name="cnpass" placeholder="Confirm Password" required="required"/>

   
    <button>Change</button>
 
</form>
  </div>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  
      <script src="js/greenlogin.js"></script>
</form>
  </body>
  
  <div id="ballMenuContainer">


<div id="menuBall1" class="menuBall">
  <a href="admintable.jsp" class="ball blueball">
    <div class="menuText">
      ADMIN TABLE
    </div>
  </a>
</div>

</div>
  
</html>

