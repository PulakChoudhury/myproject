<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet" />
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
 <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js">    
    </script>
    
      <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js"></script>
</head>
<style>
.container
{

		border:2px solid white;
		border-radius:5px;
		background-color:#711905;
		margin-top:20px;
		width:inherit;
		height:inherit;	
		font-family: Times-New-Roman;
}
.row
{

		border:2px solid #FAFAFA;
		border-radius:5px;
		background-color:;
		padding:5px 3px 5px 3px;
		margin:5px -8px 5px -8px;
	
		
}

#imgdiv
	{
		border:2px solid gray;
		border-radius:5px;		
		background-color:#cff1b1;
		font-size:15px ;
		height:inherit;
		
			
	}
	.col-sm-12
	{
	border:2px solid #2693c9;
	border-radius:5px;
	background-color:#343734;
	height:inherit;
	
	font-size:15px 
	}

</style>
<script>
function msg()
{
var xmlhttp;
if (window.XMLHttpRequest)
  {
  xmlhttp=new XMLHttpRequest();
  }

xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    document.getElementById("conndiv").innerHTML=xmlhttp.responseText;
    }
}
xmlhttp.open("POST","message.jsp",true);
xmlhttp.send()
}
function email()
{
var xmlhttp;
if (window.XMLHttpRequest)
  {
  xmlhttp=new XMLHttpRequest();
  }

xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    document.getElementById("conndiv").innerHTML=xmlhttp.responseText;
    }
}
xmlhttp.open("POST","email.jsp",true);
xmlhttp.send()
}

</script>

<body>
<div class="container">
		<div class="row" style="text-align: center;background-color: #343734;">
		<div class="col-xs-14" style="font-size: 30px; font-family:comic sans ms;color:white; background-color:#343734;">
				CONNECT U!
			</div>
			<div class="col-sm-12" id="imgdiv">
			<img src="http://www.apkdad.com/wp-content/uploads/2013/02/chomp-SMS-Icon1.png" style="width:300px;height:250px; cursor:pointer;" onclick="msg()"/>
			<img src="http://www.oah.org/site/assets/images/email-icon.png" style="width:300px;height:250px; cursor:pointer;" onclick="email()"/>
			<img src="http://icons.iconarchive.com/icons/designcontest/ecommerce-business/256/chat-icon.png" style="width:300px;height:250px; cursor:pointer;"/>
			</div>
			<div id="conndiv" class="col-sm-12">
			</div>
		</div>
</div>
</body>
</html>