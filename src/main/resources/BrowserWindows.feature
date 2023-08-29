
@tag
Feature: User Clicking on different button for opening different types of tabs
  I want to use this template for my feature file

  @tag1
  Scenario: Verify user able to click on different kinds of tabs
    Given User is on "https://demoqa.com/browser-windows" page
    When User click on New Tab 
    And User close the newly opened tab
    And User opened the new Window
    And User close the newly opened window
    And User click on New Window Message 
    Then Close the New Window Message 
