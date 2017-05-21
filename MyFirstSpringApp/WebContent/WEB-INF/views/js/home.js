var myFirstSpringApp = angular.module('myFirstSpringApp',[]);

myFirstSpringApp.controller('homePageController', ['$scope','$http', function($scope,$http) {
	$scope.data="This is coming from the JS File";
	
	$scope.responseData="abhi controller mein nahi gaya hai";
	
	$scope.gotoController=function(){
		alert("Button to click hua hai");
		$http.get("controller/getData").then(function(response){
			$scope.responseData=response.data;
		});;
	};
}]);