var demo = angular.module('demo', []);

demo.controller('UpdateController', function($scope, $http, $log ) {

    $log.debug("en el update");

    $log.debug("Buscando el expense" + $scope.expense.id);

    $scope.update = function() {

        $http.put('http://localhost:8080/expenses/', JSON.stringify($scope.expense)).
        then(function(response) {
            $log.debug("en el then update");
        });

        $log.debug("hola mundo update logs");
    }

});
