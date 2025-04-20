Feature: text Page tests
  This feature file will cover text page related scenarios

  @textPage_Validations
  Scenario: with valid credentials
    Given user is on text box page
    When user clicks on Full Name and enters "Ompalande"
    And user clicks on E-mail and enters "ompalande123@gmail.com"
    And user enters current address "1234, 5th Avenue, New York"
    And user enters password "123456@Example"
    Then user clicks on Submit button
#    And user receives no error message
#    And user takes screenshot