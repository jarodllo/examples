var demo = angular.module('demo', []);

demo.controller('DeleteController', function($scope, $http, $log) {

    $scope.delete = function() {

        $http.delete('http://localhost:8080/expenses/', JSON.stringify($scope.expense)).
        then(function(response) {
            $log.debug("delete en el the");

        });

        $log.debug("delete out the");
    }

});