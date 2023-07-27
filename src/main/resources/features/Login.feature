Feature: As a user i have be able to login so that i can see home screen

  @Login
    Scenario: As a user i can login so i can see home screen
    Given user on login page for login
    When user input valid username for login
    And user input valid password for login
    And user click login button for login
    Then user see home screen

  @InvalidLogin
  Scenario: As a user i cant login because i input invalid password
    Given user on login page
    When user input valid username
    And user input invalid password
    And user click login button
    Then user see error message "Wrong Email or Password"

    @Register
    Scenario: As a user i cant login because i input invalid password
      Given user on login page for register
      When user click create one for register
      And user input name for register
      And user input email for register
      And user input password
      And user input confirm password
      And user click resgister button
      Then user see success message "Registration Successful"

  @InvalidRegistName
  Scenario: As a user i cant register because i input invalid email
    Given user on login page for invalid register
    When user click create one for invalid register
    And user input empety name for invalid register
    And user input valid email for invalid register
    And user input password for invalid register
    And user input confirm password for invalid register
    And user click resgister button for invalid register
    Then user see error message on name field "Enter Full Name"

  @InvalidRegistEmail
  Scenario: As a user i cant register because i input invalid email
    Given user on login page for invalid register by email
    When user click create one for invalid register by email
    And user input name for invalid register by email
    And user input invalid email
    And user input password for invalid register by email
    And user input confirm password for invalid register by email
    And user click resgister button for invalid register by email
    Then user see error message on email field "Enter Valid Email"

  @InvalidRegistPassword
  Scenario: As a user i cant register because i input invalid confirm password
    Given user on login page for invalid register by confirm password
    When user click create one for invalid register by confirm password
    And user input name for invalid register by confirm password
    And user input email for invalid register by confirm password
    And user input password for invalid register by confirm password
    And user input invalid confirm password
    And user click resgister button for invalid register by confirm password
    Then user see error message on confirm password field "Password Does Not Matches"