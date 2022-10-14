# author: Julian Esteban Polanco Sogamoso
# language: en

@regression
Feature: Login
  As a user I want to login to the application

  @successful_login
  Scenario: Successful login
    Given Than I am on the login page
    When Enter my username and password, and click login button
      | username | password |
      | admin    | serenity |
    Then I should see the success login message
      | successMessage |
      | Dashboard      |

  @unsuccessful_login
  Scenario Outline: Unsuccessful login
    Given Than I am on the login page
    When Enter my username and password, and click login button
      | username   | password   |
      | <username> | <password> |
    Then I should see the error login message
      | errorMessage   |
      | <errorMessage> |
    Examples:
      | username | password | errorMessage                                                                          |
      | admin    |          | Please validate empty or invalid inputs (marked with red) before submitting the form. |
      |          | serenity | Please validate empty or invalid inputs (marked with red) before submitting the form. |
      |          |          | Please validate empty or invalid inputs (marked with red) before submitting the form. |
      | admin    | 123      | Invalid username or password!                                                         |