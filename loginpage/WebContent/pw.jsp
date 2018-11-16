<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>password page</title>
</head>
<body  background="4237525-background-hd.jpg"> <br><br><br><br><br><br><br><br><br><br>
<% 
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); 
%>


<h2><p align="center">Your Password Is... </p></h2>

<h1><p align="center">${PW}</p></h1>

<form action="Login.jsp">
<p align="center"><input type="submit" style="width:90px ;background-color:pink ;padding:3px" value="LOGIN"></p>
</form>

</body>
</html>