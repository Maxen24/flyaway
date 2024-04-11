Feature: Functionality of Booking Flight
  I want to use this template for my feature file


  @Regression
  Scenario Outline: To Test the Functionality of Booking Flight
    Given User do the registration using "<email_id>","<pwd>","<pwd2>","<name>","<address>","<city>"
    And   User login with registration credentials using "<email_id>", "<pwd>"
    When  User search the flight
    Then  User Book the flight 

    Examples: 
      | email_id        | pwd | pwd2 |name |  address    | city    |
      | name1@name1.com |name1|name1 |name1|name1 address|Bangalore|