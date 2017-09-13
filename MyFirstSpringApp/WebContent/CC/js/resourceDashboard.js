var myFirstSpringApp = angular.module('myFirstSpringApp',[]);

myFirstSpringApp.controller('homePageController', ['$scope','$http', function($scope,$http) {
	$scope.pageNumber=1;
	$scope.size=10;
	$scope.retrievePageOfResources=function(){
		$http.get("/MyFirstSpringApp/resourceController/getPageOfResources?page="+$scope.pageNumber+"&size="+$scope.size).then(function(response){
			alert(JSON.stringify(response));
			$scope.pageOfResources=response.data;
			alert(JSON.stringify($scope.resources));
		});
	};
	
	$scope.retrievePageOfResources();
}]);