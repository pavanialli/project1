<%@include file="header.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
body{background: url('resources/images/bglogin.jpg') no-repeat center center fixed;
     background-size: cover;
}
</style>

</head>

<body><center>

welcome ${info}

<form action="validate"method="get">

<table border=3>
<tr>
   <td>login id:</td>
   <td><input type="text"name="loginName" required autofocus placeholder="Enter only Capslock"/></td>
</tr>

<tr>
    <td>password:</td>
    <td><input type="Password"name="passwd" required/></td> 
</tr>

<tr>
   <td><input type="submit" value="login"/></td>
   <td><input type= "Reset" value="cancel"/></td>
</tr>
</table>
</form>
</p>
</center>
</body>
</html>