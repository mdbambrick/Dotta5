Application.$controller("Allergy_AeroPageController", ["$scope", function($scope) {
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


    $scope.tree_switchClick = function($event, $isolateScope) {
        var check = $scope.Widgets.tree_switch.datavalue;
        switch (check) {
            case 'yes':
                console.log("It is a Yes!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Pollen.navigate();
                break;
            case 'no':
                console.log("It is No!");
                break;
            case 'maybe':
                console.log("It is Maybe!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Pollen.navigate();
                break;
        }
    };
    $scope.animalgp_switchClick = function($event, $isolateScope) {
        var check = $scope.Widgets.animalgp_switch.datavalue;
        switch (check) {
            case 'yes':
                console.log("It is a Yes!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Animals.navigate();
                break;
            case 'no':
                console.log("It is No!");
                break;
            case 'maybe':
                console.log("It is Maybe!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Animals.navigate();
                break;
        }
    };

    $scope.damp_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 24
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Damp/mouldy atmosphere"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.damp_switch.datavalue;
        switch (check) {
            case 'yes':
                console.log("It is a Yes!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_SymptomSurvey.navigate();
                break;
            case 'no':
                console.log("It is No!");
                break;
            case 'maybe':
                console.log("It is Maybe!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_SymptomSurvey.navigate();
                break;
        }
    };
    $scope.housedust_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 25
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Housedust"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.housedust_switch.datavalue;
        switch (check) {
            case 'yes':
                console.log("It is a Yes!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_SymptomSurvey.navigate();
                break;
            case 'no':
                console.log("It is No!");
                break;
            case 'maybe':
                console.log("It is Maybe!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_SymptomSurvey.navigate();
                break;
        }
    };
    $scope.aero_unknown_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 1002
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Aero, Allergy Unknown"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.aero_unknown_switch.datavalue;
        switch (check) {
            case 'yes':
                console.log("It is a Yes!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_SymptomSurvey.navigate();
                break;
            case 'no':
                console.log("It is No!");
                break;
            case 'maybe':
                console.log("It is Maybe!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_SymptomSurvey.navigate();
                break;
        }

    };

}]);

Application.$controller("pagedialog1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("dialog1Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);