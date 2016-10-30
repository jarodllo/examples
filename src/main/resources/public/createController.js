var demo = angular.module('demo', []);

demo.controller('CreateController', function($scope, $http, $log) {

    $scope.insert = function() {

        $http.post('http://localhost:8080/expenses/', JSON.stringify($scope.expense)).
        then(function(response) {
            $log.debug("en el then");
        });

        $log.debug("hola mundo probando logs");
    }

    $scope.viewUrl = "http://localhost:8080/viewExpenses.html";
});