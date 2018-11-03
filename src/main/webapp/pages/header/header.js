Application.$controller("headerPageController", ["$scope", function($scope) {
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


    $scope.AppLogoClick = function($event, $isolateScope) {
        if ($scope.Variables.loggedInUser.getData().roles[0] == "patient") {
            $scope.Actions.goToPage_Dash_Patient.invoke();
        } else
        if ($scope.Variables.loggedInUser.getData().roles[0] == "specialist") {
            $scope.Actions.goToPage_Dash_Clinician.invoke();
        } else {
            $scope.Actions.goToPage_Login.invoke();
        }
    };



}]);