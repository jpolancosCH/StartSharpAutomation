# author: Julian Esteban Polanco Sogamoso
# language: en

@regression
Feature: Meetings and business units
  As a user I want to be able to create meetings and business units

  Background: login
    Given Than I am on the login page
    When Enter my username and password, and click login button
      | username | password |
      | admin    | serenity |


  @insert_business_units
  Scenario Outline: Insert business units
    Given Than I am on the business units page and click on the new button
    When I enter the business unit data
      | name   | parentUnit   |
      | <name> | <parentUnit> |
    Then I should see the business unit list data
      | name   |
      | <name> |
    Examples:
      | name   | parentUnit |
      | Unit 4 | Acme Corp. |


  @insert_meeting
  Scenario Outline: Insert meeting
    Given Than I am on the meeting page and click on the new button
    When I enter the meting data
      | name   | type   | number   | startDate   | startTime   | endDate   | endTime   | location   | businessUnit   | organizer   | reporter   | attendees   |
      | <name> | <type> | <number> | <startDate> | <startTime> | <endDate> | <endTime> | <location> | <businessUnit> | <organizer> | <reporter> | <attendees> |
    Then I should see the meeting list data
      | name   |
      | <name> |
    Examples:
      | name      | type               | number | startDate  | startTime | endDate    | endTime | location | businessUnit | organizer       | reporter        | attendees    |
      | Meting 23 | Board of Directors | 1      | 10/14/2022 | 08:00     | 10/14/2022 | 20:15   | On Site  | Acme Corp.   | Eleanor Jenkins | Joseph Thompson | Adam Stewart |
