Feature: Validate the Adactin Hotel

  Scenario Outline: Validating the page navigating to select hotel page
    Given User should enter "<username>","<password>" and click the login button
    When User should enter the "<location>","<Hotel>","<Number of rooms>","<Room type>","<check in date>","<check out date>","<adult per room>","<childern per room>" and click the search button
    Then User should validate that page should navigate to "Select Hotel"

    Examples: 
      | username   | password | location | Hotel       | Room type | Number of rooms | check in date | check out date | adult per room | childern per room |
      | naveen1612 | 3TGGMW   | Sydney   | Hotel Creek | Standard  | 1 - One         | 11/08/2021    | 21/08/2021     | 2 - Two        | 1 - One           |

  Scenario Outline: Validate the page navigating to select hotel page using only mandatory field
    Given User should enter "<username>","<password>" and click the login button
    When User should enter the "<location>","<Number of rooms>","<check in date>","<check out date>","<adult per room>" and click search button
    Then User should validate that page should navigate to "Select Hotel"

    Examples: 
      | username   | password | location | Number of rooms | check in date | check out date | adult per room |
      | naveen1612 | 3TGGMW   | Sydney   | 1 - One         | 11/08/2021    | 21/08/2021     | 2 - Two        |

  Scenario Outline: Validate the page navigating to select hotel with only check in and check out date
    Given User should enter "<username>","<password>" and click the login button
    When User should enter the "<location>","<check in date>","<check out date>" and click search button
    Then User should validate the "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date" messages is displayed.

    Examples: 
      | username   | password | location | check in date | check out date |
      | naveen1612 | 3TGGMW   | Sydney   | 21/08/2021    | 11/08/2021     |

  Scenario Outline: Validate the page navigating to select hotel without entering any field
    Given User should enter "<username>","<password>" and click the login button
    When User should click the search button
    Then User should validate the "Please Select a Location" message is displayed.

    Examples: 
      | username   | password |
      | naveen1612 | 3TGGMW   |
