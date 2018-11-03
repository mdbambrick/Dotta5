Application.$controller("Detective_FoodPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
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
        addNextButtonListener();
    };

    function addNextButtonListener() {
        $scope.Widgets.Food_wizard.$element.find('[name=nextBtn_Food_wizard]').click(function() {
            var activeStepEl = $scope.Widgets.Food_wizard.$element.find('.app-wizard-step.current'),
                parent = activeStepEl.parent(),
                noOfSteps = parent.find('.app-wizard-step').length,
                eachStepWidth = parseInt(activeStepEl.css('width')),
                currentStepID = activeStepEl.data('step-id'),
                offsetWidth = parent[0].offsetWidth,
                screenFixture = offsetWidth / eachStepWidth,
                scrollValue,
                screenWidthRatio = (Math.round((currentStepID + 1) / screenFixture));
            // check if element is in viewport
            if (!isElementInViewport(activeStepEl[0])) {
                if ((noOfSteps - currentStepID + 1) < screenFixture) {
                    scrollValue = (eachStepWidth * noOfSteps - currentStepID + 1);
                } else {
                    scrollValue = (offsetWidth * screenWidthRatio) - eachStepWidth;
                }
                parent.animate({
                    scrollLeft: scrollValue
                });
            }
            if (currentStepID === 1) {
                addPrevButtonListener();
            }
        });
    }

    function addPrevButtonListener() {
        $scope.Widgets.Food_wizard.$element.find('[name=previousBtn_Food_wizard]').click(function() {
            var activeStepEl = $scope.Widgets.Food_wizard.$element.find('.app-wizard-step.current'),
                parent = activeStepEl.parent(),
                noOfSteps = parent.find('.app-wizard-step').length,
                eachStepWidth = parseInt(activeStepEl.css('width')),
                currentStepID = activeStepEl.data('step-id'),
                offsetWidth = parent[0].offsetWidth;
            // check if element is in viewport
            if (!isElementInViewport(activeStepEl[0])) {
                parent.animate({
                    scrollLeft: '-=' + (offsetWidth - eachStepWidth)
                });
            }
            if (currentStepID === (noOfSteps - 2)) {
                addNextButtonListener();
            }
        });
    }

    function isElementInViewport(el) {
        var rect = el.getBoundingClientRect(),
            windowHeight = (window.innerHeight || document.documentElement.clientHeight),
            windowWidth = (window.innerWidth || document.documentElement.clientWidth);
        return (
            (rect.left >= 0) &&
            (rect.top >= 0) &&
            ((rect.left + rect.width) <= windowWidth) &&
            ((rect.top + rect.height) <= windowHeight)
        );
    }

}]);