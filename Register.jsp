<%@include file="header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2> Registration </h2>
<form:form method="POST" action="addUser" commandName="user">
   <table>
    <tr>
        <td><form:label path="Username">Name</form:label></td>
        <td><form:input path="Username" /></td>
    </tr>
    <tr>
        <td><form:label path="emailid">Mailid</form:label></td>
        <td><form:input path="emailid" /></td>
    </tr>
    <tr>
        <td><form:label path="id">id</form:label></td>
        <td><form:input path="id" /></td>
    </tr>
    
     <tr>
        <td><form:label path="phno">phone no</form:label></td>
        <td><form:input path="phno" /></td>
    </tr>
    
    <tr>
        <td><form:label path="password">password</form:label></td>
        <td><form:input path="password" /></td>
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
     </tr>
</table>  
</form:form>
</body>
</html>