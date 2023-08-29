Feature: Student Registration Form
  As a student 
  I want to register inside Portal 
  So I can register myself

  @UIQA
  Scenario Outline: Verify Student Register form
    Given User is on "https://demoqa.com/automation-practice-form" page
    When User enters firstNme as "Vaibhav", Last name as "Saini" and email as "Vaibhavsaini@gmail.com"
    And User click on gender as "Male"
    And Enter Mobile number as "9999999999"
    And User Enters Subject as "<Subject>" , Hobbies as "<Hobbies>", Select Date and address as "<Address>"
    And Upload the picture
    And Select state as "Uttar Pradesh" and city as "Merrut"
    And Click on the submit button
    Then User should register successfully into the portal

    Examples: 
      | Subject |  | Hobbies |  | Address |
      | Maths   |  | Sports  |  | Mohali  |
