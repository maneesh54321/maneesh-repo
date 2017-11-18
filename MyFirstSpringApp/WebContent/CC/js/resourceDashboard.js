var myFirstSpringApp = angular.module('myFirstSpringApp', []);

myFirstSpringApp
		.controller(
				'homePageController',
				function($scope, dataService) {
					$scope.pagination = {};
					$scope.pagination.currentPage = 1;
					$scope.pagination.itemsPerPage = 5;
					$scope.retrievePageOfResources = function() {
						dataService
								.getResources($scope.pagination)
								.then(
										function(response) {
											$scope.pagination.pageOfResources = response.data.content;
											$scope.pagination.totalItems = response.data.content.length;
										});
					};

					$scope.retrievePageOfResources();
				});

myFirstSpringApp.service('dataService', function($http) {
	return {
		getResources : function(pagination) {
			let url = "/MyFirstSpringApp/resourceController/getPageOfResources"
					+ "?page=" + pagination.currentPage + "&size="
					+ pagination.itemsPerPage;
			return $http.get(url);
		}
	}
});