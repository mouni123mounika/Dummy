Feature: Creating a Account
  This feature will test account creation for a person

  @execute
  Scenario: User will try to create a account with invalid set of information
    Given User is on personal Details Form page
    When User select 'Next' link without entering 'FirstName'
    Then 'Please fill the First Name' message should display
    When User select 'Next' link without entering 'LastName'
    Then 'Please fill the Last Name' message should display
    When User select 'Next' link without entering 'Email'
    Then 'Please fill the Email' message should display
    When User select 'Next' link after entering invalid 'Email' address
    Then 'Please enter valid Email Id.' message should display
    When User select 'Next' link without entering 'Contact No'
    Then 'Please fill the Contact No.' message should display
    When User select 'Next' link after entering invalid 'Contact No'
    Then 'Please enter valid Contact no.' message should display
    When User select 'Next' link without selecting  'Address'
    Then 'Please fill the Line one' message should display
    And 'Please fill the Line Two' message should display
    When User select 'Next' link without selecting  'City'
    Then 'Please select city' message should display
    When User select 'Next' link without selecting  'State'
    Then 'Please select state' message should display

  @execute
  Scenario: User will try to create a account with Valid set of information
    Given User is on personal Details Form page
    When User select 'Next' link after entering Valid set of information
    Then 'Personal details are validated and accepted successfully' message should display

  @execute
  Scenario: User will try to create a account with invalid set of information
    Given User is on Educational Details Form page
    When User select 'Register Me' link without entering 'Graduation'
    Then 'Please Select Graduation' message should display
    When User select 'Register Me' link without entering 'Percentage'
    Then 'Please fill Percentage detail' message should display
    When User select 'Register Me' link without entering 'Passing Year'
    Then 'Please fill Passing Year' message should display
    When User select 'Register Me' link without entering 'Project Name'
    Then 'Please fill Project Name' message should display
    When User select 'Register Me' link without entering 'Technologies used'
    Then 'Please Select Technologies Used' message should display
    When User select 'Register Me' link without entering 'Other Technologies'
    Then 'Please fill other Technologies Used' message should display

  @execute
  Scenario: User will try to create a account with Valid set of information
    Given User is onEducational Details Form page
    When User select 'Register Me' link after entering Valid set of information
    Then 'Your Registration Has succesfully done Plz check you registerd email for account activation link !!!' message should display
