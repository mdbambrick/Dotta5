Application.$controller("Dash_ClinicianPageController", ["$scope", function($scope) {
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

        console.log($scope.Variables.loggedInUser.getData());
        var sv = $scope.Variables.sharingCode;
        sv.setInput({
            "user_id": $scope.Variables.loggedInUser.dataSet.id
        });
        sv.invoke();

    };


}]);



Application.$controller("executeMedicsWithPatientsTable1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);