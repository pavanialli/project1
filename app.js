
var app = angular.module('myApp', ['ngRoute']);



app.config(function($routeProvider) {
  $routeProvider

  .when('/', {
    templateUrl : 'c_example/home.html'
   
  })

  .when('/blog', {
    templateUrl : 'c_example/blog.html'
   
  })

  .when('/friend', {
    templateUrl : 'c_example/friend.html'
   
  })
  
   .when('/job', {
    templateUrl : 'c_example/job.html'
   
  })

  .otherwise({redirectTo: '/'});
});

