@all
@contact
Feature: Filling form in Contact page


  @success
  Scenario: Filling contact form in Contact page
    When User clicks on Contact in Header
    Then User see Contact page
    And User fills Name field
    And User fills Company field
    And User fills Email field
    And User fills Phone field
    And User fills Message form
    When User clicks on Submit button
    Then User see message of successfully operation

    @fail
    Scenario: Checking errors in Contact page
      When User clicks on Contact in Header
      Then User see Contact page
      When User clicks on Submit button
      Then User see errors on Contact page


  @success
  Scenario: Filling Contact form with parametrized data in Contact page
    When User clicks on Contact in Header
    Then User see Contact page
    And User fills "new test" in Name field
    And User fills "new test" Company field
    And User fills "newtest@test.com" Email field
    And User fills "new test" Phone field
    And User fills "new test" Message form
    When User clicks on Submit button
    Then User see message of successfully operation

    #As you see, we can use quotes in the feature files, and we can add any information inside to make our cases:
  #positive, negative and many others).
  #Adding last scenario and successfully running the test takes me about 4-5 minutes.