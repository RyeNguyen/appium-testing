Feature: Get an ebook from a Telegram's bot

  Scenario: Sign in using phone number
  As a user I should be able to navigate to a page with text field
  to type my phone number when I try to register myself in Telegram

    When  I launch Telegram
    And  I click on the Sign in button
    And A popup will appear and I click OK
    Then  I choose my country
    And I press on Search button
    Then I type "vie"
    And I choose "Vietnam"
    Then I should see my area code as "84"
    Then I type my phone number as "0973642872"
    And I press the continue button
    Then I am navigated to validation screen
    And I type my validation code
    Then I should see a popup appear and I choose CONTINUE
    And Telegram will ask me some permissions but I choose NOT NOW
    Then I press on Search button
    And I type "lib"
    Then I choose to chat with 1library bot in Telegram
    And I type "/help" to know which commands can I use with this bot
    Then I press Send
    And After reading the instruction I type my favorite author "J.K.Rowling"
    And I press Send
    Then I press the Next button to find my desired book
    And I should be able to find my favorite book that contains the "Phoenix" word
    Then I press on the link to my book
    And Bot will show me the description and I want to read the full one
    Then I press the ebook file that Bot sent me

  Scenario: Change Telegram's theme to dark mode with new background

    When I launch Telegram
    And  I click on the Sign in button
    And A popup will appear and I click OK
    Then  I choose my country
    And I press on Search button
    Then I type "vie"
    And I choose "Vietnam"
    Then I should see my area code as "84"
    Then I type my phone number as "0973642872"
    And I press the continue button
    Then I am navigated to validation screen
    And I type my validation code
    Then I should see a popup appear and I choose CONTINUE
    And Telegram will ask me some permissions but I choose NOT NOW
    Then I press the hamburger button
    And I press "Settings"
    Then I press "Chat Settings"
    And I pick my theme as "Dark" mode
    Then I choose my accent color
    And I press "Change Chat Background"
    Then I choose my favorite background
    And I press "SET BACKGROUND"
    Then I should be able to return to the chat settings page