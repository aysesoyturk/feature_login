Feature: Login feature

  Background:
    Given As a User on the login page of the website

  Scenario  As an HR user Successful login

    When As an HR user enter "<hr_username>" as login
    And As an HR user enter "<password>" as password
    And As an HR user click on the login button
    Then As an HR user, the CRM home page should be displayed

  Scenario As an HR user Unsuccessful login
    When As an HR user enter "<wrong_username>" as login
    And As an HR user enter "<password>" as password
    And As an HR user click on the login button
    Then As an HR user should see the error message "Incorrect login or password"

  Scenario As an HR user  Unsuccessful login
    When As an HR user enter "<hr_username>" as login
    And As an HR user enter "<wrong_password>" as password
    And As an HR user click on the login button
    Then As an HR user should see the error message "Incorrect login or password"

