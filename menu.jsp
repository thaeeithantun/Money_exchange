<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=iso-8859-1" />
<title>Menu</title>
<link rel="stylesheet" href="style.css" type="text/css" media="screen" />

<script type="text/javascript">
    function show() {
    document.getElementById("loading").style.display="block";
    setTimeout("hide()", 1000);  // 5 seconds
    
}


function hide() {
    document.getElementById("loading").style.display="none";
}

function valid(){
	var uid1=document.MyForm.uid.value;
	var code1=document.MyForm.code.value;
		if(uid1==null || uid1==""){
		alert("Account ID can't be blank!");
		return false;
	}
	else if(code1==null || code1==""){
		alert("Password can't be blank!");
		return false;
	}
	else if(typeof code1==='string'){
		alert("gsrh");
		return false;
	}
	function isString(value){
		return typeof value==='string';
	}	

	
}

function validform(){
	var id1=document.MyForm.id.value;
	var amount1=document.MyForm.amount.value;
		if(id1==null || id1==""){
		alert("Account ID can't be blank!");
		return false;
	}
	else if(amount1==null || amount1==""){
		alert("Password can't be blank!");
		return false;
	}
	
	}



 </script>




</head>


<body bgcolor='#373837'>
<div id="container">
  <div id="body_image">&nbsp;</div>
  <div id="page_header">
    <h1><span>Menu</span></h1>
    <h3><span>Welcome Admin</span></h3>
    <div class="clearthis">&nbsp;</div>
  </div>
  <div id="page_menu">
    <ul>
      <li class="online"><a href="admintable.jsp"><span>Admin info</span></a><span></span></li>
      <li class="downloads"><a href="usertable.jsp"><span>user info</span></a><span></span></li>
      <li class="community"><a href=history.jsp><span>deposit</span></a><span></span></li>
      <li class="about"><a href="vdologin.jsp"><span>history</span></a><span></span></li>
    </ul>
  </div>
  <div id="page_forms">
    <div id="userlogin">
      <div id="userlogin_header">
        <h2><span>User </span></h2>
      </div>
      <form name="MyForm" action="test" method="post" onsubmit="return validform()">
        <div id="field_username" > <strong><span>Log :</span></strong>
          <input type="text" name="id"/>
        </div>
        <div id="field_password" > <strong><span>Password:</span></strong>
          <input type="text" name="amount"/>
        </div>
        <div id="button_enter">
          <input type="image" src="img/sitesearch_button.gif" alt="Enter"  class="button" />
        </div></div>
      </form>
       <div id="page_forms">
    <div id="userlogin">
      <div id="userlogin_header2">
        <h2><span>User </span></h2>
      </div>
      <form action="testjavawd" method="post" name="Myform" onsubmit="return valid()" >
        <div id="field_username" > <strong><span>Log :</span></strong>
          <input type="text" name="uid"/>
        </div>
        <div id="field_code" > <strong><span>Password:</span></strong>
          <input type="text" name="code"/>
        </div>
        <div id="button_enter">
          <input type="image" src="img/sitesearch_button.gif" alt="Enter"   class="button" />
        </div>
        <div class="clearthis">&nbsp;</div>
      </form>
 </div>
 

  
    </div>
  </div>
  
    <div id="content_body">
    <div id="reviews_box">
      <div id="reviews">
        <div class="content_header">
          <h2><span>Recent Reviews</span></h2>
        </div>
        <div class="content_entry">
          <div class="thumbnail"><img src="img/_image04.jpg" width="121" height="90" alt="Image Caption" /></div>
          <div class="entry_text">
            <p>The web application "Easy Money" offer the fastest cash transfer. It can available at over 40 towns in Myanmar with the lowest service charge.</p>
          </div>
          <div class="clearthis">&nbsp;</div>
        </div>
        <div class="content_entry">
          <div class="thumbnail"><img src="img/_image02.jpg" width="118" height="88" alt="Image Caption" /></div>
          <div class="entry_text">
            <p>You can enjoy a very convenient way of earning in "Easy Money",too.Hold in charge of an agent in "Easy Money" in your home or shop with a very sweet salary without any disturbance to your profession!</p>
          </div>
          <div class="clearthis">&nbsp;</div>
        </div>
      </div>
    </div>
    <div id="playnow_box">
      <div id="playnow">
        <div class="content_header">
          <h2><span>Play Now</span></h2>
        </div>
        <div class="content_entry">
          <div class="thumbnail"><img src="img/_image03.jpg" width="118" height="88" alt="Image Caption" /></div>
          <div class="entry_text">
                      <p>Contact the nearest agent and submit a CV form to work as an agent! If you cannot find that,email to <u>hnineiwinkyaw56@gmail.com</u>. Otherwise, call to hotline <u>+959798692413!</u> </p>
          </div>
          <div class="clearthis">&nbsp;</div>
        </div>
        <div class="content_entry">
          <div class="thumbnail"><img src="img/_image01.jpg" width="118" height="88" alt="Image Caption" /></div>
          <div class="entry_text">
           
            <p>Now, "Easy Money" is used in increasing number of clients! So, thanks a lot to our agents for delivering us to our clients! You can enjoy extra bonus and higher positions at the end of every year! Join us and make your opportunities! Warmly welcome our agents!</p>
          </div>
          <div class="clearthis">&nbsp;</div>
        </div>
    </div>
 </div>
  </div>
  <div id="clearthis_contentbody">&nbsp;</div>
   <center>   <div id="page_footer"> Copyright www.yoursite.com | designed by <u>4IS-A J2EE project group-8</u> </div></center>
  
</div>
 </body>
</html>
