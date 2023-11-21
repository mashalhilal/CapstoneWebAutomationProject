#feature
#Scenario
#Given
#When
#And
#Then




Feature: Admin Area Demo Login Page

  Scenario: Login into account

    Given User is navigating to "https://admin-demo.nopcommerce.com/"
    When User is adding "Email" and "Password"
    And User is clicking on "Login" button
    Then User is logged into Admin Application

