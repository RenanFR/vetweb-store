angular.module('customDirectives', [])
	.directive('categoriesTable', function() {

		var ddo = {};
		ddo.restrict = "AE";
		ddo.transclude = true;
		ddo.scope = {
				h2Text: '@'
        };
		ddo.templateUrl = 'js/custom/directives/categories-table.html';
		return ddo;
		
});