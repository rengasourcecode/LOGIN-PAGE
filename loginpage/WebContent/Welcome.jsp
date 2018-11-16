<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WELCOME TO THE MAIL</title>
</head>
<body  background="4237525-background-hd.jpg"> 



<% 
//http 1.1
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); 

//http 1.0 //proxies
//response.setHeader("Prgma", "no-cache");
//response.setHeader("Expires", "0");

if(session.getAttribute("username")==null){
	response.sendRedirect("Login.jsp");
}
%>
<br><br><br><br><br><br><br><br><br><br><br><br>
<h3><p align="center"> Welcome...</p></h3>
<h1><p align="center">${username}</p></h1> <br>
<form action="Logout.jsp">
<p align="center"><input type="submit" style="width:80px ;background-color:pink ;padding:3px " value="LOGOUT"></p>
</form>

</body>
</html>