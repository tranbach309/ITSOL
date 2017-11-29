var app = angular.module('myApp', []);
app.controller('carsnot', function($scope, $http) {
	$http.get("http://localhost:8080/Ex10/rest/CarService/cars/not").then(
			function(response) {
				$scope.car = response.data;
			})
});
app.controller("cars", function($scope, $http) {
	$http.get("http://localhost:8080/Ex10/rest/CarService/cars").then(
			function(response) {
				$scope.car = response.data;
			})
});

app.controller("insurances", function($scope, $http) {
	$http.get("http://localhost:8080/Ex10/rest/CarService/insurances").then(
			function(response) {
				$scope.insurance = response.data;
			})
});

app.controller("buyinsurance", function($scope, $http){
	$http.get("http://localhost:8080/Ex10/rest/CarService/cars/not").then(
			function(response){
				$scope.car = response.data;
			})
})

app.controller("car", function($scope, $http){
	$http.get("http://localhost:8080/Ex10/car/search").then(
			function(response){
				$scope.car = response.data;
			})
})