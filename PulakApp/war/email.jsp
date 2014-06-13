<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Messaging</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>

<style>
.container
{
		border:2px solid white;
		border-radius:5px;
		background-color:#123456;
		margin-top:20px;
		height:inherit;
	     width:inherit;	
	
		font-family: Times-New-Roman;
		
}
.row
{
		border:2px solid #FAFAFA;
		border-radius:5px;
		background-color:#a53136;
		padding:5px 3px 5px 3px;
		margin:5px -8px 5px -8px;
		font-size:20px;
		color:white;
		
		
}
input,textarea
{
color:black;
}
</style>
</head>
<body>
<form name="messaging" action="sendemail" method="post">
<div class="container">
<div class="row">
<table align="center">
<tr>
<td>EmailID:</td><td><input type="text" placeholder="Enter email" name="emailid" style="width:270px;"/></td>
</tr>
<tr>
<tr>
<td>Subject:</td><td><input type="text" placeholder="Enter Subject" name="subject" style="width:270px;"/></td>
</tr>
<tr>
<tr>
<td>Message:</td><td><textarea name="txt" placeholder="Enter text.." style="width:270px; height:150px;"></textarea></td>
</tr>
<tr>
<td colspan=2><center><input type="submit" value="" style="width:160px; height:37px; background-image:url(https://www.getzixmail.com/images/button-send-email.png)"/></center></td>
</tr>
</table>
</div>
</div>
</form>
</body>
</html>