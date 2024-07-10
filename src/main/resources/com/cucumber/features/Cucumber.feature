@SmokeTest
Feature: Cucumber

  Scenario Outline: Basic scenario [<localization>]
    When I set value to <value>
    Then I verify that it's even

    Examples:
      | value |
      | 1     |
      | 2     |
      | 3     |
      | 4     |