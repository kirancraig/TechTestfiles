Feature: Check to see if request successfully responded
 Scenario: Response Retrieval from postcode request
  	When I perform the following step:
  			"send GET request to /iptis/rtti with postcode AB107AP"
  	Then the response status should be "200"
 
 
 Scenario: Test that  response contains all nodes
    Given I am an anonymous User
    Then I should be accessing the API successfully
    And I should be able to look for nearest stations list

 Scenario: Check for the  CRS code for each station in the response
 	Given I am an anonymous user
 	When I send an API request with the postcode "AB107AP" 
 	Then I should see that all the "CRS" codes are returned in the response

 Scenario: Verify if the rail stations fall in within the 50miles range in the response
 	Given I send an API request
 	And I get a succesful response
 	Then I verify that all the distances are with the retstricted range of distance which is "50 miles"

Scenario: Make sure COordinates are returned in the API response
	Given I send the API request
	And I get the successful response
	Then I verify that coordinates are not returned empty

Scenario: Verify that CRS codes are only 3 letters
	Given I send the API request
	And I get the successful response
	Then I verify that CRS codes are only 3 letters