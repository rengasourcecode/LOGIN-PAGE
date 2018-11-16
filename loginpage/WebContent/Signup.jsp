<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGSITRATION FORM</title>
</head>
<body  background="4237525-background-hd.jpg"> <br><br><br><br><br>
<% 
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); 
%>

<h3><p align="center" >ENTER YOUR DETAILS</p></h3><br>

<form action="Register" method="post"><br />
<p align="center"     >ENTER USERNAME : <input type="text" style="width:200px ; background-color:pink ;padding:3px ;margin-left:65px" name = "regusername" autocomplete="off"></p><br />
<p align="center">     ENTER PASSWORD : <input type="text" style="width:200px ; background-color:pink ;padding:3px ;margin-left:65px" name="regpassword" autocomplete="off"></p><br />
<p align="center">ENTER MOBILE-NUMBER : <input type="text" style="width:200px ; background-color:pink ;padding:3px ;margin-left:15px "name="mobnumber" ></p><br />

<p align="center"><input type="submit" style="width:100px ;background-color:pink ;padding:3px " value="REGISTER"></p>
</form>

</body>
</html>