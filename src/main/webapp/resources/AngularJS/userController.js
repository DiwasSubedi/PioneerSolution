/**
 * 
 */

(function() {
	var app = angular.module("pioneerApp");
	var userController = function($scope, $location, $http, $window) {

		function objToString(obj) {
		    var str = '';
		    for (var p in obj) {
		        if (obj.hasOwnProperty(p)) {
		            str += p + '::' + obj[p] + '\n';
		        }
		    }
		    return str;
		}
		
		$scope.signup =function(person){
			var newperson;
			$http.get("http://localhost:8080/infotracker/newPerson").then(getNew,onError);
			var getNew = function(response){
				newperson=response.data;
				console.log(newperson);
			};
			
			$http({
				'url' : 'students',
				'method' : 'POST',
				'headers' : {
					'Content-Type' : 'application/json'
				},
				'data' : person
			}).success(function(data) {
				$scope.success = "sucessfully added";
			}).error(function(data) {
				alert('Error: ' + data);
			});
			
			//alert(objToString(person));
			//$http.post("http://localhost:8080/infotracker/user/student/" +person).then(onPostCompletion,onError);
		}
		
		var onPostCompletion = function(response){
			
			console.log(objToString(response.data));
		}
		
		var onError =function(reason){
			
			alert("failed");
		}
		
		
		
		
		
	};

	app.controller("userController", userController);
}());