@tag
Feature: Orange HRM Login page
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Test Case One
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

   @smoke
  Scenario Outline: Admin page
    Given Go to login page
    And click on forget password
    And Enter the "username"
    Then click on "Next"
      
   Scenario Outline: Copy of TC1
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