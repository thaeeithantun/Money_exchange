<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login/Logout animation concept</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=yes">
    
    
    <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Open+Sans'>

        <link rel="stylesheet" href="css/style.css">

    
    
    
  </head>
<script type="text/javascript">
function validform(){
var id=document.MyForm.acc.value;
var psw=document.MyForm.pass.value;
if(id==null || id==""){
	alert("Account ID can't be blank!");
	return false;
}
else if(psw==null || psw==""){
	alert("Password can't be blank!");
	return false;
}
}


</script>

  <body background="images/bg6.jpg">

 <div class="cont">
  <div class="demo">
    <div class="login"> 
      <%
         session=request.getSession();
      	 String sms=(String)session.getAttribute("msg");
      	 if(sms=="ccc"){ %>
      	 <font size=5 color="red"><pre>    Successful!!</pre><br><pre>    Please Login!</pre></font>
      	<% 
      	 }
      	 else{ %>
      	 <font size=5 color="red"><pre>         Welcome!</pre></font>
       	<% 
      		 
      	 }
      	 %>
      <div class="login__check"></div>
      <div class="login__form">
<form name="MyForm" action="MyLogin" method="post" onsubmit="return validform()">
         <div class="login__row">
           <svg class="login__icon name svg-icon" viewBox="0 0 20 20">
            <path d="M0,20 a10,8 0 0,1 20,0z M10,0 a4,4 0 0,1 0,8 a4,4 0 0,1 0,-8" />
          </svg>
           <input type="text" class="app_top__input name" name="acc" placeholder="Account ID"/>
         </div>
         <div class="login__row">
           <svg class="login__icon pass svg-icon" viewBox="0 0 20 20">
            <path d="M0,20 20,20 20,8 0,8z M10,13 10,16z M4,8 a6,8 0 0,1 12,0" />
          </svg>
           <input type="password" class="app_top__input name" name="pass" placeholder="Password"/>
         </div>
         <input type="submit" class="signup__submit" value="Log in"/>
</form>    
        <p class="login__signup"><a href="signup.jsp">Don't have an account?&nbsp;</a> <br>
       
      </div>
    </div>


  </div>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js/index.js"></script>

 
    
    
  </body>
</html>
