'use strict';

/* Services */

// Demonstrate how to register services
// In this case it is a simple value service.
angular.module('services', []).value('version', '0.1');

var userService = angular.module('userService', [ 'ngResource' ]);
userService.factory('User', [ '$resource', function($resource) {
	return $resource('/angular/rest/user', {}, {});
} ]);
