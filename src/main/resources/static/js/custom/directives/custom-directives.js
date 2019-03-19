angular.module('customDirectives', [])
	.directive('categoriesTable', function() {

		var ddo = {};
		ddo.restrict = "AE";
		ddo.transclude = true;
//		directiveDefinitionObject.scope = {
//				id: '@id',
//				description: '@description'
//        };
		ddo.templateUrl = 'js/custom/directives/categories-table.html';
		return ddo;
		
});