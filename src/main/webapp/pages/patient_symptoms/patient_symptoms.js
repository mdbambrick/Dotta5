Application.$controller("patient_symptomsPageController", ["$scope", function($scope) {
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

        console.log("patient id from Dash_Clinician page: " + $scope.pageParams.patient_id);
        /* 
        //parseInt($scope.Variables.loggedInUser.dataSet.id)
        //   $scope.Variables.loggedInUser.getData();
        $scope.Variables.PatientRead.setInput({
            "patientId": $scope.pageParams.patient_id
        });
        $scope.Variables.PatientRead.invoke();
*/

        var sv = $scope.Variables.PatientRead;
        sv.setInput({
            "patientId": $scope.pageParams.patient_id
        });
        sv.invoke();

    };



}]);
/*
$scope.executePatientReadTable1Datarender = function($isolateScope, $data) {

    $scope.Variables.patient.dataSet.dataValue = $scope.Widgets.executePatientReadTable1.dataset.content[0].patientId;
    $scope.Variables.session.dataSet.dataValue = $scope.Widgets.executePatientReadTable1.dataset.content[0].sessionId;

    $scope.Variables.patientFName.dataSet.dataValue = $scope.Widgets.executePatientReadTable1.dataset.content[0].firstName;
    $scope.Variables.patientLName.dataSet.dataValue = $scope.Widgets.executePatientReadTable1.dataset.content[0].lastName;

    console.log("patientId (patient.dataSet.dataValue): " + $scope.Variables.patient.dataSet.dataValue);
    console.log("sessionId(session.dataSet.dataValue): " + $scope.Variables.session.dataSet.dataValue);

    console.log("patient First Name (patientFName.dataSet.dataValue): " + $scope.Variables.patientFName.dataSet.dataValue);
    console.log("patient Last Name (patientLName.dataSet.dataValue): " + $scope.Variables.patientLName.dataSet.dataValue);

    //PT FWD: Remove redundant Tracker variable and unnecessary repeat of the Data Table run, to improve elegance.
    //Issue resolved - could not use Table data until set-up complete - so tied Datarender event.
};
*/








Application.$controller("pagedialog1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("PatientSymptomsByAllergyFilter1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);



Application.$controller("executePatientReadTable1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);



Application.$controller("PatientSymptomsWithAuthorFilter1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("livefilter1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);


Application.$controller("Table1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
        $scope.evaluate = function(row) {
            if (row.datetime) {
                var dateString = moment.utc(row.datetime).format("YYYY-MM-DD HH:mm:ss");
                console.log(dateString);
                return dateString;
            }
        }
    }
]);

Application.$controller("pagedialog2Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);