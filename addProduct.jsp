<%@include file="header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>

<body>
<center>
<h2>Product Information</h2>
</center>


<form:form method="POST" action="addProd" commandName="product" enctype="multipart/form-data">

   <table>
    <tr>
        <td><form:label path="prodname">ProductName</form:label></td>
        <td><form:input path="prodname"/></td>
    </tr>
    <tr>
        <td><form:label path="quatity">Quantity</form:label></td>
        <td><form:input path="quatity"/></td>
    </tr>
    <tr>
        <td><form:label path="price">Price</form:label></td>
        <td><form:input path="price"/></td>
    </tr>
    
     <tr>
        <td><form:label path="image">Image</form:label></td>
        <td><form:input type="file" path="image"/></td>
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