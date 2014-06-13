<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"> </script>   

<script type="text/javascript">

function getres()
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
    document.getElementById("res").innerHTML=xmlhttp.responseText;
    }
}
xmlhttp.open("POST","resourcedata?wb="+document.getElementById("resrc").value,true);
xmlhttp.send()
}

function getKeyw()
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
    document.getElementById("res").innerHTML=xmlhttp.responseText;
    
    }
}
xmlhttp.open("POST","resourcekeyword?keyval="+document.getElementById("resKey").value,true);
xmlhttp.send()
}


</script>
</head>
<body>

<strong>Search Website(eg: www.google.com):</strong><input type="text" name="resource" id="resrc" size=50 style="margin-top:13px;"/>
<div style="color:maroon;width:8%;heigt:150px;text-align:center; margin:auto;float:right;border-radius:5px;margin-right:30%;margin-top:-2%;background-color:#dfe8cf; -webkit-box-shadow: 0 0 38px #df620c;" onclick="getres()"><label><strong>Search</strong></label></div>
<br/><br/>
<strong>Search Keyword(eg. what is Tree?):</strong><input type="text" name="resource" id="resKey" size=50 style="margin-top:13px;"/>
<div style="color:maroon;width:8%;heigt:150px;text-align:center; margin:auto;float:right;border-radius:5px;margin-right:30%;margin-top:-2%;background-color:#dfe8cf; -webkit-box-shadow: 0 0 38px #df620c;" onclick="getKeyw()"><label><strong>Search</strong></label></div>


<div id="res" style="width:120%; height:600px;margin-top:4%;"></div>
</body>
</html>