<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

        <link rel="stylesheet" href="css/greendarkgreen.css">
          <link rel="stylesheet" href="css/admincirclebutton.css"/>
<title>Insert title here</title>
</head>
<script type="text/javascript">
function validform(){
var fn=document.myForm.fname.value;
var ln=document.myForm.lname.value;
var pn=document.myForm.phno.value;
var ad=document.myForm.address.value;
var gd=document.myForm.gender.value;
var id=document.myForm.acid.value;
var psw=document.myForm.password.value;
var cpsw=document.myForm.rpassword.value;
if(fn==null || fn=="" || fn.trim().length<1){
	alert("First name should not be blank!");
	return false;
}
else if(ln==null || ln=="" || ln.trim().length<1){
	alert("Last Name should not be blank!!!");
	return false;
}
else if(pn==""){
	alert("Phno should have numeric value");
	return false;
}
else if((pn.length)<8)
 {
	 alert("Phone number should have at least 8 number");
	 return false;
 }
else if(pn.charAt(0)!='0')
 {
 alert("Phone number should start with 0");
 return false;
 }



else if(ad==null || ad=="" || ad.trim().length<1){
	alert("Address should not be blank!!!");
	return false;
}
else if(gd==null || gd==""){
	alert("Gender should be male or female!");
	return false;
}
else if(id==null || id=="" || id.trim().length<1){
	alert("Account Id should not be blank!!!");
	return false;
}
else if(psw==null || psw=="" || psw.length<=6){
	alert("Password must be at least 6 characters!");
	return false;
}
else if(cpsw==null || cpsw=="" || cpsw.lenght<=6){
	alert("Confirm password must be at least 6 characters!");
	return false;
}

}
</script>
<body background="images/bg2.JPG" width="1000" height="1000">
<form action="signup" mehtod="post" name="myForm" onsubmit="return validform()">

<div class="form">
      
      <ul class="tab-group">
        <li class="tab active"><a href="#signup"></a></li>
        <li class="tab"><a href="#login"></a></li>
      </ul>
      
      <div class="tab-content">
        <div id="signup">   
          <h1>Sign Up for Free</h1>
          
          <form action="/" method="post">
          
          <div class="top-row">
            <div class="field-wrap">
              <label>
                <span class="req"></span>
              </label>
              <input type="text" placeholder="Your Account Name" name="acid" required autocomplete="off" />
            </div>
        
            <div class="field-wrap">
              <label>
               <span class="req"></span>
              </label>
              <input type="text" placeholder="First Name" name="fname" required autocomplete="off"/>
            </div>
          </div>

          <div class="field-wrap">
            <label>
              <span class="req"></span>
            </label>
            <input type="text" placeholder="Last Name" name="lname" required autocomplete="off"/>
          </div>
          
          
          
          <div class="field-wrap">
            <label>
             <span class="req"></span>
            </label>
            <input type="password" placeholder="Set A Password" name="password" required autocomplete="off"/>
          </div>
          
              <div class="field-wrap">
            <label>
              <span class="req"></span>
            </label>
            <input type="password" placeholder="Re-Type Password" name="rpassword" required autocomplete="off"/>
          </div>
          
          
           <div class="field-wrap">
            <label>
              <span class="req"></span>
            </label>
            <input type="text" placeholder="Ph-No.(09xxxxxxx)" name="phno" required autocomplete="off"/>
          </div>
          
            <div class="field-wrap">
            <label>
              <span class="req"></span>
            </label>
            <input type="text" placeholder="Address" name="address" required autocomplete="off"/>
          </div>
          
          
        <div class="field-wrap">
            <label>
              <span class="req"></span>
            </label>
            Gender
            <select name="gender">
           <option value="male">Male</option> 
             <option value="female">Female</option>  
            </select>
          </div>
          
         
          <button type="submit" class="button button-block"/>Create Account</button>
          
          </form>

        </div>
        
        <div id="login">   
         
          
          <form action="/" method="post">
          
     
          
          </form>

        </div>
        
      </div><!-- tab-content -->
      
</div> <!-- /form -->
</body>
 
</html>