Application.$controller("RegistrationPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    // $scope.Variables.shareCode.dataValue = Math.floor(Math.random() * 1000000);
    console.log("ShareCode " + $scope.Variables.shareCode.dataValue);

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
        $scope.Widgets.text8.datavalue = $scope.Variables.shareCode.dataValue;
        console.log("text8" + $scope.Widgets.text8.datavalue);
        $scope.button1Click = function($event, $isolateScope) {
            /*
                                var patt = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;
                                var str = $scope.Widgets.text7.datavalue;
                                var n = str.includes("@");
                                if (n === false) {
                                    $scope.Widgets.message5.type = "error";
                                    $scope.Widgets.message5.caption = "Check email address; must include @";
                                    $scope.Widgets.message5.show = true;



                                } else if (patt.test($scope.Widgets.text5.datavalue === false)) {
                                    $scope.Widgets.message5.type = "error";
                                    $scope.Widgets.message5.caption = "Password invalid, 8 characters needed, including upper case, lower case and special, (such as !£$%^&)";
                                    $scope.Widgets.message5.show = true;
                                }
                                //Above regexp didn't work, but for now just do length check.
                                else if ($scope.Widgets.text5.datavalue.length < 8) {
                                    $scope.Widgets.message5.type = "error";
                                    $scope.Widgets.message5.caption = "Password invalid, 8 characters needed, including upper case, lower case and special, (such as !£$%^&)";
                                    $scope.Widgets.message5.show = true;
                                } else if ($scope.Widgets.text1.datavalue === "" || $scope.Widgets.text1.datavalue === null) {
                                    $scope.Widgets.message5.type = "error";
                                    $scope.Widgets.message5.caption = "Please input a UserName - email address is a common choice, because it's unique yet memorable.";
                                    $scope.Widgets.message5.show = true;
                                } else if ($scope.Widgets.text1.datavalue.length < 7) {
                                    $scope.Widgets.message5.type = "error";
                                    $scope.Widgets.message5.caption = "Username too short - try again, with at least 7 characters";
                                    $scope.Widgets.message5.show = true;
                                } else if ($scope.Widgets.select2.datavalue === "" || $scope.Widgets.select2.datavalue === null) {
                                    $scope.Widgets.message5.type = "error";
                                    $scope.Widgets.message5.caption = "Select User-type";
                                    $scope.Widgets.message5.show = true;
                                } else if ($scope.Widgets.select2.datavalue != 1 && $scope.Widgets.select2.datavalue != 4) {
                                    $scope.Widgets.message5.type = "error";
                                    $scope.Widgets.message5.caption = "User-type unavailable";
                                    $scope.Widgets.message5.show = true;
                                } else if ($scope.Widgets.select2.datavalue == 4 && $scope.Widgets.passCodeText.datavalue !== 997243) {
                                    $scope.Widgets.message5.type = "error";
                                    $scope.Widgets.message5.caption = "Passcode incorrect";
                                    $scope.Widgets.message5.show = true;
                                } else if ($scope.Widgets.text5.datavalue === $scope.Widgets.text6.datavalue) {

                                } else {
                                    $scope.Widgets.message5.type = "error";
                                    $scope.Widgets.message5.caption = "Password Mismatch - please re-input password";
                                    $scope.Widgets.message5.show = true;
                                }
            */


            // $scope.Variables.RegVar.insertRecord();
        };

        /* $scope.RegVaronSuccess = function(variable, data, options) {
             $scope.Widgets.message6.type = "success";
             $scope.Widgets.message6.caption = "Registration Successful, Returning to LogIn...";
             $scope.Widgets.message6.show = true;
             $scope.Actions.navigationPreviousPage.invoke();

         };
         */
        $scope.select2Blur = function($event, $isolateScope) { //usertype
            $scope.Widgets.text1.datavalue = $scope.Widgets.text7.datavalue;

            console.log("username" + $scope.Widgets.text1.datavalue)
            if ($scope.Widgets.select2.datavalue === "" || $scope.Widgets.select2.datavalue === null) {
                $scope.Widgets.message4.type = "error";
                $scope.Widgets.message4.caption = "Select User-type";
                $scope.Widgets.message4.show = true;
                /*  } else if ($scope.Widgets.select2.datavalue === 1 || $scope.Widgets.select2.datavalue === 4)
      
                  $scope.Widgets.message4.type = "error";
                  $scope.Widgets.message4.caption = "User-type unavailable";
                  $scope.Widgets.message4.show = true;#
                  */
            } else if ($scope.Widgets.select2.datavalue == 4) {
                $scope.Widgets.compositePasscode.show = true;
                $scope.Widgets.message4.type = "warning";
                $scope.Widgets.message4.caption = "Input passcode for proposed user-type";
                $scope.Widgets.message4.show = true;

            } else if ($scope.Widgets.select2.datavalue !== 1) {
                $scope.Widgets.message4.type = "error";
                $scope.Widgets.message4.caption = "User-type unavailable";
                $scope.Widgets.message4.show = true;


            } else $scope.Widgets.message4.show = false;
        };

        /*
    $scope.text1Mouseleave = function($event, $isolateScope) { //username
      
        if ($scope.Widgets.text1.datavalue === "" || $scope.Widgets.text1.datavalue === null) {
            $scope.Widgets.message1.type = "error";
            $scope.Widgets.message1.caption = "Please input a UserName - email address is a common choice, because it's unique yet memorable.";
            $scope.Widgets.message1.show = true;
        } else
        if ($scope.Widgets.text1.datavalue.length < 7) {
            $scope.Widgets.message1.type = "error";
            $scope.Widgets.message1.caption = "Username too short - try again, with at least 7 characters";
            $scope.Widgets.message1.show = true;
        }
*/





        $scope.text6Blur = function($event, $isolateScope) { //confirm password

            if ($scope.Widgets.text5.datavalue !== $scope.Widgets.text6.datavalue) {
                $scope.Widgets.message2.type = "error";
                $scope.Widgets.message2.caption = "Password Mismatch - please re-input password";
                $scope.Widgets.message2.show = true;
            } else {
                $scope.Widgets.message2.show = false;
            }

        };


        $scope.text7Blur = function($event, $isolateScope) { //email
            /*
            var str = $scope.Widgets.text7.datavalue;
            var n = str.includes("@");
            if (n === false) {
                $scope.Widgets.message3.type = "error";
                $scope.Widgets.message3.caption = "Check email address; must include @";
                $scope.Widgets.message3.show = true;

            } else {
                $scope.Widgets.message3.show = false;
            }
            */

        };






        $scope.text5Blur = function($event, $isolateScope) {

            if ($scope.Widgets.text5.datavalue.length < 8) {
                $scope.Widgets.message1.type = "error";
                $scope.Widgets.message1.caption = "Password invalid, 8 characters needed, including upper case, lower case and special, (such as !£$%^&)";
                $scope.Widgets.message1.show = true;
            } else {
                $scope.Widgets.message1.show = false;
            }
        };


        $scope.text3Blur = function($event, $isolateScope) {

        };


        $scope.passCodeTextBlur = function($event, $isolateScope) {
            if ($scope.Widgets.select2.datavalue == 4 && $scope.Widgets.passCodeText.datavalue !== 997243) {
                $scope.Widgets.message4.type = "error";
                $scope.Widgets.message4.caption = "Passcode incorrect";
                $scope.Widgets.message4.show = true;
            } else $scope.Widgets.message4.type = "success";
            $scope.Widgets.message4.caption = "Passcode correct";
            $scope.Widgets.message4.show = true;
        };
    };

    $scope.SendEmailonError = function(variable, data, options) {
        $scope.Widgets.message1.type = "error";
        $scope.Widgets.message1.caption = " Error: Email not sent";
        $scope.Widgets.message1.show = true;

    };

    $scope.SendEmailonSuccess = function(variable, data, options) {
        $scope.Widgets.message1.type = "sucess";
        $scope.Widgets.message1.caption = "Email sent";
        $scope.Widgets.message1.show = true;

    };


    $scope.button2Click = function($event, $isolateScope) {
        $scope.Variables.RegVar.insertRecord();
    };

}]);


Application.$controller("dialog1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);