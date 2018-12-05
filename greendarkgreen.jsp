<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

        <link rel="stylesheet" href="css/greendarkgreen.css">
<title>Insert title here</title>
</head>
<body background="image/bg.png">
<form>
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
            <input type="text" placeholder="Phone No." name="phno" required autocomplete="off"/>
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
            <input type="text"  name="gender" required autocomplete="off"/>
          </div>
          
          
          
          <button type="submit" class="button button-block"/>Create Account</button>
          
          </form>

        </div>
      
        
      </div><!-- tab-content -->
      
</div> <!-- /form -->
</form>
</body>
</html>