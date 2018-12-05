<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" href="css/circlebutton.css">
<%
session=request.getSession();
String id=(String)session.getAttribute("acid");
String password=(String)session.getAttribute("pass");
HttpSession session2=request.getSession();
session2.setAttribute("id1",id);
session2.setAttribute("password1",password);
%>
<style>
#main{
	background:#F4A460;
}
#sidebar{
	background:#F4A460;
}
#heade1
{
width:625x;
height:80px;
background:url(images/deposit1.png) 20px 10px no-repeat;
padding-left:90px;
margin: 0 0 0 20px;
}
#heade1 h2
{
font:bold 20px/18px Arial, Helvetica, sans-serif;
padding:30px 0 0 20px;
}
</style>
    </head>
    <body>
  <div id="header">
	 <h1><font color="darkblue">Easy Money System</font><span class="style1"></span></h1>
     <h2><font color="darkblue">ExtraOrdinary Service</font></h2>	
    
     
  
     <div id="ballMenuContainer">
     <div id="menuBall2" class="menuBall">
         <a href="home.jsp" class="ball redball">
          <div class="menuText">HOME</div>
         </a>
     </div>
     
     <div id="menuBall1" class="menuBall">
         <a href="MyBalance" class="ball blueball">
          <div class="menuText">BALANCE</div>
         </a>
     </div>

     <div id="menuBall3" class="menuBall">
	    <a href="userwithdraw.jsp" class="ball greenball">
          <div class="menuText">WITHDRAW</div>
        </a>
     </div>

     <div id="menuBall4" class="menuBall">
	   <a href="transfer.jsp" class="ball yellowball">
          <div class="menuText">TRANSFER</div>
      </a>
     </div>

     <div id="menuBall1" class="menuBall">
      <a href="changepass.jsp" class="ball blueball">
         <div class="menuText">CHANGE PASS</div>
     </a>
    </div>
    
    <div id="menuBall2" class="menuBall">
	     <a href="userHistory.jsp" class="ball redball">
           <div class="menuText">HISTORY</div>
        </a>
    </div>

    <div id="menuBall3" class="menuBall">
	    <a href="aboutus.jsp" class="ball greenball">
          <div class="menuText">ABOUT US</div>
        </a>
    </div>

    <div id="menuBall4" class="menuBall">
	   <a href="contactus.jsp" class="ball yellowball">
          <div class="menuText">CONTACT US</div>
      </a>
    </div>
    
    <div id="menuBall1" class="menuBall">
      <a href="vdoswitch.jsp" class="ball blueball">
         <div class="menuText">LOGOUT</div>
     </a>
    </div>
    
   </div>
  </div>

 <div id="main">
    <div id="heade1"><h2>Deposit:</h2></div>
    <p>Lorem ipsum dolor sit amet.</p>
  </div>
  <div id="sidebar">
    <h2>Photo</h2>
    <p>Lorem ipsum dolor sit amet.</p>
  </div>
	</body>
</html>