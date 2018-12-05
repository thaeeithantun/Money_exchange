<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" href="css/circlebutton.css">
<style>
#main{
	background:#F08080;
}
#sidebar{
	background:#F08080;
}
#heade1
{
width:625x;
height:60px;
background:url(images/money.png) 20px 10px no-repeat;
padding-left:90px;
margin: 0 0 0 20px;
}
#heade1 h2
{
font:bold 20px/18px Arial, Helvetica, sans-serif;
padding:30px 0 0 0;
}
</style>
</head>
    <body>
  <div id="header">
	 <h1><font color="darkblue">Easy Money System</font><span class="style1"></span></h1>
     <h2><font color="darkblue">ExtraOrdinary Service</font></h2>	
    
    
     <div id="ballMenuContainer">
     <div id="menuBall1" class="menuBall">
         <a href="home.jsp" class="ball blueball">
          <div class="menuText">HOME</div>
         </a>
     </div>

     <div id="menuBall2" class="menuBall">
	     <a href="deposit.jsp" class="ball redball">
           <div class="menuText">DEPOSIT</div>
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
      <a href=vdoswitch.jsp class="ball blueball">
         <div class="menuText">LOGOUT</div>
     </a>
    </div>
    
   </div>
  </div>

 <div id="main">
    <div id="heade1"><h2>Balance:</h2></div>
    <p>Lorem ipsum dolor sit amet.</p>
  </div>
  <div id="sidebar">
    <%   
    	 session=request.getSession();
         double balance=Double.parseDouble(String.valueOf(session.getAttribute("balance")));
    	  String fn=(String)session.getAttribute("fname");
    	  String ln=(String)session.getAttribute("lname");
    	  out.println("<h4>Hello!!!</h4>");
		  out.println("<h4>"+fn+" "+ln+"</h4>");
		  out.println("<h3>Your balance:</h3>"+"<h4>"+balance+"</h4>");
    	%>
  </div>
	</body>
</html>