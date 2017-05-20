var myFirstSpringApp = angular.module('myFirstSpringApp',[]);

myFirstSpringApp.controller('homePageController', ['$scope','$http', function($scope,$http) {
	$scope.data="This is coming from the JS File";
}]);