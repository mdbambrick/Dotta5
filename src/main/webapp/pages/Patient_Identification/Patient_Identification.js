Application.$controller("Patient_IdentificationPageController", ["$scope", function($scope) {
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
         
        $scope.Variables.patient.getData();
        $scope.Variables.Patient_Read.setInput({
            "patientId": parseInt($scope.Variables.patient.dataSet.dataValue)
        });
        $scope.Variables.Patient_Read.invoke();
*/
    };




    //VALIDATIONS/ TO FOLLOW...
    //$scope.PatientsLiveForm1Beforeservicecall = function($event, $operation, $data) {
    /*    $scope.liveform1Beforeservicecall = function($data, $event) {
            function isValidData($data) {
                //restrict password to be minimum of 6 characters

                if ($data.sex.dataValue === "Male") {
                    return isValidData($data);
                } else if ($data.sex.dataValue === "Female") {
                    return isValidData($data);
                } else {
                    return {
                        'input error': "Male or Female"
                    };
                }
            }
        };
        */
    //};

    /*
            $scope.PatientsLiveForm1Success = function ($event, $operation, $data) { 
     $scope.Variables.PatientsData.getData();
     $scope.Variables.patient.getData();
     $scope.Variables.PatientsData.getData
            };
     
        */

}]);



Application.$controller("PatientsLiveForm1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("Patient_ReadTableController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);