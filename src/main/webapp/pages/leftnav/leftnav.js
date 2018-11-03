Application.$controller("leftnavPageController", ["$scope", function($scope) {
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


    $scope.menu1Select = function($event, $isolateScope, $item) {
        if ($item == "Add Clinician") {
            $scope.Actions.goToPage_Clinician_Add.invoke();
        } else if ($item == "Remove Clinician") {
            $scope.Actions.goToPage_Clinician_Remove.invoke();
        } else if ($item == "List Clinicians") {
            $scope.Actions.goToPage_Clinician_List.invoke();
        }
    };


    $scope.anchor9Click = function($event, $isolateScope) {
        if ($scope.Variables.loggedInUser.getData().roles[0] == "patient") {
            $scope.Actions.goToPage_Dash_Patient.invoke();
        } else
        if ($scope.Variables.loggedInUser.getData().roles[0] == "specialist") {
            $scope.Actions.goToPage_Dash_Clinician.invoke();
        }
    };

}]);