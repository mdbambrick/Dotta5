Application.$controller("Clinician_AddPageController", ["$scope", function($scope) {
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
        console.log("patientId (patient.dataSet.dataValue): " + $scope.Variables.patient.dataSet.dataValue);
    };


    $scope.InsertUsersPatientsonError = function(variable, data, options) {
        $scope.Widgets.message1.type = "error";
        $scope.Widgets.message1.caption = "Something went wrong, clinican has NOT been given access to your records";
        $scope.Widgets.message1.show = true;
        $scope.$root.$safeApply($scope);
    };

    $scope.InsertUsersPatientsonSuccess = function(variable, data, options) {
        $scope.Widgets.message1.type = "success";
        $scope.Widgets.message1.caption = "Clinican now has accces to your records";
        $scope.Widgets.message1.show = true;
        $scope.$root.$safeApply($scope);

    };

}]);



Application.$controller("UsersFilter1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.filterAction = function($event) {
            if ($scope.Widgets.UsersFilter1.result.data) {
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



        $scope.customButton1Action = function($event) {

            /*To find the row based on userid in the content of data table 2*/
            var found = _.find($scope.Widgets.executePatientMedicsTable1.gridData, function(row) {
                console.log('table2  id' + $scope.Widgets.executePatientMedicsTable1.gridData.id);
                return (row.userId === $scope.Widgets.Table1.gridData[0].id);
            });

            console.log("table 1 clinician id" + $scope.Widgets.Table1.gridData[0].id);
            console.log('table2 matching id' + $scope.Widgets.executePatientMedicsTable1.gridData.id);

            if (found) // if find returns true
            { // show message clinican already has accces to you records
                $scope.Widgets.message1.type = "info";
                $scope.Widgets.message1.caption = "Clinican already has access to your records";
                $scope.Widgets.message1.show = true;
            } else { // add record to users_patients table in database
                $scope.Variables.InsertUsersPatients.insertRecord();

            }
        };

    }
]);

Application.$controller("executePatientMedicsTable1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);