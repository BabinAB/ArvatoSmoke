@all
@mobile
@login
Feature: Login to application


  @success
  Scenario: Success Login
    Given User is on mobile login page
    When User clicks on login button
    And User enters "demo" in the username field
    And User enters "demo" in the password field
    And User clicks on Proceed button
    Then User should see OTP page
    And User enters "0000" in the OTP field
    Then User should see MainHomePage
