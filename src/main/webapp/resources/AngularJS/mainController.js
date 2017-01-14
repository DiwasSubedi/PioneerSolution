

(function() {	
	var app = angular.module("pioneerApp");
	var contextRoot = "/" + window.location.pathname.split('/')[1];
	var mainController = function($scope,$location,$http,$window) {
		
			
		
/*		var onCompletion = function(data) {		
			if (!data) {
				$scope.error = "Could not fetch the data"
			}
		};*/
		var onError = function(response) {
			alert(response.data);
			$scope.error = "Could not fetch the data"
		};
		
		var onOutCompletion =function(response){
			alert(response.data+"success");
			$location.path("/home");
			
		};
		/*
		$scope.login = function(){
			var credentials={				
				email:$scope.email,
				password:$scope.password
				
			}
			$http.post("http://localhost:8080/infotracker/postLogin/"+ credentials).then(onCompletion,onError);
		
			
		}*/
		$scope.logout = function(){
		$http.get("http://localhost:8080/infotracker/doLogout").then(onOutCompletion,onError);
		};
		
		
	};
	
	app.controller("mainController", mainController);
}());