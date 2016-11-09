<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">OnlineBooks</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Products<span class="caret"></span></a>
        <ul class="dropdown-menu">
        
         <li><a href="addProduct"></span>products</a></li>
        
          <li><a href="#">Update product</a></li>
          <li><a href="#">Delete product</a></li>
          <li><a href="#">Add product</a></li>
           <li><a href="#">View product</a></li>
        </ul>
        
        
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Categorys<span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="addCategory"></span>Category</a></li>
          <li><a href="#">Update Categorys</a></li>
          <li><a href="#">Delete Categorys</a></li>
          <li><a href="#">Add Categorys</a></li>
           <li><a href="#">View Categorys</a></li>
        </ul>
        </li>
      
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Supplier<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="addSupplier"></span>Supplier</a></li>
          <li><a href="#">Update Supplier</a></li>
          <li><a href="#">Delete Supplier</a></li>
          <li><a href="#">Add Supplier</a></li>
           <li><a href="#">View Supplier</a></li></ul>
        
       <!--   <ul class="nav navbar-nav navbar-right"> -->
        <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
        
  
  </div>
  </nav>
</body>
</html>

