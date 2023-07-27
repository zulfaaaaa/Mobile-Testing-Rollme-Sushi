Feature: As a cashier i have be able to add new membership

  @AddMembership
  Scenario: As a user i can add product to cart
    Given cashier on onboarding page for add membership
    When cashier click first next button for add membership
    And cashier click next again for add membership
    And cashier input id "CS-01" for add membership
    And cashier input password "cashier" for add membership
    And cashier click login button for add membership
    And cashier click navigation bar
    And cashier click add new membership
    And cashier input name
    And cashier input email
    And cashier input phone number
    And cashier input birthday date
    And cashier click checkbox promo
    And cashier click checkbox invoice
    And cashier click add membership button
    Then cashier direct to navigation menu

  @AddMembershipUncheckPromo
  Scenario: As a user i can add product to cart
    Given cashier on onboarding page for uncheck receive promotional
    When cashier click first next button for uncheck receive promotional
    And cashier click next again for uncheck receive promotional
    And cashier input id "CS-01" for uncheck receive promotional
    And cashier input password "cashier" for uncheck receive promotional
    And cashier click login button for uncheck receive promotional
    And cashier click navigation bar for uncheck receive promotional
    And cashier click add new membership for uncheck receive promotional
    And cashier input name for uncheck receive promotional
    And cashier input email for uncheck receive promotional
    And cashier input phone number for uncheck receive promotional
    And cashier input birthday date for uncheck receive promotional
    And cashier click checkbox invoice for uncheck receive promotional
    And cashier click add membership button for uncheck receive promotional
    Then cashier direct to navigation menu for uncheck receive promotional

