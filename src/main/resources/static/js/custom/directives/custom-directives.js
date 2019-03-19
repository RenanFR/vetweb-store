angular.module('customDirectives', [])//Directive module name to be included as dependency in the main module
	.directive('categoriesTable', function() {

		var ddo = {};//The directive definition object convention defines the template parameters
		ddo.restrict = "AE";//How the elements is going to be used (As tag, tag attribute or both)
		ddo.transclude = true;//Allows child elements to be concatenated within the directive
		ddo.scope = {//Defines the name of directive dynamic attributes
				h2Text: '@'//Internally using the same name as defined in the html directive invocation
        };
		ddo.templateUrl = 'js/custom/directives/categories-table.html';//The html file with the tag definition
		return ddo;
		
});