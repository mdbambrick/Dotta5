Application.$controller("Dash_PatientPageController", ["$scope", function($scope) {
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
        $scope.Variables.loggedInUser.getData();
        //$scope.Variables.newSession.insertRecord();
        $scope.Variables.TrackRead.setInput({
            "user_id": parseInt($scope.Variables.loggedInUser.dataSet.id)
        });
        $scope.Variables.TrackRead.invoke();
        console.log("user_id (loggedInUser.dataSet.id) " + $scope.Variables.loggedInUser.dataSet.id);
        // console.log("PatientData: " + $scope.Variables.PatientData.dataSet.id);
    };


    $scope.registration_buttonClick = function($event, $isolateScope) {


    };


    $scope.TrackReadTable_DashDatarender = function($isolateScope, $data) {

        $scope.Variables.patient.dataSet.dataValue = $scope.Widgets.TrackReadTable_Dash.dataset.content[0].patientId;
        $scope.Variables.session.dataSet.dataValue = $scope.Widgets.TrackReadTable_Dash.dataset.content[0].sessionId;
        console.log("patientId (patient.dataSet.dataValue): " + $scope.Variables.patient.dataSet.dataValue);
        console.log("sessionId(session.dataSet.dataValue): " + $scope.Variables.session.dataSet.dataValue);
        $scope.Variables.patientFName.dataSet.dataValue = $scope.Widgets.TrackReadTable_Dash.dataset.content[0].firstName;
        $scope.Variables.patientLName.dataSet.dataValue = $scope.Widgets.TrackReadTable_Dash.dataset.content[0].lastName;
        console.log("patient First Name (patientFName.dataSet.dataValue): " + $scope.Variables.patientFName.dataSet.dataValue);
        console.log("patient Last Name (patientLName.dataSet.dataValue): " + $scope.Variables.patientLName.dataSet.dataValue);
        //PT FWD: Remove redundant Tracker variable and unnecessary repeat of the Data Table run, to improve elegance.
        //Issue resolved - could not use Table data until set-up complete - so tied Datarender event.
    };

}]);

Application.$controller("TrackReadTable_DashController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("pagedialog1Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);