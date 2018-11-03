Application.$controller("AllergySet_AnimalsPageController", ["$scope", function($scope) {
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

    $scope.cat_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 21
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Cats"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.cat_switch.datavalue;
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

    $scope.dog_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 22
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Dogs"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.dog_switch.datavalue;
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

    $scope.rabbit_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 86
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Rabbit"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.rabbit_switch.datavalue;
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


    $scope.hamster_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 87
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Hamster"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.hamster_switch.datavalue;
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


    $scope.horse_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 89
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Horse"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.horse_switch.datavalue;
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


    $scope.hen_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 92
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Hen"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.hen_switch.datavalue;
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


    $scope.cow_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 88
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Cow"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.cow_switch.datavalue;
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


    $scope.sheep_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 90
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Sheep"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.sheep_switch.datavalue;
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


    $scope.pig_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 91
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Pig"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.pig_switch.datavalue;
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


    $scope.unknown_animal_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 1010
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Other/Unknown Animal"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.unknown_animal_switch.datavalue;
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

Application.$controller("dialog1Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);