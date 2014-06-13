<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

    <html>
    <head>
    
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js">    
    </script>
    
      <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js"></script>
    <link type="text/css" rel="stylesheet" href="stylesheet.css"/>
    <script type="text/javascript"> 
    
    
    var i = 0; 
    var path = new Array();
    path[0] = "20.jpg"; 
    path[1] = "2.jpg"; 
    path[2] = "7.jpg";
    path[3] = "24.jpg";
    path[4] = "8.jpg";
    
    var k=path.length-1;
    function swapImage() 
     { 
     document.getElementById("slide").src=path[i];
     if(i<k)
     {
     i++;
     }
     else
     {
     i=0;
     }
    setTimeout("swapImage()",2000); 
       } 
  window.onload=swapImage;

function TechVideo()
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
    document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
    }
}
xmlhttp.open("POST","TechVideo.jsp",true);
xmlhttp.send()
}

function SearchWeb()
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
    document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
    }
}
xmlhttp.open("POST","HttpResources.jsp",true);
xmlhttp.send()

}
function Connect()
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
    document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
    }
}
xmlhttp.open("POST","First.jsp",true);
xmlhttp.send()

}

function viewprof()
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
    var ob=eval('('+ xmlhttp.responseText +')');

    var table = document.getElementById("myDiv");
	table.innerHTML="<center><table width=\"300\", height=\"300\"><tr><td width=\"100\">Name:</td><td>"+ob.name+"</td></tr>"
							+"<tr><td>Email:</td><td>"+ob.email+"</td></tr>"
							+"<tr><td>Gender:</td><td>"+ob.gender+"</td></tr>"
							+"<tr><td>Phone:</td><td>"+ob.mobile+"</td></tr>"
							+"<tr><td>Address1:</td><td>"+ob.address1+"</td></tr>"
							+"<tr><td>Address2:</td><td>"+ob.address2+"</td></tr>"
							+"<tr><td>State:</td><td>"+ob.state+"</td></tr>"
							+"<tr><td>Pin:</td><td>"+ob.pin+"</td></tr>"
							+"</table></center>"						
	
	
    
    }
}
xmlhttp.open("GET","retrievedata",true);
xmlhttp.send()
}


</script>
 

 </head>
    <body background="21.jpg">
<%
String nam=null;
Cookie cks[]=request.getCookies();
for(int j=0;j<cks.length;j++)
{
nam=cks[j].getValue();
}
%>


<strong><label style="float:right; margin-right:10%; margin-top:-5%; color:white; font-size:20px;">Welcome, <%=nam %></label>
<div style="width:4%;heigt:50px;text-align:center; float:right;border-radius:5px;margin-right:4%; margin-top:-5%;background-color:#74a76c;"><a href="Login.html" style="text-decoration:none; color:maroon">Logout</a></div>

<div class="contdiv">

<div class="subcontdiv"></strong>
<img src="20.jpg" name="slide" id="slide" style="width:100%;height:370px; margin-right:auto;margin-left:auto;">
</div>
<div id="viewpr" style="color:maroon;width:8%;heigt:150px;text-align:center; margin:auto;float:right;border-radius:5px;margin-right:3%;margin-top:1%;;background-color:#dfe8cf; -webkit-box-shadow: 0 0 38px #df620c;" onclick="viewprof()"><label><strong>View your profile</strong></label></div>
<div id="viewpr" style="color:maroon;width:8%;heigt:150px;text-align:center; margin:auto;float:right;border-radius:5px;margin-right:2%;margin-top:1%;;background-color:#dfe8cf; -webkit-box-shadow: 0 0 38px #df620c;" onclick="TechVideo()"><label><strong>Watch Tech Videos</strong></label></div>

<div id="search" style="color:maroon;width:8%;heigt:150px;text-align:center; margin:auto;float:right;border-radius:5px;margin-right:2%;margin-top:1%;;background-color:#dfe8cf; -webkit-box-shadow: 0 0 38px #df620c;" onclick="SearchWeb()"><label><strong>Search Websites</strong></label></div>
<div id="sear" style="color:maroon;width:8%;heigt:150px;text-align:center; margin:auto;float:right;border-radius:5px;margin-right:2%;margin-top:1%;;background-color:#dfe8cf; -webkit-box-shadow: 0 0 38px #df620c;" onclick="Connect()"><label><strong>Social connect</strong></label></div>

</div>

<div id="myDiv">

    <jsp:include page="HttpResources.jsp"></jsp:include>
<jsp:include page="First.jsp"></jsp:include>

</div>

    </body> 
    </html>