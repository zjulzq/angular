'use strict';

/* Controllers */

angular.module('controllers', []).controller('signinCtrl',
		[ '$scope', function($scope) {
			$scope.data = 'Hello world';
		} ]).controller('MyCtrl1', [ function() {

} ]).controller('MyCtrl2', [ '$scope', 'User', function($scope, User) {
	$scope.user0 = User.get();
} ]);
