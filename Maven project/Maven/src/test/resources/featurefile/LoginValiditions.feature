Feature: Validate the login functionality  of an application
@TS01 @Regression Test @alpa @LoginTest
  Scenario: To validate the error message
    Given   User launch the browser and navigate to the URL
    When User enter the username "user1" and password "123"
    And User clicks the login button
    Then Validate the error message

@TS02 @SmokeTest @RegressionTest @LoginTest
  Scenario: User Validate the login functionality  of an application

    Given User navigates to Salesforce application
    When User enters the username "user2"and password "abc"
    And User clicks the login button
    Then Validate Whether the user navigates to homepage


    Scenario Outline: Multiple user validation

      @TS03
      Given User launch the browser and navigate to the URL
      When User enter the username "<User Name>"and password "<Password>"
      And User clicks the login button
      Then Validate Whether the user navigates to homepage
      Examples:
        | User Name | Password |
        | US1       | 123      |
        | Preethi   | abc      |
        | Demo      | xyz      |




