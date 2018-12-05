<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Pure CSS Blurred Video Background Login Box. (fork)</title>
   
    
        <link rel="stylesheet" href="css/videologin.css">

    
  
  </head>
<script type="text/javascript">
function validform(){
var id=document.MyForm.acid.value;
var psw=document.MyForm.pp.value;
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

 
 <body>
 <form name="MyForm" action="CheckPW" method="post" onsubmit="return validform()">

  
  <div class="vid-container">

  <video id="Video1" class="bgvid back" autoplay="false" muted="muted" preload="auto" loop>
   
   <source src="video/video.mp4" type="video/mp4">
 
 </video>
  <div class="inner-container">
   
    <div class="box">
    
  <h1>Login</h1>
    
  <input type="text" placeholder="Admin ID" name="acid"/>
   
   <input type="password" placeholder="Password" name="pp"/>
    
  <button>Login</button>
  </div>

  </div>

</div>
   
  
     <script src="js/index.js"></script> 
     </form>   
  </body>
</html>
