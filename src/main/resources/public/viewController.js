angular.module('demo', [])
    .controller('ViewController', function($scope, $http, $log, $location) {

        $log.debug("en el view");
        $http.get('http://localhost:8080/expenses/').
        then(function(response) {
            $scope.expenses = response.data;
        });

        $scope.indexUrl = "http://localhost:8080/index.html";


        $scope.delete = function(expense, index) {

            $http.delete('http://localhost:8080/expenses/' + expense.id).
            then(function(response) {
                $log.debug("delete en el the");

                $scope.expenses.splice(index,1);
            });

            $log.debug("delete out the");
        }



        $scope.update = function (expense) {

            $log.debug("update" + expense.id);
            $scope.expense = expense;
            window.location = 'http://localhost:8080/updateExpense.html';

        };
    });