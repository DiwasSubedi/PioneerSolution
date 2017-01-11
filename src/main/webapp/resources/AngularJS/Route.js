(function() {
	var app = angular.module("pioneerApp", ['ngRoute']);
	var contextRoot = "/" + window.location.pathname.split('/')[1];

	app.config(function($routeProvider) {
	    $routeProvider
	    .when("/", {
	        templateUrl : contextRoot + "/PartialPages/MainPage.html",
	        /*controller : "myCtrl"*/
	    })
	    .when("/user/:searchname", {
	        templateUrl : contextRoot + "/results",
	        controller : "userController"
	    })
	     .when("/user/:searchname/:accNumber", {
	        templateUrl : contextRoot + "/bankResults",
	        controller : "bankController"
	    }).when("/test", {
	        templateUrl : contextRoot + "/resources/partialpage/test1.html",
	        controller : "userController"
	    })	   
	    .otherwise({
	        template : "<h1>None</h1><p>Nothing has been selected,</p>"
	    });
	    
	});

}());