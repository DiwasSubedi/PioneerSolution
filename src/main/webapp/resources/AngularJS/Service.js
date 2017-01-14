/**
 * 
 */

 (function(){
	 
	var loginService = function($http,$log){		
		var login =function(username,password){
		
			/*return $http.get("http://localhost:8080/infotracker/postLogin").then(function(response){
								return response.data;									
			});*/
			
			return null;
		};
		
		
		return{			
			login:login					
		};
	};
	

	var module = angular.module("pioneerApp");
	module.factory("loginService",loginService);
}());