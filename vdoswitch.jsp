<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Pure CSS Blurred Video Background Login Box. (fork)</title>
   
    
        <link rel="stylesheet" href="css/videologin.css">
         <link rel="stylesheet" href="css/div2.css">

    
  
  </head>

 
 <body>

  
  <div class="vid-container">

  <video id="Video1" class="bgvid back" autoplay="false" muted="muted" preload="auto" loop>
   
   <source src="video/vdo2.mp4" type="video/mp4">
 
 </video>
  <div class="inner-container">
    </div>
<div id="container">
<div class="row single"> </div>

<div class="row double">
<div class="column-2 left"><a href="UserLogin.jsp"><img src="images/user.JPG" width="100" height="170" border="1"></a>
<p><font size="6" color="green" align="center">User Login</font></p></div>
<script type="text/javascript">

(function(){
	var img=document.getElementById('container').firstChild;
	img.onload=function(){
	
			img.height='300%';
			img.width='300%';
		
	};
}());
</script>




<div class="column-2 right"><a href="vdologin.jsp"><img src="images/admin.JPG" width="100" height="170" border="1"></a>
<p><font size="6" color="green" align="center">Admin Login</font></p>
</div>

</div>

<div class="row triple">
<div class="column-3 left"></div>
<div class="column-3 center"></div>
<div class="column-3 right"></div>
</div>

</div>

  </div>


   
  
     <script src="js/index.js"></script> 
      
  </body>
</html>
