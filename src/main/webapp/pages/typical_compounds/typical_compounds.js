Application.$controller("typical_compoundsPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
         * $scope.Variables.loggedInUser.getData()
         *
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. to get value of text widget named 'username' use following script
         * '$scope.Widgets.username.datavalue'
         */
    };

}]);

Application.$controller("CompoundsWithAllergensFilter1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;

        $scope.filterAction = function($event) {
            if ($scope.Widgets.CompoundsWithAllergensFilter1.result.data) {
                $scope.Widgets.Table1.show = true;
            }
        };


        $scope.clearAction = function($event) {
            $scope.Widgets.Table1.show = false;
        };

    }
]);

Application.$controller("Table1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);