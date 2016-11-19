<%@include file="header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<center>
<h2>Supplier Information</h2>
</center>


<form:form method="POST" action="addsupp" commandName="supplier">

   <table>
    <tr>
        <td><form:label path="name">Supplier Name</form:label></td>
        <td><form:input path="name"/></td>
    </tr>
    <tr>
        <td><form:label path="address">Address</form:label></td>
        <td><form:input path="address"/></td>
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
<%@include file="footer.jsp" %>