Application.$controller("Dash_AllergyPageController", ["$scope", function($scope) {
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









    $scope.foodClick = function($event, $isolateScope) {
        $scope.Variables.Category.setData({
            dataValue: 1
        });
        console.log("Category " + $scope.Variables.Category.dataSet.dataValue);
    };


    $scope.aeroClick = function($event, $isolateScope) {
        $scope.Variables.Category.setData({
            dataValue: 3
        });
    };


    $scope.insectsClick = function($event, $isolateScope) {
        $scope.Variables.Category.setData({
            dataValue: 8
        });
    };

}]);

Application.$controller("alertdialog1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;

        $scope.alertdialog1Ok = function($event, $isolateScope) {
            $scope.Variables.Tracker.getData();
            var result = $scope.Variables.Tracker.getData();
            console.log("Tracking data: ", result);
            $scope.Variables.AllergyNumber.setData({
                dataValue: 1000
            });
            //console.log("allergy number: ", AllergyNumber.datavalue);
            $scope.Variables.AllergyName.setData({
                dataValue: "Unknown Allergy Type"
            });
            //console.log("allergy name: ", AllergyName.datavalue);
            $scope.Variables.Category.setData({
                dataValue: 0
            });

            $scope.Actions.goToPage_SymptomSurvey.navigate();
        };

    }
]);

Application.$controller("DrugdialogController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("contactDialogController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);