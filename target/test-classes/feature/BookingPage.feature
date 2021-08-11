Feature: Validate the Booking Confirmation in Adactin Hotel

  Scenario Outline: Validating the booking confirmation
    Given User is on login page
    When User enter the valid "<userName>","<password>" and click login button
    And User should enter the "<Location>","<Hotels>","<Room type>","<Number of rooms>","<check in date>","<check out date>","<adults per room>","<children per room>" and click search button
    Then User click the checkbox and Search button
    And User should enter some details like "<First Name>","<Last Name>","<Billing Address>","<credit card no>","<Credit card type>","<expiry month>","<expiry year>","<cvv>" abd click Book Now button
    Then User should validate the "Booking Confirmation" message is displayed

    Examples: 
      | userName   | password | Location | Hotels      | Room type | Number of rooms | check in date | check out date | adults per room | children per room | First Name | Last Name | Billing Address   | credit card no   | Credit card type | expiry month | expiry year | cvv |
      | naveen1612 | 3TGGMW   | Sydney   | Hotel Creek | Standard  | 1 - One         | 21/09/2021    | 25/09/2021     | 2 - Two         | 1 - One           | Naveen     | Velusamy  | Chennimalai,erode | 1234567890123456 | VISA             | December     |        2021 | 123 |

  Scenario Outline: Validating the booking confirmation
    Given User is on login page
    When User enter the valid "<userName>","<password>" and click login button
    And User should enter the "<Location>","<Hotels>","<Room type>","<Number of rooms>","<check in date>","<check out date>","<adults per room>","<children per room>" and click search button
    Then User click the checkbox and Search button
    And User should click the Book Now button
    Then User should validate "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month"and"Please Enter your Credit Card CVV Number" messages is displayed

    Examples: 
      | userName   | password | Location | Hotels      | Room type | Number of rooms | check in date | check out date | adults per room | children per room |
      | naveen1612 | 3TGGMW   | Sydney   | Hotel Creek | Standard  | 1 - One         | 21/09/2021    | 25/09/2021     | 2 - Two         | 1 - One           |
