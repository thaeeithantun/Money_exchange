<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" href="css/div2.css">
<title>Insert title here</title>
</head>
<body background="image/bg.png">


<div id="container">
<div class="row single"> </div>

<div class="row double">
<div class="column-2 left"><img src="images/user.JPG" width="100" height="170"></div>
<script type="text/javascript">

(function(){
	var img=document.getElementById('container').firstChild;
	img.onload=function(){
	
			img.height='300%';
			img.width='300%';
		
	};
}());
</script>




<div class="column-2 right"><img src="image/admin.JPG" width="100" height="170">
<p><font size="5" color="green" align="center">Here for Admin!</font></p>
</div>

</div>

<div class="row triple">
<div class="column-3 left"></div>
<div class="column-3 center"></div>
<div class="column-3 right"></div>
</div>

</div>

</body>
</html>