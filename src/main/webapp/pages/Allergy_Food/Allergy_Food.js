Application.$controller("Allergy_FoodPageController", ["$scope", function($scope) {
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

    $scope.egg_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 2
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Egg"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.egg_switch.datavalue;
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

    $scope.fruit_switchClick = function($event, $isolateScope) {
        var check = $scope.Widgets.fruit_switch.datavalue;
        switch (check) {
            case 'yes':
                console.log("It is a Yes!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Fruit.navigate();
                break;
            case 'no':
                console.log("It is No!");
                break;
            case 'maybe':
                console.log("It is Maybe!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Fruit.navigate();
                break;
        }
    };



    $scope.milk_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 1
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Milk"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.milk_switch.datavalue;
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


    $scope.nutsgp_switchClick = function($event, $isolateScope) {
        var check = $scope.Widgets.nutsgp_switch.datavalue;
        switch (check) {
            case 'yes':
                console.log("It is a Yes!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Nuts.navigate();
                break;
            case 'no':
                console.log("It is No!");
                break;
            case 'maybe':
                console.log("It is Maybe!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Nuts.navigate();
                break;
        }
    };


    $scope.oily_switchClick = function($event, $isolateScope) {
        var check = $scope.Widgets.oily_switch.datavalue;
        switch (check) {
            case 'yes':
                console.log("It is a Yes!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Oilyfish.navigate();
                break;
            case 'no':
                console.log("It is No!");
                break;
            case 'maybe':
                console.log("It is Maybe!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Oilyfish.navigate();
                break;
        }
    };


    $scope.shellfish_switchClick = function($event, $isolateScope) {
        var check = $scope.Widgets.shellfish_switch.datavalue;
        switch (check) {
            case 'yes':
                console.log("It is a Yes!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Shellfish.navigate();
                break;
            case 'no':
                console.log("It is No!");
                break;
            case 'maybe':
                console.log("It is Maybe!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Shellfish.navigate();
                break;
        }
    };


    $scope.soya_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 3
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Soya"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.soya_switch.datavalue;
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



    $scope.wheat_switchClick = function($event, $isolateScope) {
        var check = $scope.Widgets.wheat_switch.datavalue;
        switch (check) {
            case 'yes':
                console.log("It is a Yes!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Wheat.navigate();
                break;
            case 'no':
                console.log("It is No!");
                break;
            case 'maybe':
                console.log("It is Maybe!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Wheat.navigate();
                break;
        }
    };



    $scope.fish_switchClick = function($event, $isolateScope) {
        var check = $scope.Widgets.fish_switch.datavalue;
        switch (check) {
            case 'yes':
                console.log("It is a Yes!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Whitefish.navigate();
                break;
            case 'no':
                console.log("It is No!");
                break;
            case 'maybe':
                console.log("It is Maybe!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_Whitefish.navigate();
                break;
        }
    };



    $scope.other_switchClick = function($event, $isolateScope) {
        var check = $scope.Widgets.other_switch.datavalue;
        switch (check) {
            case 'yes':
                console.log("It is a Yes!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_OtherFood.navigate();
                break;
            case 'no':
                console.log("It is No!");
                break;
            case 'maybe':
                console.log("It is Maybe!");
                // set confidence parameter in database and variable
                $scope.Actions.goToPage_AllergySet_OtherFood.navigate();
                break;
        }
    };


    $scope.unknown_food_switchClick = function($event, $isolateScope) {
        $scope.Variables.Tracker.getData();
        var result = $scope.Variables.Tracker.getData();
        console.log("Tracking data: ", result);
        $scope.Variables.AllergyNumber.setData({
            dataValue: 1001
        });
        //console.log("allergy number: ", AllergyNumber.datavalue);
        $scope.Variables.AllergyName.setData({
            dataValue: "Unknown or Other Food"
        });
        //console.log("allergy name: ", AllergyName.datavalue);

        var check = $scope.Widgets.unknown_food_switch.datavalue;
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