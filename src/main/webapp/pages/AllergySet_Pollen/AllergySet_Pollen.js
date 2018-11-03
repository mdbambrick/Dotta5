Application.$controller("AllergySet_PollenPageController", ["$scope", function($scope) {
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

    $scope.grass_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 19
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Grass Pollen"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.grass_switch.datavalue;
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

    $scope.pine_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 68
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Pine"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.pine_switch.datavalue;
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


    $scope.birch_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 69
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Birch"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.birch_switch.datavalue;
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


    $scope.alder_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 70
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Alder"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.alder_switch.datavalue;
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

    $scope.beech_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 70
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Beech"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.beech_switch.datavalue;
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


    $scope.cedar_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 71
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Cedar"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.cedar_switch.datavalue;
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


    $scope.hazel_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 72
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Hazel"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.hazel_switch.datavalue;
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


    $scope.chestnut_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 73
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Horse Chestnut"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.chestnut_switch.datavalue;
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


    $scope.willow_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 74
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Willow"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.willow_switch.datavalue;
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


    $scope.poplar_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 75
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Poplar"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.poplar_switch.datavalue;
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


    $scope.plane_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 76
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Plane"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.plane_switch.datavalue;
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


    $scope.lime_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 77
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Lime"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.lime_switch.datavalue;
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


    $scope.olive_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 78
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Olive"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.olive_switch.datavalue;
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


    $scope.ragweed_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 79
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Ragweed"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.ragweed_switch.datavalue;
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


    $scope.plantain_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 80
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Plantain"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.plantain_switch.datavalue;
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


    $scope.nettle_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 81
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Nettles"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.nettle_switch.datavalue;
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


    $scope.mugwort_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 82
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Mugwort"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.mugwort_switch.datavalue;
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


    $scope.sorrel_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 83
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Sorrel"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.sorrel_switch.datavalue;
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


    $scope.dock_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 84
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Dock Leaves"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.dock_switch.datavalue;
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


    $scope.balsam_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 85
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Balsam of Peru"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.balsam_switch.datavalue;
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


    $scope.unknown_pollen_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 1009
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Unknown, Other or All Pollen"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.unknown_pollen_switch.datavalue;
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