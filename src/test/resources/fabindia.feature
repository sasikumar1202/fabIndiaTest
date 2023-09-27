Feature: FabIndia Application Test

  @fp
  Scenario Outline: Login details
    Given user should navigate to the application
    And user should move to login dropdown and click Log-in
    And user should click the Email Radio Button
    And user should enter the username "<email>"
    And user should enter the passkey "<password>"
    Then user should click the login button

    Examples: 
      | email                   | password |
      | velusasi.1202@gmail.com | ruby30@K |

  @kp
  Scenario Outline: Kids Page
    Given user should click the kids section
    And user should click the boys ethnic wear section in the below dropdown
    And user should click the size and select 
    And user should click the category and select "<dress>"
    

    Examples: 
      | dress      |
      | Kurta Sets | 
