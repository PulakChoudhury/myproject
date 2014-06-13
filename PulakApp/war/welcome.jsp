<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pulak's online Strore</title>


<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
</head>

<body id="welcomebody">

<div id="welcomediv"><h1>Welcome To Pulak's @pp</h1>
			<%
String name=null, value=null;

Cookie cookies[]=request.getCookies();
for (int i = 0; i < cookies.length; i++) {
	  name = cookies[i].getName();
	  value = cookies[i].getValue();
	  out.print("<strong><label style='margin-top:0px; float:right; margin-right:10%;margin-top:-8%;color:red; font-size:20px;'>Welcome,"+" "+value+"</label></strong>");
	 
}
%>
<div id="logout">
<a href="Login.html">logout</a></div>

<div id="getinfo"><a href="retrievedata">View Profile</a></div>

</div>
<div id="list">
<img id="pulimg" src="http://www.incisivemedia.com/IMG/548/218548/bjp-shop-logo-230x372.jpg?1334850738"/>
</div>

<div id="insidelist">Read Your Favorite Novels
<ul>
<li>Chetan Bhagat's Novels</li>
<ul>
<li><a href="http://www.collegespace.in/wp-content/uploads/group-documents/1772810521unknownftpgatewayatcollegespace316227766/Literature1772810521unknownftpgatewayatcollegespace316227766/Chetan%20Bhagat1772810521unknownftpgatewayatcollegespace316227766/five%20point%20someone.pdf"/>Five Point Some One</a></li>
<li style="text-align:left"><a href="http://www.golearning.blinkweb.com/uploads.00612104/00388749.pdf">Two States</a></li>
<li><a href="http://www.raisuman123.files.wordpress.com/2013/05/3-mistake-of-my-life.pdf">Three Mistakes of Life</a></li>
</ul>
</ul>
</div>
<div id="content"><img src="http://i.myniceprofile.com/556/55669.gif"/>
<p id="message"><blink>Hey Guys!! This site is under construction right now. In the mean time you can watch the Videos or read the Novels listed here!</blink></p>



</div>
</body>
</html>