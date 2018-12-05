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

function validform1(){
	var fn=document.myForm.fname.value;
	var ln=document.myForm.lname.value;
	var pn=document.myForm.phno.value;
	var ad=document.myForm.address.value;
	var gd=document.myForm.gender.value;
	var id=document.myForm.accid.value;
	var psw=document.myForm.pass.value;
	var cpsw=document.myForm.cpass.value;
	if(fn==null || fn=="" || fn.length<1){
		alert("First name can't be blank!");
		return false;
	}
	else if(ln==null || ln=="" || ln==" " || ln.length<1){
		alert("Last name can't be blank!");
		return false;
	}
	else if(pn==null || pn=="" || pn==" " || pn.length<1){
		alert("Phone number can't be blank!");
		return false;
	}
	else if(ad==null || ad=="" || ad==" " || ad.length<1){
		alert("Address can't be blank!");
		return false;
	}
	else if(gd==null || gd=="" || gd==" " || gd.length<1){
		alert("Gender can't be blank!");
		return false;
	}
	/*else if(!gd.equalsIgnoreCase("male") || !gd.equalsIgnoreCase("female")){
		alert("Gender should be male or female!");
		return false;
	}*/
	else if(id==null || id=="" || id==" " || id.length<1){
		alert("Account ID can't be blank!");
		return false;
	}
	else if(psw==null || psw=="" || psw==" " || psw.length<6){
		alert("Password can't be blank and must be at least 6 character!");
		return false;
	}
	else if(cpsw==null || cpsw=="" || cpsw==" " || cpsw.length<6){
		alert("Confirm password can't be blank and must be at least 6 character!");
		return false;
	}
	}
</script>

  <body>

 <div class="cont">
  <div class="demo">
    <div class="login"> 
    <%
         session=request.getSession();
      	 String sms=(String)session.getAttribute("msg");
      	 if(sms=="aaa"){ %>
      	 <font size=5 color="red"><pre>    ID Already Exit!</pre><br><pre>    Try Another!</pre></font>
      	<% 
      	 }
      	 else if(sms=="bbb"){ %>
      	 <font size=5 color="red"><pre>    Passwords Not Match!</pre><br><pre>    Try Another!</pre></font>
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
         <input type="submit" class="signup__submit" value="Log in"/><br>
</form>    
        <p class="login__signup">Don't have an account? &nbsp;<br>
        <button class="login__submit">Sign up</button></p>
      </div>
    </div>

<form name="myForm" action="MySignup" method="post" onsubmit="return validform1()">
    <div class="app">
      <div class="app__top">
        <p class="app__hello">Sign Up!</p>
        <div class="app_top__form">
         <div class="app_top__row">
           <input type="text" class="app_top__input name" name="fname" placeholder="First Name"/>
         </div>
         <div class="app_top__row">
           <input type="text" class="app_top__input name" name="lname" placeholder="Last Name"/>
         </div>
         <div class="app_top__row">
           <input type="text" class="app_top__input name" name="phno" placeholder="Phone No"/>
         </div>
         <div class="app_top__row">
           <input type="text" class="app_top__input name" name="address" placeholder="Address"/>
         </div>
         <div class="app_top__row">
           <input type="text" class="app_top__input name" name="gender" placeholder="Gender"/>
         </div>
         <div class="app_top__row">
           <input type="text" class="app_top__input name" name="accid" placeholder="Account ID"/>
         </div>
         <div class="app_top__row">
           <input type="text" class="app_top__input name" name="pass" placeholder="Password"/>
         </div>
         <div class="app_top__row">
           <input type="text" class="app_top__input name" name="cpass" placeholder="Confirm Password"/>
         </div>
         
           <<input type="submit" class="signup__submit" value="Sign up"/>
         
         
        </div>
    </div>
      <div class="app__logout">
        <svg class="app__logout-icon svg-icon" viewBox="0 0 20 20">
          <path d="M6,3 a8,8 0 1,0 8,0 M10,0 10,12"/>
        </svg>
      </div>
    </div>
</form>
  </div>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js/index.js"></script>

 
    
    
  </body>
</html>
