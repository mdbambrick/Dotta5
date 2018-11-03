Application.$controller("Allergy_InsectsPageController", ["$scope", function($scope) {
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


    $scope.wasp_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 93
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Wasps"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.wasp_switch.datavalue;
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


    $scope.bee_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 94
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Bees"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.bee_switch.datavalue;
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


    $scope.horsefly_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 95
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Horseflies"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.horsefly_switch.datavalue;
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


    $scope.tick_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 96
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Ticks"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.tick_switch.datavalue;
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


    $scope.mosquito_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 97
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Mosquitoes"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.mosquito_switch.datavalue;
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


    $scope.flea_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 98
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Fleas"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.flea_switch.datavalue;
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


    $scope.bedbug_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 99
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Bedbugs"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.bedbug_switch.datavalue;
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


    $scope.ant_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 100
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Ants"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.ant_switch.datavalue;
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


    $scope.spider_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 101
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Spiders"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.spider_switch.datavalue;
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


    $scope.unknown_insect_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 1003
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Unknown or Other Insects"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.unknown_insect_switch.datavalue;
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