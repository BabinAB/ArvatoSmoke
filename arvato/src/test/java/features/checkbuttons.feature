@all
@checkbuttons
Feature: Checking Elements from Main page


  @success
  Scenario: Checking buttons from Header of Main page
    Given User is on the Main Page
    When User clicks on CRM & Customer Services in Header
    Then User see CRM & Customer Services page
    When User clicks on IT Development Centre in Header
    Then User see IT Development Centre page
    When User clicks on CRM Open positions in Header
    Then User see CRM Open positions page
    When User clicks on IT Centre Open positions in Header
    Then User see IT Centre Open positions page
    When User clicks on EU Project in Header
    Then User see EU Project page
    When User clicks on Contact in Header
    Then User see Contact page
    When User clicks on Home in Header
    Then User see Home page

    @success
    Scenario: Switch to Estonian version of the Main page
      Given User is on the Main Page
      When User switch to Estonian localization of the home page
      Then User see Estonian version of the Home page


  @success
  Scenario: Checking buttons from Footer of Main page
    Given User is on the Main Page
    When User clicks on CRM & Customer Services in Footer
    Then User see CRM & Customer Services page
    When User click on IT Development Centre in Footer
    Then User see IT Development Centre page
    When User clicks on CRM Open positions in Footer
    Then User see CRM Open positions page
    When User clicks on IT Centre Open positions in Footer
    Then User see IT Centre Open positions page
    When User clicks on EU Project in Footer
    Then User see EU Project page
    When User clicks on Contact in Footer
    Then User see Contact page
    When User clicks on Home in Footer
    Then User see Home page

  @success
  Scenario: Checking buttons from Content of Main page
    Given User is on the Main Page
    When User clicks on CRM & Customer Services in Content
    Then User see CRM & Customer Services page
    And User clicks on Home in Header
    Then User see Home page
    When User clicks on IT Development Centre in Content
    Then User see IT Development Centre page



