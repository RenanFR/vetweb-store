/**
 * 
 */
angular.module('vetwebStore').controller('CategoryController', function($scope, $http) {
	//Controller for event control and user interaction with back-end
    $scope.categories = [];//We provide data binding for view referencing with $scope object (Injected by angular)
    //We can make http requests with $http object injected by angular
    $http.get('/vetweb/store/endpoint/categories/all')
    	.success(function(returnData) {
    		console.log(returnData);
    		$scope.categories = returnData;
    	})
    	.error(function(error) {
    		console.log(error);
    	});
    //The request function are asynchronous and returns a promise object in which we can use callback actions when the promise returns  
});