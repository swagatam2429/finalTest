Feature: Test Youtube
Scenario: open youtube and check the search button
Given open firefox and go to youtube
When search for the search button
Then we are able to find the button
And close the browser

