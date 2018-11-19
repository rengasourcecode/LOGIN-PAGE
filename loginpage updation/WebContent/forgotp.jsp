<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FORGOT PASSWORD PAGE</title>
</head>
<body  background="4237525-background-hd.jpg"> <br><br><br><br>
<% 
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); 
%>
<h2><p align="center">PASSWORD RECOVERY PAGE</p></h2><br>
<p align="center">CLICK FOR NEW PASSWORD</p><br>

</form>
<form action="updatepassword.jsp" method="post">
<p align="center"><input type="submit" style="width:150px ; background-color:pink ;padding:3px ;margin-left:11px " value="SUBMIT TO UPDATE"></p>
</form><br><br>
<p align="center">FILL THE DETAILS TO RECOVER OLD PASSWORD</p><br>
<form action="ForgotDb" method="post">
<p align="center">ENTER YOUR MAIL ID   : <input type="text" style="width:200px ; background-color:pink ;padding:3px ;margin-left:50px "name="fmail"></p>
<p align="center">ENTER YOUR MOBILE-NO : <input type="text" style="width:200px ; background-color:pink ;padding:3px ;margin-left:23px " name="fmob"></p><br>
<p align="center"><input type="submit" style="width:150px ; background-color:pink ;padding:3px ;margin-left:11px " value="SUBMIT TO RECOVER"></p>

</body>
</html>