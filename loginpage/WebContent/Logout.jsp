<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGOUT PAGE</title>
</head>
<body  background="4237525-background-hd.jpg"> 
<% 
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); 
%>


<%
//HttpSession session = request.getSession();
session.removeAttribute("username");
session.invalidate();

%>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<h2><p align="center"> SUCCESSFULLY LOGGED OUT...</p></h2>

</body>
</html>