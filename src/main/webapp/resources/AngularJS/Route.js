(function() {
	var app = angular.module("pioneerApp", ['ngRoute']);
	var contextRoot = "/" + window.location.pathname.split('/')[1];

	app.config(function($routeProvider) {
	    $routeProvider
	    .when("/", {
	        templateUrl : contextRoot + "/PartialPages/MainPage.html",
	        controller : "mainController"
	    })
	     .when("/login", {
	        templateUrl : contextRoot + "/PartialPages/login.jsp",
	        controller : "mainController"
	    })
	      .when("/home", {
	        templateUrl : contextRoot + "/PartialPages/MainPage.html",
	        controller : "mainController"
	    })
	    .when("/logout", {
	        templateUrl : contextRoot + "/PartialPages/MainPage.html",
	        controller : "mainController"
	        
	    })
	    .when("/SignUp", {
	        templateUrl : contextRoot + "/PartialPages/SignUp.html",
	        controller : "userController"
	    })
	    .otherwise({
	        template : "<h1>None</h1><p>Nothing has been selected,</p>"
	    });
	    
	});

}());