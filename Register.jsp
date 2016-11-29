<%@include file="header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
    
    <style>
body{background: url('resources/images/reg.jpg') no-repeat center center fixed;
     background-size: cover;
}
</style>

</head>
<body><center>

<h2> Create an account </h2>
<form:form method="POST" action="addUser" commandName="user">
   <table>
   
   <%-- <tr padding="20">
        <td><form:label path="username">First Name</form:label></td>
        <td><form:input path="username" /></td>
    </tr>--%>
   
    <tr padding="50">
        <td><form:label path="username">User Name</form:label></td>
        <td><form:input path="username" /></td>
    </tr>
    
    <tr padding="50">
        <td><form:label path="emailid">Email Address</form:label></td>
        <td><form:input path="emailid" /></td>
    </tr>
    
        
     <tr>
        <td><form:label path="phno">Phone no</form:label></td>
        <td><form:input path="phno" /></td>
    </tr>
    
    <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:input path="password" /></td>
    </tr>
    
     <tr>
        <td><form:label path="confirmpassword">Confirm Password</form:label></td>
        <td><form:input path="confirmpassword" /></td>
    </tr>
    
   <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
    <tr>
    <td>
     <a href="logout">Logout</a>
     </td>
     </tr></center>
</table>  
</form:form>
</body>
</html>