Application.$controller("MedicalHistoryPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block 
    $scope.onPageReady = function() {
        $scope.Variables.patient.getData();
        console.log("patientId pageReady" + $scope.Variables.patient.dataSet.dataValue)
        $scope.Variables.BackgroundRead.setInput({
            "patientId": parseInt($scope.Variables.patient.dataSet.dataValue)
        });
        $scope.Variables.BackgroundRead.invoke();
        console.log("BackgroundRead patientId pageReady" + $scope.Variables.BackgroundRead.dataSet.patientId)
    };


    $scope.BackgroundDataonResult = function(variable, data) {
        $scope.Variables.patient.getData();
        console.log("patientId from model variable: " + $scope.Variables.patient.dataSet.dataValue)
        //$scope.Variables.BackgroundRead.getData();
        console.log("BackgroundRead patientId from pageReady" + $scope.Variables.BackgroundRead.dataSet.patientId)
        $scope.Variables.BackgroundRead.setInput({
            "patientId": parseInt($scope.Variables.patient.dataSet.dataValue)
        });
        $scope.Variables.BackgroundRead.invoke();

        console.log("patientId onResult: " + $scope.Variables.BackgroundRead.dataSet.patientId);

    };
*/
}]);








Application.$controller("medicalHistoryLiveFormController", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);