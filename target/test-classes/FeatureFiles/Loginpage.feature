@tag
Feature: Orange HRM Login page
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario
    Given Verify the Sytem Navigated to the login Page
    Given Verify the Username & Password field label Names
    When Verify the Forgotpassword Text is present
    And Verify the site footer is displayed
    And Enter the credentials Username "<Username>" & Password "<Password>"
    When Click on the Login Button
    And Verify the system Navigated to the Orange HRM Home Page

    Examples: 
      | Username | Password |
      | Admin    | admin123 |
