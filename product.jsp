<%@include file="header.jsp" %>
<%-- <div>
 <div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl"> <!-- //AngularJS -->
 
   <hr></hr>
   <table class="table table-striped">
   <tr>
   <th>Id</th>
   <th>Product Name</th>
   <th>Product Price</th>
   <th>Quantity</th>
   <th>Product Image</th>
   </tr>
       <tr>
           <td>${product.productid}</td>
           <td>${product.prodname}</td>
           <td>${product.price}</td>
           <td>${product.quatity}</td>
           <td><img src="resources/images/${product.prodname}.jpg" style=height:100px;width:100px;"/></td>
           <td><a href="viewdetail?id=${product.productid}">View</a>
   </tr>
   </table>
  </div>
  </div>
 --%>

<div class="container" ng-app="myApp" ng-controller="MyController" ng-init="getDataFromServer()">

  <form>
    <div class="form-group">
      <div class="input-group">
        <div class="input-group-addon"><i class="fa fa-search"></i></div>
       <input type="text" class="form-control" placeholder="Search Product Name" ng-model="searchPTitle">      
       </div>      
    </div>
  </form>
  <table class="table table-hover" style="min-width:1200px">
   <thead>
      <tr>
      <td>
          <a href="#" ng-click="sortType = 'productid'; sortReverse = !sortReverse">
            Product Id 
            <span ng-show="sortType == 'productid' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'productid' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
         <td>
          <a href="#" ng-click="sortType = 'productname'; sortReverse = !sortReverse">
            Product Name 
            <span ng-show="sortType == 'productname' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'productname' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
         <td>
          <a href="#" ng-click="sortType = 'quatity'; sortReverse = !sortReverse">
          Quantity
            <span ng-show="sortType == 'quatity' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'quatity' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'price'; sortReverse = !sortReverse">
          Price
            <span ng-show="sortType == 'price' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'price' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
         <td>
          <a href="#" ng-click="sortType = 'more'; sortReverse = !sortReverse">
          Image
            <span ng-show="sortType == 'more' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'more' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>
         </tr>
    </thead>
     <tbody>
      <tr ng-repeat="p1 in prod | orderBy:sortType:sortReverse | filter:searchPTitle">
           		<td>{{p1.productid}}</td>
           		<td>{{p1.prodname}}</td>
           		<td>{{p1.quatity}}</td>
           		<td>{{p1.price}}</td>
           		<td><img src="resources/images/{{p1.prodname}}.jpg" style="height:100px;width:100px"></td>
           		
   
      <!--  <td><a href="Deleteproduct&{{p1.id}}">Delete</a></td>
        <td><a href="Updateprod&{{p1.id}}">Edit</a></td>  
 
 <td><a href="viewDetail?{{p1.id}}">view</a>   -->     	
      </tr>
    </tbody>
    </table>
  <a href="addProduct"><h1 align="center"><h2><font color="white">Back</a></center>
</div>




