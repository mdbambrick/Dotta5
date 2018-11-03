Application.$controller("Seasonal_MonthsPageController", ["$scope", function($scope) {
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


}]);