Application.$controller("SymptomSurveyPageController", ["$scope", function($scope) {
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
        $scope.Variables.TrackRead.setInput({
            "user_id": parseInt($scope.Variables.loggedInUser.dataSet.id)
        });
        $scope.Variables.TrackRead.invoke();
        // console.log("Tracker data: " + $scope.Variables.Tracker.dataSet)
        $scope.Variables.AllergyNumber.getData();
        $scope.Variables.AllergyName.getData();
        $scope.Variables.Category.getData();
        $scope.Variables.Allergy_Amount_General.getData();

        console.log("Category " + $scope.Variables.Category.dataSet.dataValue);
        if ($scope.Variables.Category.dataSet.dataValue === 1) {
            $scope.Widgets.compositeSeasonal.show = false;
            $scope.Widgets.compositeFrequency.show = false;
            $scope.Widgets.compositeLocations.show = false;
            $scope.Widgets.compositeLocationsHeader.show = false;
            $scope.Variables.Allergy_Amount.dataSet = $scope.Variables.Allergy_Amount_Food.dataSet;
        } else {
            $scope.Widgets.compositeSeasonal.show = true;
            $scope.Widgets.compositeFrequency.show = true;
            $scope.Widgets.compositeLocations.show = true;
            $scope.Widgets.compositeLocationsHeader.show = true;
            $scope.Variables.Allergy_Amount.dataSet = $scope.Variables.Allergy_Amount_General.dataSet;
        }

    };


    $scope.hive_switchChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 1;

        //$scope.Widgets.hive_switch.datavalue;
        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.flush_switchChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 2;

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.tongue_switchChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 3;

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.puffy_switchChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 4; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.lips_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 5; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.teary_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 6; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.runny_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 8; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.wheeze_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 10; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.sneezing_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 12; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.sleep_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 14; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.toggle11Change = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 16; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.breathing_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 18; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.vomit_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 20; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.diarrhoea_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 22; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.bloat_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 24; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.bruising_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 26; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.dizzy_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 28; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.mood_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 30; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.fever_toggleChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 35; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    /* $scope.age_sliderChange = function($event, $isolateScope, newVal, oldVal) {
         $scope.Variables.patient.getData();
         $scope.Variables.session.getData();

         var symptom_id = 80;

         console.log(newVal);
         console.log(symptom_id);
         $scope.Variables.AddSymptom.setInput({
             "result": newVal,
             "patient_id": $scope.Variables.patient.dataSet.dataValue,
             "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
             "symptom_id": symptom_id,
             "session_id": $scope.Variables.session.dataSet.dataValue,
             "data_source": 1,
             "current_status": 1
         });
         $scope.Variables.AddSymptom.invoke();
         console.log("Age Started " + newVal);

         console.log("session: " + $scope.Variables.session.dataSet.dataValue);
         console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
         console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
         console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
         console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
     };*/




    $scope.frequency_radiosetChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 55; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === "every day") {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("every day");

        } else if (newVal === "most weeks") {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("most weeks");

        } else if (newVal === "most months") {

            $scope.Variables.AddSymptom.setInput({
                "result": 3,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("most months");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 4,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("hard to say");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.duration_radiosetChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 60; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === "less than an hour") {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("less than an hour");

        } else if (newVal === "up to a day") {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("up to a day");

        } else if (newVal === "up to a week") {

            $scope.Variables.AddSymptom.setInput({
                "result": 3,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("up to a week");

        } else if (newVal === "constant") {

            $scope.Variables.AddSymptom.setInput({
                "result": 4,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("constant");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 5,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("erratic");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };





    $scope.exposure_radiosetChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 65; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === "trace") {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("trace");

        } else if (newVal === "a small amount") {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("a small amount");

        } else if (newVal === "a medium amount") {

            $scope.Variables.AddSymptom.setInput({
                "result": 3,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("a medium amount");

        } else if (newVal === "large quantity") {

            $scope.Variables.AddSymptom.setInput({
                "result": 4,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("large quantity");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 5,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("erratic");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.onset_radiosetChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 75; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === "less than a minute") {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("less than a minute");

        } else if (newVal === "up to 15 minutes") {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("up to 15 minutes");

        } else if (newVal === "up to one hour") {

            $scope.Variables.AddSymptom.setInput({
                "result": 3,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("up to one hour");

        } else if (newVal === "less than 4 hours") {

            $scope.Variables.AddSymptom.setInput({
                "result": 4,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("less than 4 hours");

        } else if (newVal === "more than 4 hours") {

            $scope.Variables.AddSymptom.setInput({
                "result": 5,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("more than 4 hours");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 6,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("unsure");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };





    $scope.checkbox_homeChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 100;

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };




    $scope.checkbox_workChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 101;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_restaurantChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 102;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_oldChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 103;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_coldChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 104;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_farmChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 105;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_otherChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 120;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_janChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 151;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_febChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 152;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_marChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 153;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_aprChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 154;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_mayChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 155;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_junChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 156;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_julChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 157;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_augChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 158;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_sepChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 159;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_octChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 160;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_novChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 161;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.checkbox_decChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 162;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };
    $scope.checkbox_unseasonalChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 150;


        console.log(newVal);
        console.log(symptom_id);
        if (newVal === true) {

            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is True!");

            $scope.Widgets.checkbox_jan.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 151,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_feb.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 152,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_mar.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 153,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_apr.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 154,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_may.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 155,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_jun.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 156,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_jul.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 157,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_aug.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 158,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_sep.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 159,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_oct.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 160,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_nov.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 161,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_dec.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 162,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.pagedialog1.open();

        } else if (newVal === false) {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("It is False!");

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 2,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Unsure/Don't Know!");

        }

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };


    $scope.text1Change = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 80;

        console.log(newVal);
        console.log(symptom_id);
        $scope.Variables.AddSymptom.setInput({
            "result": newVal,
            "patient_id": $scope.Variables.patient.dataSet.dataValue,
            "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
            "symptom_id": symptom_id,
            "session_id": $scope.Variables.session.dataSet.dataValue,
            "data_source": 1,
            "current_status": 1
        });
        $scope.Variables.AddSymptom.invoke();
        console.log("Age Started " + newVal);

        console.log("session: " + $scope.Variables.session.dataSet.dataValue);
        console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
        console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
        console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
        console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);
    };

    //NEW CODE FOR SEASONALITY WITH RADIO SET
    $scope.seasonality_radiosetChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Variables.patient.getData();
        $scope.Variables.session.getData();

        var symptom_id = 150; //UPDATE

        console.log(newVal);
        console.log(symptom_id);
        if (newVal === "Yes") {
            //update description in database to seasonal, from unseasonal!
            $scope.Variables.AddSymptom.setInput({
                "result": 1,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("Yes");

            $scope.Widgets.pagedialog2.open();

        } else {

            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": symptom_id,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
            console.log("No");



            console.log("session: " + $scope.Variables.session.dataSet.dataValue);
            console.log("Patient No: " + $scope.Variables.patient.dataSet.dataValue);
            console.log("allergy no. " + $scope.Variables.AllergyNumber.dataSet.dataValue);
            console.log("user_id " + $scope.Variables.loggedInUser.dataSet.id);
            console.log("allergy name " + $scope.Variables.AllergyName.dataSet.dataValue);

            //insert - check

            $scope.Widgets.checkbox_jan.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 151,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_feb.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 152,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_mar.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 153,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_apr.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 154,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_may.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 155,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_jun.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 156,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_jul.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 157,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_aug.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 158,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_sep.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 159,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_oct.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 160,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_nov.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 161,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();

            $scope.Widgets.checkbox_dec.datavalue = false;
            $scope.Variables.AddSymptom.setInput({
                "result": 0,
                "patient_id": $scope.Variables.patient.dataSet.dataValue,
                "allergy_id": $scope.Variables.AllergyNumber.dataSet.dataValue,
                "symptom_id": 162,
                "session_id": $scope.Variables.session.dataSet.dataValue,
                "data_source": 1,
                "current_status": 1
            });
            $scope.Variables.AddSymptom.invoke();
        }
        //end insert
    };



    //END NEW CODE


}]);

Application.$controller("TrackReadTableController", ["$scope",
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

Application.$controller("pagedialog2Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);