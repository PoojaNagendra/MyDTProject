var control = angular.module('admintable', []);

control.controller('admincontroller', function($scope, $http){

	      
               $http.get('GsonCon').success(function(data, status, headers, config) {
            	   console.log(data);
                        $scope.list = data;
                });
                        
                

                
      });
var control = angular.module('carttable', []);

control.controller('cartcontroller', function($scope, $http){

	      
               $http.get('GsonC').success(function(data, status, headers, config) {
            	   console.log(data);
                        $scope.list = data;
                });
                        
                

                
      });