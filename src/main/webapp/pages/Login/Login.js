Application.$controller("LoginPageController", ["$scope",
    function($scope) {
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

        $scope.loginButtonClick = function($event, $isolateScope) {


            //$scope.Variables.newSession.insertRecord();

        };





        $scope.button5Click = function($event, $isolateScope) {
            $scope.Variables.shareCode.dataValue = Math.floor(Math.random() * 1000000);
            console.log("ShareCode " + $scope.Variables.shareCode.dataValue);
        };

    }
]);

Application.$controller("loginFormController", ["$scope",
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

Application.$controller("pagedialog3Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("dialog2Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;

        $scope.text6Blur = function($event, $isolateScope) {
            if ($scope.Widgets.text5.datavalue !== $scope.Widgets.text6.datavalue) {
                $scope.Widgets.message1.type = "error";
                $scope.Widgets.message1.caption = "Password Mismatch - please re-input password";
                $scope.Widgets.message1.show = true;
            } else {
                $scope.Widgets.message2.show = false;
            }

        };

    
        $scope.text5Blur = function ($event, $isolateScope) { 

        };
 
    }
]);