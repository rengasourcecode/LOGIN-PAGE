<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>
</head>
<body  background="4237525-background-hd.jpg"> 
<% 
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); 
%>


<form action="Validate" method="post"><br><br><br><br>
<h2><p align="center" style="color:black ;font-family:cursive " >WELCOME </p></h2><br><br>
<h3><p align="center" style="color:black ;font-family:cursive" >SIGN-IN </p></h3><br >

<h3><p align="center" style="color:black ;font-family:cursive">USERNAME : <input type="text" style="background-color:pink ; margin-left:25px"  name="username" autocomplete="off"></p>
<p align="center"style="color:black;font-family:cursive" > PASSWORD : <input type="password" style="background-color:pink ; margin-left:25px" name="password"></p></h3><br>
<p align="center" > <input type="submit" style="width:120px ; background-color:pink ;padding:3px ;margin-left:10px ;font-family:cursive" value=" LOGIN  " ></p><br><br>
</form>
<form action="forgotp.jsp">
<p align="center" > <input type="submit" style="width:120px ;background-color:pink ;padding:3px ;margin-left:250px ;font-family:cursive" value="Forgot-Password ?" ></p>
</form>
<form action="Signup.jsp">
<p align="center" > <input type="submit" style="width:120px ;background-color:pink ;padding:3px ;margin-left:250px;font-family:cursive" value="SIGN-UP"></p>
</form>
</body>
</html>