@Test
Feature: navigate to www.wsecu.org and validates that when a user inputs a incorrect username into the “Online Banking”  field
  and clicks the “sign In” button, that the user is redirected to the online banking sign in page. Then validate that when a bad password is input into the “Password” field
  and the user clicks “Sign-In”, then a message box pops up that says “Sorry, incorrect username”.

  Scenario: Verify that passing incorrect value in username box will result with redirection to "Online Banking"
    Given User is on the homepage
    When User enters an invalid username
    And User clicks to the Sign In button
    Then Verify that the user is redirected to online banking page


  Scenario Outline: User was directed to Online Banking Sign in page and a username is already written verify that when a invalid password is passed correct error message pups up.
    Given User is on the homepage
    When User enters an invalid username
    And User clicks to the Sign In button
    And User enters an incorrect "<password>"
    Then Verify that a message box pops up that says “Sorry, incorrect username”

    Examples:
    |password|
    |Dummy Password|
    |Dummy Password1|