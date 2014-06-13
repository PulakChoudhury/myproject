<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<script>

 function nam(n)
 {

 if(/^[a-zA-Z]+$/.test(n)==false)
 {
document.getElementById("user").innerHTML="*Cannot use space, numeric or alphanumeric character";
 }
else
{
document.getElementById("user").innerHTML="";
}
 }
 function pasw()
 {
 var pas1=document.getElementById("pw1").value;
 var pas2=document.getElementById("pw2").value;
 if(pas1!=pas2)
 {
 document.getElementById("ps").innerHTML="*Password doesn't match";
 }
 else
 {
 document.getElementById("ps").innerHTML=" ";
 }
 }
 function mob(m)
 {

 if(/^[0-9]{10}/.test(m)==false)
 {
  document.getElementById("mb").innerHTML="*incorrect mobile number";
 }
 else
 {
  document.getElementById("mb").innerHTML=" "
 }
 }
 function stat(sta)
 {

 if(/^[a-zA-Z]*\s*[a-zA-Z]*$/.test(sta)==false)
 {
document.getElementById("stt").innerHTML="*Invalid State name";
 }
else
{
document.getElementById("stt").innerHTML="";
}
 }
 function pincode(pn)
 {
 if(/^[0-9]{6}/.test(pn)==false)
 {
 document.getElementById("pinn").innerHTML="*Invalid Pin number";
 }
 else
 {
 document.getElementById("pinn").innerHTML="";
 }
 }
 function em(ema)
 {
 if(/^([a-z])+([0-9|.]|[a-z])+@+(gmail|yahoo|a-cti)+([.])+com/.test(ema)==false)
 {
  document.getElementById("e").innerHTML="*Invalid Email Address";
 
 }
 else
 {
  document.getElementById("e").innerHTML="";
 }
 }
 function validate()
 {
 if(document.reg.username.value=="" || document.reg.mobile.value=="" || document.reg.pas.value==""
 || document.reg.confpas.value=="" || document.reg.add1.value==""
  || document.reg.add2.value=="" || document.reg.state.value=="" || document.reg.pin.value==""
   || document.reg.email.value=="")
 {
 alert("please fill all the fields");
 return false;
 }
 
 }

</script>
</head>

<body background="18.jpg">
<form name="reg" action="registration" onSubmit="return validate()" method="post">
<table id="regtable" align="center">
<th colspan=2>Register your Details </th>
<tr>
<td><strong>Name:</strong></td><td><input type="text" name="username" onChange="nam(document.reg.username.value)"/><label id="user" style="font-size:12px; color:red;"></label></td>

</tr> 
<tr>
<td><strong>Password:</strong></td><td><input type="password" name="pas" id="pw1"/></td>
</tr>
<tr>
<td><strong>Confirm password:</strong></td><td><input type="password" name="confpas" id="pw2" onChange="pasw()"/><label id="ps" style="font-size:12px; color:red;"></label></td>
</tr>
<tr>
<td><strong>Mobile number:</strong></td><td><input type="text" name="mobile" onChange="mob(document.reg.mobile.value)"/><label id="mb" style="font-size:12px; color:red;"></label></td>
</tr>
<tr>
<td><strong>Email ID:</strong></td><td><input type="text" name="email" onChange="em(document.reg.email.value)"/><label id="e" style="font-size:12px; color:red;"></label></td>
</tr>
<tr>
<td><strong>Gender:</strong></td><td><label>Male</label><input type="radio" name="sex" value="male"/><label>Female</label><input type="radio" name="sex" value="female"/></td>
</tr>
<tr>
<td><strong>Address1:</strong></td><td><input type="text" name="add1"/></td>
</tr>
<tr>
<td><strong>Address2:</strong></td><td><input type="text" name="add2"/></td>
</tr>
<tr>
<td><strong>State:</strong></td><td><input type="text" name="state" onChange="stat(document.reg.state.value)"/><label id="stt" style="font-size:12px; color:red;"></label></td>
</tr>
<tr>
<td><strong>Pin:</strong></td><td><input type="text" name="pin" onChange="pincode(document.reg.pin.value)"/><label id="pinn" style="font-size:12px; color:red;"></label></td>
</tr>
<tr>
<td colspan=2><center><input type="submit" value="" style="background:url(regbutton.jpg); width:14%; height:40px;  background-repeat:no-repeat;"/></center></td>
</tr>
</table>
</form>
</body>
</html>