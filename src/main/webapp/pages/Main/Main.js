Application.$controller("MainPageController", ["$scope", function ($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function () {
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


	/*
    * This method is called before fetching the records.
    */
    $scope.BackgroundonBeforeListRecords = function(variable, dataFilter, options) {
        var data = variable._downgradeInputData(dataFilter);

        //Please make your changes to the existing old callbacks.
        var response = $scope.BackgroundonBeforeUpdate(variable, data, options);
        if (response === false) {
            return false;
        }
        return variable._upgradeInputData(response, data);
    };

    $scope.BackgroundonBeforeUpdate = function(variable, inputData){
			
	};

}]);

Application.$controller("PatientsLiveForm1Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("BackgroundLiveForm2Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);